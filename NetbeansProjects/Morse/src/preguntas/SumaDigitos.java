/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leslie Diaz
 */
public class SumaDigitos {
ArrayList <String> listaaux1 = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> listanum = new ArrayList<>();
        System.out.println("Ingrese el número a sumar");
        String numero= sc.nextLine();
        try{ 
            int numero1;
        
        for(int i = 0; i<numero.length();i++){
            if(listanum.isEmpty()){
            numero1 = Integer.parseInt(String.valueOf(numero.charAt(i)));
            listanum.add(numero1);
            }else{
              numero1 = Integer.parseInt(String.valueOf(numero.charAt(i)));
                listanum.add(numero1); 
            }
        }
        
        Integer valor = 0;
        for (int i = 0; i < listanum.size(); i++) {
            Integer numero2 = listanum.get(i);
            Integer ultimo = listanum.get(listanum.size()-1);
            valor = valor + numero2;
            System.out.print(numero2 + " + ");
        }
        System.out.println("= " + valor);  
      }
    catch(Exception e){
            System.out.println("Error");
            main(args);
    }
  }
}
    
   
