
package algeneticos;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class FuncionAptitud extends FitnessFunction {

    @Override
    protected double evaluate(IChromosome ic) { //Cromosomas(conjunto de genes) del individuo, me devuelve un double que es el puntaje del individuo
    double score =0;
    Integer g1 = (Integer)ic.getGene(0).getAllele();
    Integer g2 = (Integer)ic.getGene(1).getAllele();
    Integer g3 = (Integer)ic.getGene(2).getAllele();
    Integer g4 = (Integer)ic.getGene(3).getAllele();
    Integer g5 = (Integer)ic.getGene(4).getAllele();
    Integer g6 = (Integer)ic.getGene(5).getAllele();
    Integer g7 = (Integer)ic.getGene(6).getAllele();
    Integer g8 = (Integer)ic.getGene(7).getAllele();
    Integer g9 = (Integer)ic.getGene(8).getAllele();
    Integer g10 = (Integer)ic.getGene(9).getAllele();
    String x = g2.toString()+g3.toString()+g4.toString()+g5.toString();
    String y = g7.toString()+g8.toString()+g9.toString()+g10.toString();
    int valorX=Integer.parseInt(x,2);
    int valorY=Integer.parseInt(y,2);
    if (g1==0){
        valorX=-valorX;
    }
    if (g6==0) {
        valorY=-valorY;
    }
    score=450 - ((valorX*valorX) + (valorY*valorY)); //no puede devolver valores negativos
    return score;
    }
}