package redes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openmarkov.core.exception.IncompatibleEvidenceException;
import org.openmarkov.core.exception.InvalidStateException;
import org.openmarkov.core.exception.NotEvaluableNetworkException;
import org.openmarkov.core.exception.ParserException;
import org.openmarkov.core.exception.ProbNodeNotFoundException;
import org.openmarkov.core.exception.UnexpectedInferenceException;
import org.openmarkov.core.inference.InferenceAlgorithm;
import org.openmarkov.core.model.network.EvidenceCase;
import org.openmarkov.core.model.network.Finding;
import org.openmarkov.core.model.network.ProbNet;
import org.openmarkov.core.model.network.Util;
import org.openmarkov.core.model.network.Variable;
import org.openmarkov.core.model.network.potential.TablePotential;
import org.openmarkov.inference.variableElimination.VariableElimination;
import org.openmarkov.io.probmodel.PGMXReader;

public class RedBayes {
    ProbNet red;
    public void iniciar() {
        try {
            InputStream file = new FileInputStream(new File("src/datos/bayes_seguridad.pgmx"));
            PGMXReader pGMXReader = new PGMXReader();
            red = pGMXReader.loadProbNet(file, "Seguridad").getProbNet();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double[] predecir(String banda,String mem, String cpu, String bandera){
        try {
            EvidenceCase evidence = new EvidenceCase();
            InferenceAlgorithm variableEliminacion = new VariableElimination(red);
            variableEliminacion.setPreResolutionEvidence(evidence);//priori
            //variables 
            Variable g = red.getVariable("SYNFLOOD");
            Variable h = red.getVariable("NORMAL");
            Variable i = red.getVariable("SLOWLORISHTTPDOS");
            ArrayList<Variable> variablesdeInteres = new ArrayList<>();
            variablesdeInteres.add(g);
            variablesdeInteres.add(h);
            variablesdeInteres.add(i);
            
            
            HashMap<Variable, TablePotential> posteriorProbabilidad = variableEliminacion.getProbsAndUtilities();
            
            evidence.addFinding(red, "ancho_banda", banda);
            evidence.addFinding(red, "memoria", mem);
            evidence.addFinding(red, "cpu", cpu);
            evidence.addFinding(red, "flags_syn",bandera);

//            variableEliminacion.setPreResolutionEvidence(evidence);//posteriori
            return mostrarResultados(evidence, variablesdeInteres, posteriorProbabilidad);
        } catch (NotEvaluableNetworkException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProbNodeNotFoundException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IncompatibleEvidenceException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnexpectedInferenceException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidStateException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public double[] mostrarResultados(EvidenceCase evidence, ArrayList<Variable> variablesdeInteres, HashMap<Variable, TablePotential> posteriorProbabilidad) {
        double [] proba = new double [variablesdeInteres.size()];
        System.out.println("variablesdeInteres.size() "+variablesdeInteres.size());
        String evidenciastxt = "Evidencias: \n";
        for (Finding finding : evidence.getFindings()) {
            //finding.getVariable();
            //finding.getState();
            evidenciastxt += (finding.getVariable() + finding.getState() + " \n");
        }
        System.out.println(evidenciastxt);
        //variables de interes
        for (int i = 0; i < variablesdeInteres.size(); i++) {
            Variable variable = variablesdeInteres.get(i);
            TablePotential posteriTablePotencial = posteriorProbabilidad.get(variable);
        try {
            double valor = posteriTablePotencial.values[variable.getStateIndex("yes")];
            System.err.println("zsfd"+valor);
            String resultado = Util.roundedString(valor, "0.001");
            proba[i]=Double.parseDouble(resultado);
            System.out.println("Resultado "+i+": " + resultado);
            
        } catch (InvalidStateException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return proba;
    }

    public static void main(String[] args) {
        RedBayes rb = new RedBayes();
        rb.iniciar();
        rb.predecir("high", "medium", "high", "no");
        rb.predecir("high", "medium", "high", "yes");
        rb.predecir("high", "high", "high", "no");
    }
}
