/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Scanner;

public class BusquedaBinaria {

    /*
    @return posicion del elemento buscado, en caso de no existir retorna -1
     */

    public static int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public static int busquedaBinaria2(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato > vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public static void imprimirvector(int[] vector) {
        System.out.println("Array generado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]: " + vector[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int array = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese 0 para orden descendente o 1 para orden ascendente: ");
        int orden = Integer.parseInt(sc.nextLine());
       
        if (orden == 0) {
            System.out.println("Array con orden descendente");
            int[] vector1 = {4, 3, 2, 1};
            imprimirvector(vector1);
            System.out.println("Ingrese el valor a buscar: ");
            int valorBuscado1 = Integer.parseInt(sc.nextLine());
            int pos1 = busquedaBinaria2(vector1, valorBuscado1);
            if (pos1 != -1) {
                System.out.println("El elemento " + valorBuscado1 + " fue encontrado en la posicion: " + pos1);
            } else {
                System.out.println("El dato no se encuentra en el arreglo, o el arreglo no esta ordenado.");
            }

        } else if (orden == 1) {
            System.out.println("Array con orden ascendente");
            int[] vector = new int[array];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = i * 2;
            }
            imprimirvector(vector);
            System.out.println("Ingrese el valor a buscar: ");
            int valorBuscado = Integer.parseInt(sc.nextLine());
            int pos = busquedaBinaria(vector, valorBuscado);
            if (pos != -1) {
                System.out.println("El elemento " + valorBuscado + " fue encontrado en la posicion: " + pos);
            } else {
                System.out.println("El dato no se encuentra en el arreglo, o el arreglo no esta ordenado.");
            }
        }

    }

}
