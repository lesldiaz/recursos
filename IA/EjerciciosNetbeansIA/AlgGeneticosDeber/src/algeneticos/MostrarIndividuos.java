/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algeneticos;

import org.jgap.IChromosome;

/**
 *
 * @author PAVILLION
 */
public class MostrarIndividuos {
Integer g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
    public void mostrarIndividuo( IChromosome ic) {
        
        g1= (Integer)ic.getGene(0).getAllele(); //obtener el objeto del gen
        g2= (Integer)ic.getGene(1).getAllele(); //obtener el objeto del gen
        g3= (Integer)ic.getGene(2).getAllele(); //obtener el objeto del gen
        g4= (Integer)ic.getGene(3).getAllele(); //obtener el objeto del gen
        g5= (Integer)ic.getGene(4).getAllele(); //obtener el objeto del gen
        g6= (Integer)ic.getGene(5).getAllele(); //obtener el objeto del gen
        g7= (Integer)ic.getGene(6).getAllele(); //obtener el objeto del gen
        g8= (Integer)ic.getGene(7).getAllele(); //obtener el objeto del gen
        g9= (Integer)ic.getGene(8).getAllele(); //obtener el objeto del gen
        g10= (Integer)ic.getGene(9).getAllele(); //obtener el objeto del gen
        g11= (Integer)ic.getGene(10).getAllele(); //obtener el objeto del gen
        g12= (Integer)ic.getGene(11).getAllele(); //obtener el objeto del gen
        g13= (Integer)ic.getGene(12).getAllele(); //obtener el objeto del gen
        g14= (Integer)ic.getGene(13).getAllele(); //obtener el objeto del gen
        
        String sigY,sigX;
        if (g1==0){ //negativo
            sigX="-";
        }else{
            sigX="+";
        }
        if (g8==0){ //negativo
            sigY="-";
        }else{
            sigY="+";
        } 
        
        //x^3´-2x + 8
        
    String x = g2.toString()+g3.toString()+g4.toString()+ g5.toString()+g6.toString()+g7.toString();
    String y = g9.toString()+g10.toString()+g11.toString()+g12.toString()+g13.toString()+g14.toString();
    int valorX=Integer.parseInt(x,2);
    int valorY=Integer.parseInt(y,2);
        System.out.println(sigX+valorX+" ; "+sigY+valorY);
    }
     public void mostrarIndividuos(IChromosome[] ics){
         for (IChromosome ic : ics) {
             mostrarIndividuo(ic);
         }
     }
}
