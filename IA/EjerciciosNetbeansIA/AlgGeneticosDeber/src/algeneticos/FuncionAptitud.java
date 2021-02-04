
package algeneticos;

import static java.lang.Math.abs;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class FuncionAptitud extends FitnessFunction {
    
    @Override
    protected double evaluate(IChromosome ic) { //Cromosomas(conjunto de genes) del individuo, me devuelve un double que es el puntaje del individuo
    double score =0;
    double min = funcion(64, 64);
    double max = funcionIn(64,64);
    //double sd = funcion2(64, 63);
    
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
    Integer g11 = (Integer)ic.getGene(10).getAllele();
    Integer g12 = (Integer)ic.getGene(11).getAllele();
    Integer g13 = (Integer)ic.getGene(12).getAllele();
    Integer g14 = (Integer)ic.getGene(13).getAllele();
    
    String x = g2.toString()+g3.toString()+g4.toString()+g5.toString()+g6.toString()+g7.toString();
    String y = g9.toString()+g10.toString()+g11.toString()+g12.toString()+g13.toString() +g14.toString();
    
    int valorX=Integer.parseInt(x,2);
    int valorY=Integer.parseInt(y,2);
    
    if (g1==0) {
        valorY=-valorY;
    }
    if (g8==0) {
        valorY=-valorY;
    }
    //score=sc - funcion(valorX, valorY); //no puede devolver valores negativos
   score=abs(min - funcion(valorX, valorY)); //no puede devolver valores negativos
   // score=abs(max - funcionIn(valorX, valorY));
    return score;
    }
public double funcion(int x, int y){
    return Math.pow(Math.pow(x,3)+ Math.pow(y,3),1.0/3.0);
}

public double funcionIn(int x, int y){
    return Math.pow(Math.pow(Math.abs(y),3)- Math.pow(Math.abs(x),3),1.0/3.0);
}
// public double funcion2(int x, int y){
//    return (Math.pow(x,2)- Math.pow(y,2))/(x*y);
//}
//80.63494719327187
}
