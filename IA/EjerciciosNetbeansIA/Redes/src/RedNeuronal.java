
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.Prediction;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.misc.SerializedClassifier;
import weka.core.Debug;
import weka.core.Instances;
import weka.core.Utils;
/**
 *
 * @author prryprk
 */
public class RedNeuronal {
    public void entrenarModelo(String paramAN){
        try {
            FileReader trainreader = new FileReader("src"+File.separatorChar+"datos"+File.separatorChar+"iristrain.arff");
            //instancias
            Instances train = new Instances(trainreader);
            train.setClassIndex(train.numAttributes()-1);
            
            //construir preceptron multicapa
            MultilayerPerceptron mlp = new MultilayerPerceptron();
            mlp.setOptions(Utils.splitOptions(paramAN));
            mlp.buildClassifier(train); //aqui entrena y ajusta pesos y esas cosas
            Debug.saveToFile("src"+File.separatorChar+"datos"+File.separatorChar+"modeloEntrenado.train", mlp);
            //serializar archivo
            SerializedClassifier clasificador = new SerializedClassifier();
            clasificador.setModelFile(new File("src"+File.separatorChar+"datos"+File.separatorChar+"modeloEntrenado.train"));
            
            //evaluar modelo
            Evaluation ev = new Evaluation(train);
            ev.evaluateModel(clasificador, train);
            System.out.println(ev.toSummaryString());
            System.out.println(ev.toMatrixString("Resultados Matriz"));
            
            trainreader.close();
            
        } catch (IOException ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void testearModelo(String paramAN){
        try {
            FileReader testreader = new FileReader("src"+File.separatorChar+"datos"+File.separatorChar+"iristest.arff");
            //instancias
            Instances test = new Instances(testreader);
            test.setClassIndex(test.numAttributes()-1);
            //serializar archivo
            SerializedClassifier clasificador = new SerializedClassifier();
            clasificador.setModelFile(new File("src"+File.separatorChar+"datos"+File.separatorChar+"modeloEntrenado.train"));
            Classifier mlp = clasificador.getCurrentModel();
            Evaluation evalTest = new Evaluation(test);
            evalTest.evaluateModel(mlp, test);
            System.out.println(evalTest.toSummaryString());
            System.out.println(evalTest.toMatrixString("Resultados Matriz"));
            testreader.close();  
        } catch (IOException ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public double prediccionModelo(){
         try {
            double value = 0;
            FileReader testreader = new FileReader("src"+File.separatorChar+"datos"+File.separatorChar+"irisPredic.arff");
            //instancias
            Instances test = new Instances(testreader);
            test.setClassIndex(test.numAttributes()-1);
            //serializar archivo
            SerializedClassifier clasificador = new SerializedClassifier();
            clasificador.setModelFile(new File("src"+File.separatorChar+"datos"+File.separatorChar+"modeloEntrenado.train"));
            Classifier mlp = clasificador.getCurrentModel();
            Evaluation evalTest = new Evaluation(test);
            evalTest.evaluateModel(mlp, test);
            ArrayList<Prediction> listpredic = evalTest.predictions();
            for (Iterator<Prediction> iterator = listpredic.iterator(); iterator.hasNext();) {
                 Prediction next = iterator.next();
                 value = next.predicted();
                  //System.out.println(next.actual());
             }
            testreader.close(); 
            return value;
        } catch (IOException ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
        } catch (Exception ex) {
            Logger.getLogger(RedNeuronal.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
        }
   
    }
    public static void main(String[] args) {
        RedNeuronal rn = new RedNeuronal();
       // rn.entrenarModelo("-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a");
        rn.testearModelo("-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a");
        rn.prediccionModelo();
    }
    
}

