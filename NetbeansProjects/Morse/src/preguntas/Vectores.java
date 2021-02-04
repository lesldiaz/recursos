/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.*;

public class Vectores {

   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listavector1 = new ArrayList<>();
        List<Integer> listavector2 = new ArrayList<>();
        int intentos = 0;
        do {
            System.out.println("Ingrese el numero de intentos: ");
            try {
                String intento = String.valueOf(sc.nextInt());
                intentos = Integer.parseInt(intento);
            } catch (Exception e) {
                System.err.println("Error, ingrese solo numeros \n");
                main(args);
            }
        } while (intentos <= 0);
            for (int l = 0; l < intentos; l++) {
            System.out.println("Ingrese la dimension de los vectores");
            int dimension = 0;
            try {
                String dimen = String.valueOf(sc.nextInt());
                String add = sc.nextLine();
                dimension = Integer.parseInt(dimen);
                if (dimension == 0) {
                    System.err.println("Vector no valido");
                } else {
                    String[] vectores = new String[2];
                    String[] elementos = new String[dimension];
                    for (int a = 1; a < 3; a++) {
                        System.out.println("Ingrese el vector " + a);
                        String vector = sc.nextLine();
                        String [] elementosaux = vector.split(" ");
                       
                            if (elementosaux.length > elementos.length) {
                            System.err.println("Excedio el numero de dimension, ingreselo nuevamente");
                            vector = sc.nextLine();
                        }else{
                            vectores[a-1]=vector;
                        }
                    }
                   
                        String vector1 = vectores[0];
                        String [] elementos1 = vector1.split(" ");
                        String vector2  = vectores[1];
                        String [] elementos2 = vector2.split(" ");
                        
                    for (int d = 0; d < elementos1.length; d++) {
                        String element1 = elementos1[d];
                        int elemento1 = 0;
                        try{
                           elemento1 = Integer.parseInt(element1);
                           listavector1.add(elemento1);
                        }catch(Exception e){
                            System.err.println("Error, ingrese solo numeros");
                            System.exit(0);
                        }
                    }
                    
                    for (int e = 0; e < elementos2.length; e++) {
                        String element2 = elementos2[e];
                        int elemento2 = 0;
                        try{
                           elemento2 = Integer.parseInt(element2);
                           listavector2.add(elemento2);
                        }catch(Exception ex){
                            System.err.println("Error, ingrese solo numeros");
                            System.exit(0);
                        }
                    }
        
                    Collections.sort(listavector1);
                    Collections.sort(listavector2);
        
                   
                    
                   List < Integer> listaaux = new ArrayList <>();
                    for (int i = listavector2.size()-1; i >= 0; i--) {
                        int numer = listavector2.get(i);
                        listaaux.add(numer);
                    }
                    
                   int resultado = 0;
                    for (int f = 0; f < listavector1.size(); f++) {
                       int numeroaux1 = listavector1.get(f);
                       int numeroaux2 = listaaux.get(f);
                            
                        resultado = resultado + numeroaux1*numeroaux2;
                        
                    } 
                    
                System.out.println("Caso # " + (l+1) + " = " + resultado);
                }
                
            }catch(Exception e){
                    System.err.println("Error");
             }

            }
        }


            
    
   
    
}
