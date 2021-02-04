/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;


import java.util.Scanner;
public class Palindromo {
public static void main(String[] args) {
         int n = 0;
        String x = "";
 
        // (Según la especificación del problema, no se debe "avisar")
        // System.out.println("Introduzca Numero:");
 
        Scanner entrada = new Scanner(System.in);
 
        n = Integer.parseInt(entrada.next());
        for(int i=n;i<2000000;i++){
           if(EsPalindromo(i)){
              if(EsPrimo(i)) {
                 System.out.println(i); 
                 break;
              }
           }
        }
    }
 
    static boolean EsPalindromo(int px) {
        int nn = px; 
        String cadena_a= Integer.toString(nn);
        String cadena_b = "";
        int tam = cadena_a.trim().length()-1;
        for(int j=tam;j >= 0;j--) {
            cadena_b = cadena_b + cadena_a.charAt(j);
        }
        if (cadena_a.equals(cadena_b))
            return true;
        else
            return false;
    }
 
    static boolean EsPrimo(int pn){
        int j = 0;
        for(int i = 1;i<=pn;i++) {
 
           if((pn % i) == 0) {
               j +=1;
           }
           if(j>2) {
               return false;
           }
        }
        return true;
    }
    
}




 