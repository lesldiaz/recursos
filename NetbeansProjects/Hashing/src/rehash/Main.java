/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehash;

import hash.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la tabla: ");
        int size = Integer.parseInt(sc.nextLine());
        String[] elementos = new String[size];
        ingElementos(size, elementos, 0);

    }

    public static void ingElementos(int size, String[] elementos, int contador) {
        Scanner sc = new Scanner(System.in);
        Hashing hash = new Hashing(size);
        while (contador < size) {
            System.out.print("Ingrese el elemento a guardar: ");
            elementos[contador] = sc.nextLine();
            contador++;
        }
        if (contador == size) {
            System.out.println("Desea guardar mas elementos?: SI o NO");
            String val = sc.nextLine();
            if (val.equals("SI") || val.equals("si")) {
                String[] dup = new String[size * 2];
                for (int i = 0; i < elementos.length; i++) {
                    String elemento = elementos[i];
                    dup[i] = elemento;
                }
                ingElementos(size * 2, dup, elementos.length);
            } else if (val.equals("NO") || val.equals("no")) {
                hash.funHash(elementos, hash.arreglo);
                hash.mostrarTabla();
            } else {
                System.out.println("El valor ingresado es incorrecto");
                hash.funHash(elementos, hash.arreglo);
                hash.mostrarTabla();
            }
        }
    }

}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese el elemento a buscar: ");
//        String buscado = hash.busClave(sc.nextLine());
//        if (buscado==null){
//            System.out.println("El elemento buscado no se encuentra en la tabla");
//        }
