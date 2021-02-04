/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

import java.util.Scanner;

/**
 *
 * @author PAVILLION
 * Este algoritmo lista todas las permutaciones de {1,2,3,..,n} en orden lexicografico creciente
 */
public class Permutacion {
    
    
    public Permutacion(int n) {
       
            int mat [] = new int [n];
           
            for(int i=0; i < n; i++){
                mat[i] = i+1;
                System.out.print(mat[i] + " ");
                
                for (i=1;i< factorial(n);i++){
                    
                }
            }
        
        
        
    }
public int factorial (double numero) {
    if (numero==0){
        return 1;
    }else{
        return (int) (numero * factorial(numero-1));
    }
}
}

