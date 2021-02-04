
package genes;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jgap.*;
import org.jgap.Configuration;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class Configuracion {
    private Configuration conf;
    private FuncionAptitud fa  =null;
    private List<Computadora> listcomp = new ArrayList<>();
    private List<String> opciones = new ArrayList<>();
    private static final int NUM_EV =10;
    private static final int NUM_IT =10;
    private static final int POBLACIONINICIAL =10;
    private Chromosome comCromosoma = null;
    
    public void inicializar(List<Computadora> listcomp,List<String> opciones){
        try {
            this.listcomp=listcomp;
            this.opciones=opciones;
            conf = new DefaultConfiguration();
            conf.setPopulationSize(POBLACIONINICIAL);
            fa = new FuncionAptitud(listcomp, opciones);
            conf.setFitnessFunction(fa);
            //sirve para optener los mejores el mejor 1 los mejores varios ejem 2
            Gene[] comGenes = new Gene[1];
            
            comGenes[0]=new IntegerGene(conf, 0, listcomp.size());
            //comGenes[1]=new IntegerGene(conf, 0, listcomp.size());
            //comGenes[2]=new IntegerGene(conf, 0, listcomp.size()); si quisiera tener mas mejores
            comGenes[0].setAllele(0);
            //comGenes[1].setAllele(1);
            //comGenes[2].setAllele(2);
            comCromosoma = new Chromosome(conf, comGenes);
            conf.setSampleChromosome(comCromosoma);
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public IChromosome evolucion(){
        try {
            Genotype population = Genotype.randomInitialGenotype(conf);
            IChromosome mejorsolu = comCromosoma;
            for (int i = 0; i < NUM_IT; i++) {
                population.evolve();//NUM_EV
                IChromosome candidato = population.getFittestChromosome();
                if (candidato.getFitnessValue()>mejorsolu.getFitnessValue()){
                  mejorsolu=candidato;
                }
            }
            imprimir(mejorsolu);
            return mejorsolu;
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
    public  void imprimir(IChromosome ic){
        System.out.println("--------Las mejores computadoras----------");
        for (int i = 0; i < ic.size(); i++) {
            Computadora c =listcomp.get((Integer)ic.getGene(i).getAllele());
            System.out.println(c.toString());
        }
    }
}
