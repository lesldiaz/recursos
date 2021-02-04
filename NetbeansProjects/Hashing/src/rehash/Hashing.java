/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehash;

import hash.*;
import java.util.Arrays;

public class Hashing {

    String[] arreglo;
    int size, contador;
    Arbol arbol = new Arbol();

    public Hashing(int size) {
        arreglo = new String[size];
        this.size = size;
        Arrays.fill(arreglo, "-1"); //arreglo llenado con -1 (significa que esta vacio)
    }

    public void funHash(String[] cadarreglo, String[] arreglo) {
        for (int i = 0; i < cadarreglo.length; i++) {
            String elemento = cadarreglo[i];
            int indice = Integer.parseInt(elemento) % (size);
            if (arreglo[indice] != "-1") {
                if (arreglo[indice].equals("A")) {
                    int nuevo = Integer.parseInt(elemento);
                    Nodo nodonew = new Nodo(nuevo);
                    arbol.addNodo(nodonew);
                } else {
                    int raiz = Integer.parseInt(arreglo[indice]);
                    Nodo nodo = new Nodo(raiz);
                    arbol.addNodo(nodo);
                    arreglo[indice] = "A";
                }
            } else {
                arreglo[indice] = elemento;
            }
        }
    }

    public void mostrarTabla() {
        int inc = 0;
        for (int i = 0; i < 1; i++) {
            inc += size;
            System.out.println();
            for (int k = inc - size; k < inc; k++) {
                System.out.format("| %3s  " + " ", k);
            }
            System.out.println("|");
            for (int l = 0; l < ((size - 2) * 10); l++) {
                System.out.print("-");
            }
            System.out.println();

            for (int n = inc - size; n < inc; n++) {
                if (arreglo[n].equals("-1")) {
                    System.out.print("|       ");
                } else {
                    System.out.print(String.format("|  %3s " + " ", arreglo[n]));
                }
            }
            System.out.println("|");
            System.out.println();
        }
    }

}


//public String busClave(String elemento) {
//        int indice = Integer.parseInt(elemento) % size;
//        contador = 0;
//        while (arreglo[indice] != "-1") {
//            if (arreglo[indice].equals(elemento)) {
//                System.out.println("El elemento " + elemento + " fue encontrado en el indice " + indice);
//                return arreglo[indice];
//            }
//            indice++;
//            indice %= size;
//            contador++;
//            if (contador > size) {
//                break;
//            }
//        }
//        return null;
//    }