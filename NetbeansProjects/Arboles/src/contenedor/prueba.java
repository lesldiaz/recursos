/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PAVILLION
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizInicial = {
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}};

        boolean[][] posicion = {{false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false}};
        //boolean[][] s = generarMat(matrizInicial, null);
        //imprimirMatriz(s);
        ArrayList<int[][]> list = genMatNodo1(matrizInicial);
        for (int i = 0; i < list.size(); i++) {
            imprimirMatriz(list.get(i));
        }
       // System.out.println(list.size());
        generarMat(matrizInicial,null,posicion);
//        for (int i = 0; i < list.size(); i++) {
//            imprimirMatriz(list.get(i));
//        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        int [][]mat= new int[8][8];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
//                if (matriz[i][j]){
//                    mat[i][j]=1;
//                }else{
//                    mat[i][j]=0;
//                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    static ArrayList<int[][]> lista = new ArrayList<>();
    public static int[][] generarMat(int matriz[][], Nodo padre,boolean[][]posicion) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    for (int k = 0; k < matriz.length; k++) {
                        posicion[i][k] = true;
                        posicion[k][j] = true;
                    }
                    for (int n = 1; n < 8; n++) {
                        if (i!=7 && j!=7){
                            posicion[i + n][j + n] = true;
                            int s = j + n;
                            int b = i + n;
                            if (s == 7 || b == 7) {
                                break;
                            }
                        }
                    }
                    
                    if (i == 0 && j != 0) {
                        for (int n = 1; n <= j; n++) {
                            posicion[i + n][j - n] = true; //aqui hay un error
                            int s = j - n;
                            int b = i + n;
                            if (s == j || b == 0) {
                                break;
                            }
                        }
                    }
                    if (i !=0 && j == 7 && i!= 7) {
                        for (int n = 1; n < j; n++) {
                            posicion[i + n][j - n] = true; //aqui hay un error
                            int s = j - n;
                            int b = i + n;
                            if (s == 0 || b == j) {
                                break;
                            }
                        }
                    }
                    
                    if (i == 7 && j!=7) { ///aqui
                        for (int n = 1; n < i; n++) {
                            posicion[i - n][j + n] = true; //aqui hay un error
                            int s = j + n;
                            int b = i - n;
                            if (s == i || b == j) {
                                break;
                            }
                        }
                    }
                    
                    if (j == 0 && i!=0) { ///aqui
                        for (int n = 1; n <= i; n++) {
                            posicion[i - n][j + n] = true; //aqui hay un error
                            int s = j + n;
                            int b = i - n;
                            if (s == i || b == j) {
                                break;
                            }
                        }
                    }
                    for (int n = 1; n < 8; n++) {
                       if(i!=0 && i!=7 && j!=0 && j!=7){
                        posicion[i + n][j - n] = true;
                        int s = i + n;
                        int b = j - n;
                        if (s == 7 || b == 0) {
                            break;
                        }
                       }
                    }
                    if (i != 0 && j != 0) {
                        for (int n = 1; n < 8; n++) {
                            posicion[i - n][j - n] = true;
                            int s = j - n;
                            int b = i - n;
                            if (s == 0 || b == 0) {
                                break;
                            }
                        }
                        for (int n = 1; n < 8; n++) {
                            if (i!=7 && j!=7){
                            posicion[i - n][j + n] = true;
                            int s = j + n;
                            int b = i - n;
                            if (s == 7 || b == 0) {
                                break;
                            }
                            }
                        }
                    }

                }
            }
        }
        System.err.println("Posiciones");
        int mat [][] = new int [posicion.length][posicion.length];
        for (int i = 0; i < posicion.length; i++) {
            for (int j = 0; j < posicion.length; j++) {           
                if (posicion[i][j]){
                    mat[i][j]=1;
                }else{
                    mat[i][j]=0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(!posicion[i][j]){
                    int [][]matrizr=matriz;
                    
                    matrizr[i][j]= 1;
                    lista.add(matrizr);
                    if (solucion(matrizr)) {
                        System.out.println("Sol encontrada");
                        //imprimirMatriz(matrizr);
                        break;
                    }else{
                        boolean[][]pos=posicion;
                        pos[i][j]=true;
                        generarMat(matriz, null,pos);
                    }
                    
                }
            }
            
        }
        System.out.println(lista.size());
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (!(posicion[i][j])) {
//                                int[][] nmatriz = matriz;
//                                nmatriz[i][j] = 1;
//                                //Nodo newnodo = new Nodo(padre, nmatriz, "(H" + j + " de " + padre.name + ")");
//                                //aqui aniade la matriz
//                                //padre.listanodos.add(newnodo);
//                                //if (solucion(newnodo.reinas)) {
//                                    //return padre;
//                                //} else {
//                                  //  return generarMat(newnodo.getReinas(), newnodo);
//                                //}
//                                return nmatriz;
//                }
//                        
//                   
//                
//
//            }
//        }
        //return padre;
        return null;
    }

    public static ArrayList<int [][]> genMatNodo1(int [][]mat){
        ArrayList<int [][]> lista = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int [][]ma=new int[8][8];
                ma[i][j]=1;
                imprimirMatriz(ma);
                lista.add(ma);
            }
        }
        return lista;
    }
public static boolean solucion(int[][] matriz) {
        boolean solucion = false;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1) {
                    cont++;
                }
            }
        }

        if (cont == 8) {
            solucion = true;
        }
        return solucion;
    }
}
