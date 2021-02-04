
//Algoritmos Genéticos
package algeneticos;

import static java.lang.Double.NaN;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class Configuracion {
private static final int POBLACION = 10;
private static final int ITERACIONES = 30; //Generaciones
private MostrarIndividuos mi = new MostrarIndividuos();
    public void configuracion() {
        try { 
            Configuration conf = new DefaultConfiguration(); //seleccion de padres aleatorios, cruce por un punto, una mutacion.--> Es Randomico
            FitnessFunction funcionAptitud = new FuncionAptitud();
            conf.setFitnessFunction(funcionAptitud); //Se fija la funcion de aptitud a la configuracion
            Gene[]ejemp = genesEjemplo(conf);
            Chromosome cromosoma = new Chromosome(conf,ejemp);
            //Indicar como sera el cromosoma
            conf.setSampleChromosome(cromosoma); //define tus cromosomas (longitud?)
            //fijamos valor de poblacion inicial
            conf.setPopulationSize(POBLACION);
            //inicializar poblacion
            Genotype poblacion = Genotype.randomInitialGenotype(conf); //genera a mis 5 individuo de manera aleatoria (mis genes toman valores de 1 o 0)
            iteraciones(poblacion);
            
            
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private Gene[] genesEjemplo (Configuration confg){
       Gene[] ejemplo = new Gene[14]; // la longitud depende del problema al que quiero llegar Ejem: X2 + Y2, depende del dominio |Signo|x|x|x|x|Signo|y|y|y|y|
        try {
            
            for (int i = 0; i < ejemplo.length; i++) {
                ejemplo[i]= new IntegerGene(confg, 0, 1); // el gen en la primera posicion va a tomar valores entre 0 y 1 (binarios),
                //no es aconsejable usar un double porque el margen de iteraciones podria ser grande porque tiene mas decimales
            }
             
            return ejemplo;
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    //  return ejemplo;
     return ejemplo;
    } 
    
    private void iteraciones(Genotype pob){
        int gen = 0;
        for (int i = 0; i < ITERACIONES; i++) {
            System.out.println("Generación " + i);
            mi.mostrarIndividuos(pob.getChromosomes());//mostrar el cromosoma;
            pob.evolve();
            System.out.print("Mejor individuo de la generacion "+i+" : ");
            mi.mostrarIndividuo(pob.getFittestChromosome()); //obtencon al mejor individuo evolucionado en la generacion i   //mostrar
            
        }
        
       System.out.println("El mejor es: "+
       pob.getFittestChromosome().getFitnessValue()); //muestro el valor del individuo
       mi.mostrarIndividuo(pob.getFittestChromosome()); //muestro al individuo con la conversion de binario a decimales
        
    }
  
}
