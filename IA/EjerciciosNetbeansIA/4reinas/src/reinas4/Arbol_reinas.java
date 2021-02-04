/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas4;

import java.util.ArrayList;

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
   // ArrayList<int[][]> matrices;
    boolean cambio;

    public void insertarRaiz(int matriz[][]) {
        raiz = new nodo(matriz, "0", null);
        nodos = new ArrayList<>();
      //  matrices = new ArrayList<>();

    }

    public void insertar(nodo padre, nodo arbol) {

        arbol.padre = padre;
        arbol.getpadre().hijos.add(arbol);

    }

    public nodo generar_matriz(nodo Padre,nodo Padre2) {
        int[][]matriz = Padre.getreinas();
    
        boolean filas[] = {false, false, false, false};
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
        ArrayList<nodo> nodosh = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int [][]ma = Padre.getreinas();
                if (!(filas[i])) {
                    if (!(columnas[j])) {
                        if (!(diagonalInferior[j - i + 3])) {
                            if (!(diagonalSuperior[j + i])) {
                               int [][]m=new int[matriz.length][matriz.length];
                                for (int l = 0; l < matriz.length; l++) {
                                    for (int n = 0; n < 10; n++) {
                                        m[l][n]=matriz[l][n];
                                    }
                                }
                                imprimirMatriz(matriz);
                                imprimirMatriz(m);
                                if(solucion(matriz)){
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Padre2;
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

        ArrayList<int[][]> matrices = new ArrayList<>();
        Arbol_reinas arbol = new Arbol_reinas();
        ArrayList<nodo> lis = new ArrayList<>();
        int[][] matizInicial = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        //nodo raiz = new nodo(matizInicial, "Raiz", null);
        arbol.insertarRaiz(matizInicial);

        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                int matrizInicial2[][] = new int[4][4];
                matrizInicial2[k][i] = 1;
                matrices.add(matrizInicial2);
                //arbol.imprimirMatriz(matrizInicial2);
            }
        }
        
        for (int i = 0; i < matrices.size(); i++) {
            nodo nodonew = new nodo(matrices.get(i), (i + 1) + "", arbol.raiz);
            lis.add(nodonew);
        }
        ArrayList<nodo> n = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            nodo nodo1=arbol.generar_matriz(lis.get(0),lis.get(i));  
            n.add(nodo1);
        }
        arbol.raiz.setHijos(n);
        
//        System.out.println("Nodos Raiz Padre" + arbol.raiz.hijos.size());
//        for (int i = 0; i < arbol.raiz.hijos.size(); i++) {
//            arbol.imprimirMatriz(arbol.raiz.hijos.get(i).getreinas());
//        }
////     
//      nodoPadre.hijos.add(nodoN);
//      arbol.nodos.add(nodoPadre);
//      arbol.raiz.hijos.add(nodoPadre);
//      raiz.setHijos(arbol.nodos);
//      
    }

    //newmain
    //arbol.imprimir(raiz);
    }


