/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genes;

import java.util.*;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

/**
 *
 * @author PAVILLION
 */
public class FuncionAptitud extends FitnessFunction{
List <Computadora> listcom = new ArrayList<>();
List<String> opciones = new ArrayList<>();
   

    public FuncionAptitud(List <Computadora> listcom,List<String> opciones) {
        this.listcom=listcom;
        this.opciones=opciones;
    }
    
     @Override
    protected double evaluate(IChromosome ic) { //el cromosoma seria la lista de computadoras
        double score =0;
        double scaux =0;
         
         for (int i = 0; i < ic.size(); i++) {
            Computadora c = listcom.get((Integer)ic.getGene(i).getAllele());
            score = getScore(c);
             if (score>scaux) {
                 scaux=score;
             }
            
         }
    return score;
    }
    
    private double getScore(Computadora c){
        double score =0;
        
       Iterator ite = opciones.iterator();
       int v=0;
        while (ite.hasNext()) {
            String op = ""+ite.next();
            switch (v){
                case 0:
                    if(c.getVelocidadProcesador()>=Double.parseDouble(op)){
                        score =score + 90;
                    }else{
                        score =score + 10;
                    }
                    v++;
                  break;
                case 1:
                    if(c.getGeneracion()>=Integer.parseInt(op)){
                        score =score + 40;
                    }else{
                        score =score + 9;
                    }
                    v++;
                  break;
                case 2:
                    if(c.getNumCores()>=Integer.parseInt(op)){
                        score =score + 35;
                    }else{
                        score =score + 15;
                    }
                    v++;
                  break;
                case 3:
                    int valc,valo;
                    if(c.isSopx64()){
                        valc=1;
                    }else{
                        valc=0;
                    }
                    if(Boolean.parseBoolean(op)){
                        valo=1;
                    }else{
                        valo=0;
                    }
                    if(valc==valo){
                        score =score + 20;
                    }else{
                        score =score + 0;
                    }
                    v++;
                  break;
                case 4:
                    if(c.getCacheLevel()>=Integer.parseInt(op)){
                        score =score + 28;
                    }else{
                        score =score + 8;
                    }
                    v++;
                  break;
                case 5:
                    if(c.getMarca().equals(op)){
                        score =score + 30;
                    }else{
                        score =score + 10;
                    }
                    v++;
                  break;
                case 6:
                    if(c.getCap_memoria()>=Integer.parseInt(op)){
                        score =score + 80;
                    }else{
                        score =score + 20;
                    }
                    v++;
                  break;
                case 7:
                    if(c.getFrecuencia()>=Double.parseDouble(op)){
                        score =score + 32;
                    }else{
                        score =score + 9;
                    }
                    v++;
                  break;
                case 8:
                    if(c.getDdr()>=Integer.parseInt(op)){
                        score =score + 20;
                    }else{
                        score =score + 1;
                    }
                    v++;
                  break;
                case 9:
                    if(c.getTipo_dis().equals(op)){
                        score =score + 10;
                    }else{
                        score =score + 0;
                    }
                    v++;
                  break;
                case 10:
                    if(c.getCap_disco()>=Integer.parseInt(op)){
                        score =score + 87;
                    }else{
                        score =score + 13;
                    }
                    v++;
                  break;
                case 11:
                    int valc1,valo1;
                    if(c.isExisteGPU()){
                        valc1=1;
                    }else{
                        valc1=0;
                    }
                    if(Boolean.parseBoolean(op)){
                        valo1=1;
                    }else{
                        valo1=0;
                    }
                    if(valc1==valo1){
                        score =score + 70;
                    }else{
                        score =score + 13;
                    }
                    v++;
                  break;
                case 12:
                    if(c.getVram()>=Integer.parseInt(op)){
                        score =score + 36;
                    }else{
                        score =score + 5;
                    }
                    v++;
                  break;
                case 13:
                    if(c.getModeloGPU().equals(op)){
                        score =score + 10;
                    }else{
                        score =score + 5;
                    }
                    v++;
                  break;
                default:
                    break;
            }
            //las reglas
        }
        return score;
    }
    
}
