/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_reinas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author personal
 */
public class Arbol_reinas {

    /**
     * @param args the command line arguments
     */
    nodo raiz;
    ArrayList<nodo> nodos;
    ArrayList<int[][]> matrices;
    boolean cambio;

    public void insertarRaiz(int matriz[][]) {
        raiz = new nodo(matriz, "0", null);
        nodos = new ArrayList<>();
        matrices = new ArrayList<>();
    }

    public void insertar(nodo padre, nodo arbol) {

        arbol.padre = padre;
        arbol.getpadre().hijos.add(arbol);

    }

    public nodo generar_matriz(int matriz[][], nodo Padre) {
        boolean filas[] = new boolean[4];
        Arrays.fill(filas, false);
        boolean columnas[] = {false, false, false, false};
        boolean diagonalInferior[] = {false, false, false, false, false, false, false};
        boolean diagonalSuperior[] = {false, false, false, false, false, false, false};
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == 1) {
                    filas[i] = true;
                    columnas[j] = true;
                    diagonalInferior[j - i + 3] = true;
                    diagonalSuperior[j + i] = true;
                }
            }
        }
        System.out.println("Padre//" + Padre.nombre);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!(filas[i])) {
                    if (!(columnas[j])) {
                        if (!(diagonalInferior[j - i + 3])) {
                            if (!(diagonalSuperior[j + i])) {
                                int[][] nmatriz = matriz;
                                nmatriz[i][j] = 1;

                                matrices.add(nmatriz);
                                nodo nuevo = new nodo(nmatriz, Padre.nombre + "" + j, Padre);

                                Padre.hijos.add(nuevo);

                                if (solucion(nuevo.reinas)) {

                                    return Padre;
                                } else {
                                    return generar_matriz(nuevo.getreinas(), nuevo);
                                }

                            }
                        }
                    }
                }

            }
        }
        return Padre;
    }

    public boolean solucion(int[][] matriz) {
        boolean flag = false;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1) {
                    cont++;
                }
            }

        }
        if (cont == 4) {
            flag = true;
        }
        return flag;
    }

    public boolean noSolucion(int[][] matriz) {
        boolean flag = false;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1) {
                    cont++;
                }
            }

        }
        if (cont == 3) {
            flag = true;
        }
        return flag;
    }

    public void imprimir(nodo nodo) {
        System.out.println("/0" + nodo.hijos.size());
        for (int k = 0; k < nodo.getListahijos().size(); k++) {

            if (!(nodo.getListahijos() == (null))) {
                System.out.println("hijio" + nodo.getListahijos().get(k).nombre + "padre" + nodo.nombre);

                imprimirMatriz(nodo.getListahijos().get(k).getreinas());
                imprimir(nodo.getListahijos().get(k));
            }
        }
    }

    void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // TODO code application logic here\
        nodo nodoPadre;
        ArrayList<int[][]> matrices = new ArrayList<>();
        Arbol_reinas arbol = new Arbol_reinas();
        int[][] matizInicial = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        nodo raiz = new nodo(matizInicial, "0", null);
        arbol.insertarRaiz(matizInicial);

        for (int k = 0; k < 4; k++) {
            int matrizInicial2[][] = new int[4][4];
            // System.out.println(k);
            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {
                    matrizInicial2[i][j] = 0;
                }
            }
            matrizInicial2[k][0] = 1;
            matrices.add(matrizInicial2);
            nodoPadre = new nodo(matrices.get(k), (k + 1) + "", raiz);
            //arbol.imprimir(raiz);
            nodo nodoN = arbol.generar_matriz(nodoPadre.reinas, nodoPadre);
            System.out.println("NodoSD");
            arbol.imprimir(nodoN);
            nodoPadre.hijos.add(nodoN);
            arbol.nodos.add(nodoPadre);
            arbol.raiz.hijos.add(nodoPadre);
            raiz.setHijos(arbol.nodos);
            System.out.println(k);
            //arbol.imprimirMatriz(nodoPadre.hijos.get(0).getreinas());
        }

        arbol.imprimir(raiz);

    }

}
