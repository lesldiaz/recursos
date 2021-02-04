/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Scanner;
import static ordenacion.quicksort.quicksort;

/**
 *
 * @author PAVILLION
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Arreglo a Utilizar");
        int[] num ={5,3,1,6,4,7,2};
        System.out.print("|");
        for (int i = 0; i < num.length ; i++) {
            int nro = num[i];
            System.out.print(" "+ nro);
            System.out.print(" |");
        }
        
        System.out.println("\nIngrese la posicion del pivote (comienza en 0):");
        int pivote = Integer.parseInt(sc.nextLine());
        int der = num.length-1;
        int [] arreglo= quicksort(num, pivote,der);
        System.out.println("Arreglo Ordenado");
        System.out.print("|");
        for (int i = 0; i < arreglo.length ; i++) {
            int nro = num[i];
            System.out.print(" "+ nro);
            System.out.print(" |");
        }
    }
    
}
