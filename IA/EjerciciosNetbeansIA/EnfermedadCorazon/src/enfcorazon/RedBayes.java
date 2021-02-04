package enfcorazon;

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

    public void iniciar() {
        try {
            //leer archivo
            InputStream file = new FileInputStream(new File("src/enfcorazon/probcorazon.pgmx"));
            //cargar
            PGMXReader pGMXReader = new PGMXReader();
            ProbNet red = pGMXReader.loadProbNet(file,"Enfermedad del Corazon").getProbNet();
            //evidencias
            EvidenceCase evidence = new EvidenceCase();
            //algoritmo de inferencia
            InferenceAlgorithm variableEliminacion = new VariableElimination(red);
            variableEliminacion.setPreResolutionEvidence(evidence);//priori

            //variables 
            Variable gripe = red.getVariable("Enfermedad del Corazon");
            ArrayList<Variable> variablesdeInteres = new ArrayList<>();
            variablesdeInteres.add(gripe);

            //posterior probabilites
            HashMap<Variable, TablePotential> posteriorProbabilidad = variableEliminacion.getProbsAndUtilities();
            
            evidence.addFinding(red, "Ejercicio", "mucho");
            evidence.addFinding(red, "Presion Arterial", "normal");
            evidence.addFinding(red, "Dieta", "Saludable");
            evidence.addFinding(red, "Dolor de Pecho", "ausente");
            
//            variableEliminacion.setPreResolutionEvidence(evidence);//posteriori
            mostrarResultados(evidence, variablesdeInteres, posteriorProbabilidad);
            //Imprimir resultados
            //*************
            //cambiar variables o evidencias

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
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
    }

    public void mostrarResultados(EvidenceCase evidence, ArrayList<Variable> variablesdeInteres, HashMap<Variable, TablePotential> posteriorProbabilidad) {
        String evidenciastxt = "Evidencias: \n";
        for (Finding finding : evidence.getFindings()) {
            //finding.getVariable();
            //finding.getState();
            evidenciastxt += (finding.getVariable() + finding.getState() + " \n");
        }
        System.out.println(evidenciastxt);
        //variables de interes
        Variable variable = variablesdeInteres.get(0);
        TablePotential posteriTablePotencial = posteriorProbabilidad.get(variable);
        try {
            double valor = posteriTablePotencial.values[variable.getStateIndex("presente")];
            String resultado = Util.roundedString(valor, "0.001");
            System.out.println("Res: " + resultado);
        } catch (InvalidStateException ex) {
            Logger.getLogger(RedBayes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new RedBayes().iniciar();
    }
}
