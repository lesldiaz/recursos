/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumaDificil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> listaaux = new ArrayList <> ();
        System.out.println("Ingrese el numero de lineas que va a escribir");
        int linea = 0;
        do{
            try{
                 linea = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Ingrese numeros");
            }
        }while (linea <=0 );
            for (int i = 1 ; i < linea + 1; i++) {
                System.out.println("Ingrese la " + i + " linea");
                try{
                   String numeros = sc.nextLine();
                    StringTokenizer st = new StringTokenizer(numeros);
                    
                    for (; st.hasMoreTokens();) {
                        String token = st.nextToken();
                        listaaux.add(token);
                    }
                     
                for (int j = 0; j < listaaux.size(); j++) {
                       if (listaaux.get(j).equals(" ")){
                            listaaux.remove(j);
                        }
                }
                Integer suma=0;
                for(int k =0; k<listaaux.size(); k++){
                    Integer num = Integer.parseInt(listaaux.get(k));
                    suma += num;
                   
                }
                System.out.println("Resultado: " + suma);
                 }catch(Exception e){
                    System.out.println("Error");
                }  
               
                
        }
        
    }
    
}
