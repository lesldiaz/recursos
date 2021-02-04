/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.Scanner;

/**
 *
 * @author Leslie Diaz
 */
public class Principal {

  
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el numero de lineas a escribir. Maximo 5 lineas ");
//        int lineas = 0;
//        do{ 
//            try{
//                lineas = Integer.parseInt(sc.nextLine());
//                    if (lineas>6){
//                        System.err.println("No exceda el limite de lineas. LINEAS POR DEFECTO : 1");
//                        lineas = 1;
//                    } 
//            }catch(NumberFormatException e){
//                   System.err.println("Ingrese solo numeros \n");
//                   main(args);
//                }
//        }while(lineas<=0);
//        System.out.println("Ingrese su parrafo");
//        String [] oraciones = new String [lineas];
//        for (int i = 0; i < lineas; i++) {
//            String oracion = sc.nextLine();
//            oraciones [i] = oracion;
//        }
//        new Parrafo(oraciones).mayusPalabra();
          new Parrafo().mayusPalabra("leslie",0);
          
    }
   
}
