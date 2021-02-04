/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor;

import java.util.ArrayList;
import java.util.Arrays;

public class Reinas {

    Nodo raiz;
    int nodsrec = 1;
    //ArrayList<Nodo> nolist = new ArrayList<>();

    public void insRaiz(int[][] matriz) {
        this.raiz = new Nodo(null, matriz, "Raiz");
    }

    public void insertG(Nodo padre, Nodo nodo) {
        nodo.padre = padre;
        nodo.getPadre().listanodos.add(nodo);
    }

    public Nodo generarMat(int matriz[][], Nodo padre) {
        boolean[][] posicion = {{false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false}};
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
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!(posicion[i][j])) {
                    int[][] nmatriz = matriz;
                    nmatriz[i][j] = 1;
                    Nodo newnodo = new Nodo(padre, nmatriz, "(H" + j + " de " + padre.name + ")");
                    //aqui aniade la matriz
                    padre.listanodos.add(newnodo);
                    if (solucion(newnodo.reinas)) {
                        return padre;
                    } else {
                        return generarMat(newnodo.getReinas(), newnodo);
                    }

                }

            }
        }
        return padre;
    }

    public boolean solucion(int[][] matriz) {
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

    void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void imprimir(Nodo nodo) {
        for (int k = 0; k < nodo.getListanodos().size(); k++) {
            if (!(nodo.getListanodos() == (null))) {
                //System.out.println("H("+nodo.getListanodos().get(k).name + ") del padre (" + nodo.name+")");
                imprimirMatriz(nodo.getListanodos().get(k).getReinas());
                imprimir(nodo.getListanodos().get(k));
            }
        }
    }

    public void recorridoProf(Nodo raiz, int con) {
        if (solucion(raiz.getReinas())) {
            System.out.println("Solucion");
            imprimirMatriz(raiz.getReinas());
            System.out.println("Nodos Recorridos:" + nodsrec);
            System.exit(0);
        } else {
            ArrayList<Nodo> list = raiz.getListanodos();
            for (int i = con; i < list.size(); i++) {
                Nodo nod = list.get(i);

                if (nod.listanodos != null) {
                    recorridoProf(nod, 0);
                } else {
                    recorridoProf(nod.getPadre(), con + 1);
                }
                imprimirMatriz(nod.reinas);
                nodsrec++;
            }
        }

    }

    public void recorridoAncho(Nodo raiz) {
        if (solucion(raiz.getReinas())) {
            System.out.println("Solucion encontrada en el nodo " + raiz.name
                    + " del padre" + raiz.padre.name);
            imprimirMatriz(raiz.getReinas());
        }
        recNodos(raiz);
    }

    private void recNodos(Nodo nodo) {
        ArrayList<Nodo> listanod = nodo.getListanodos();
        int con = 1;
        for (int i = 0; i < listanod.size(); i++) {
            Nodo nod = listanod.get(i);
            if (solucion(nod.getReinas())) {
                System.out.println("Solucion encontrada en el nodo " + nod.name + " del nodo " + nod.padre.name);
                imprimirMatriz(nod.getReinas());
                break;
            } else {
                con++;
                System.out.println("nodo " + nod.name + " padre" + nod.padre.name);
            }
        }
        if (con == listanod.size()) {
            recListNodos(listanod);
        }
    }

    private void recListNodos(ArrayList<Nodo> listanodo) {
        for (int i = 0; i < listanodo.size(); i++) {
            Nodo nodo = listanodo.get(i);
            System.out.println("Nodo " + nodo.name);
            for (int j = 0; j < nodo.listanodos.size(); j++) {
                Nodo nod = nodo.listanodos.get(j);
                if (solucion(nod.reinas)) {
                    System.out.println("Solucion Encontrada en el nodo " + nod.name + " del padre " + nod.padre.name);
                    imprimirMatriz(nod.reinas);
                    break;
                }
                System.out.println("nodo " + nod.name + " padre " + nod.padre.name);
            }
            recListNodos(nodo.getListanodos());
        }
    }

    public static void main(String[] args) {

        ArrayList<int[][]> matrices = new ArrayList<>();
        Reinas arbol = new Reinas();
        int[][] matrizInicial = {
        {1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0}};
        
        System.out.println(""+arbol.heuristica(matrizInicial));
        Nodo raiz = new Nodo(null, matrizInicial, "Raiz");
        arbol.insRaiz(matrizInicial);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int[][] ma = new int[8][8];
                ma[i][j] = 1;
                matrices.add(ma);
            }
        }
        arbol.imprimirMatriz(matrices.get(0));
//        Nodo hijoRaiz;
//        ArrayList<Nodo> listahijos = new ArrayList<>();
//        ArrayList<Nodo> hijos = new ArrayList<>();
//        ArrayList<Nodo> lisnodos = arbol.raiz.getListanodos();
//        for (int k = 0; k < matrices.size(); k++) {
//            hijoRaiz = new Nodo(arbol.raiz, matrices.get(k), "P" + (k + 1));
//            listahijos.add(hijoRaiz);
//        }
//        arbol.raiz.setListanodos(listahijos);
//        for (int i = 0; i < arbol.raiz.getListanodos().size(); i++) {
//            Nodo nod = new Nodo(arbol.raiz.listanodos.get(i),arbol.raiz.listanodos.get(i).reinas,"Hijo" +i );
//        }
            
//            arbol.raiz.setListanodos(listahijos);
//            ArrayList<Nodo> lisnodos = arbol.raiz.getListanodos();
//            ArrayList<Nodo> hijos = new ArrayList<>();
//            for (int i = 0; i < lisnodos.size(); i++) {
//                int [][] mat = lisnodos.get(i).getReinas();
//                Nodo nod = arbol.generarMat(mat,lisnodos.get(i));
//                hijos.add(nod);
//            }
//            hijoRaiz.setListanodos(lisnodos);
            //arbol.imprimirMatriz(matrices.get(0));
//        arbol.imprimirMatriz(arbol.raiz.reinas);
//        System.out.println(arbol.raiz.getListanodos().size());
        
        //}
    }
    
    public double heuristica(int[][]matriz){
        double peso=0;
        double suma=0;
        ArrayList<int [][]> cuadrantes = new ArrayList<>();
                int[][] cuadone = new int [2][2];
                int[][] cuadtwo = new int [2][2];
                cuadone[0][0]=matriz[0][0];
                cuadone[0][1]=matriz[0][1];
                cuadone[1][0]=matriz[1][0];
                cuadone[1][1]=matriz[1][1];
                cuadtwo[0][0]=matriz[0][2];
                cuadtwo[0][1]=matriz[0][3];
                cuadtwo[1][0]=matriz[1][2];
                cuadtwo[1][1]=matriz[1][3];
                int[][] cuadthree = new int [2][2];
                int[][] cuadfour = new int [2][2];
                cuadthree[0][0]=matriz[0][4];
                cuadthree[0][1]=matriz[0][5];
                cuadthree[1][0]=matriz[1][4];
                cuadthree[1][1]=matriz[1][5];
                cuadfour[0][0]=matriz[0][6];
                cuadfour[0][1]=matriz[0][7];
                cuadfour[1][0]=matriz[1][6];
                cuadfour[1][1]=matriz[1][7];
                int[][] cuadfive = new int [2][2];
                int[][] cuadsix = new int [2][2];
                cuadfive[0][0]=matriz[2][0];
                cuadfive[0][1]=matriz[2][1];
                cuadfive[1][0]=matriz[3][0];
                cuadfive[1][1]=matriz[3][1];
                cuadsix[0][0]=matriz[2][2];
                cuadsix[0][1]=matriz[2][3];
                cuadsix[1][0]=matriz[3][2];
                cuadsix[1][1]=matriz[3][3];
                int[][] cuadseven = new int [2][2];
                int[][] cuadocho = new int [2][2];
                cuadseven[0][0]=matriz[2][4];
                cuadseven[0][1]=matriz[2][5];
                cuadseven[1][0]=matriz[3][4];
                cuadseven[1][1]=matriz[3][5];
                cuadocho[0][0]=matriz[2][6];
                cuadocho[0][1]=matriz[2][7];
                cuadocho[1][0]=matriz[3][6];
                cuadocho[1][1]=matriz[3][7];
                int[][] cuadnine = new int [2][2];
                int[][] cuadten = new int [2][2];
                cuadnine[0][0]=matriz[4][0];
                cuadnine[0][1]=matriz[4][1];
                cuadnine[1][0]=matriz[5][0];
                cuadnine[1][1]=matriz[5][1];
                cuadten[0][0]=matriz[4][2];
                cuadten[0][1]=matriz[4][3];
                cuadten[1][0]=matriz[5][2];
                cuadten[1][1]=matriz[5][3];
                int[][] cuadonce = new int [2][2];
                int[][] cuadoce = new int [2][2];
                cuadonce[0][0]=matriz[4][4];
                cuadonce[0][1]=matriz[4][5];
                cuadonce[1][0]=matriz[5][4];
                cuadonce[1][1]=matriz[5][5];
                cuadoce[0][0]=matriz[4][6];
                cuadoce[0][1]=matriz[4][7];
                cuadoce[1][0]=matriz[5][6];
                cuadoce[1][1]=matriz[5][7];
                int[][] cuadtrece = new int [2][2];
                int[][] cuadcator = new int [2][2];
                cuadtrece[0][0]=matriz[6][0];
                cuadtrece[0][1]=matriz[6][1];
                cuadtrece[1][0]=matriz[7][0];
                cuadtrece[1][1]=matriz[7][1];
                cuadcator[0][0]=matriz[6][2];
                cuadcator[0][1]=matriz[6][3];
                cuadcator[1][0]=matriz[7][2];
                cuadcator[1][1]=matriz[7][3];
                int[][] cuadquince = new int [2][2];
                int[][] cuaddiseis = new int [2][2];
                cuadquince[0][0]=matriz[6][4];
                cuadquince[0][1]=matriz[6][5];
                cuadquince[1][0]=matriz[7][4];
                cuadquince[1][1]=matriz[7][5];
                cuaddiseis[0][0]=matriz[6][6];
                cuaddiseis[0][1]=matriz[6][7];
                cuaddiseis[1][0]=matriz[7][6];
                cuaddiseis[1][1]=matriz[7][7];
                
                cuadrantes.add(cuadone);
                cuadrantes.add(cuadtwo);
                cuadrantes.add(cuadthree);
                cuadrantes.add(cuadfour);
                cuadrantes.add(cuadfive);
                cuadrantes.add(cuadsix);
                cuadrantes.add(cuadseven);
                cuadrantes.add(cuadocho);
                cuadrantes.add(cuadnine);
                cuadrantes.add(cuadten);
                cuadrantes.add(cuadonce);
                cuadrantes.add(cuadoce);
                cuadrantes.add(cuadtrece);
                cuadrantes.add(cuadcator);
                cuadrantes.add(cuadquince);
                cuadrantes.add(cuaddiseis);
                for (int i = 0; i < cuadrantes.size(); i++) {
                int[][] mat = cuadrantes.get(i);
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            if(mat[j][0]==1){
                                switch (i+1) {
                                    case 1:
                                        peso=0.5*1.6;
                                        break;
                                    case 2:
                                        peso=0.5*1.5;
                                        break;
                                    case 3:
                                        peso=0.5*1.2;
                                        break;
                                    case 4:
                                        peso=0.5*1.1;
                                        break;
                                    case 5:
                                        peso=0.5*1.0;
                                        break;
                                    case 6:
                                        peso=0.5*0.9;
                                        break;
                                    case 7:
                                        peso=0.5*1.4;
                                        break;
                                    case 8:
                                        peso=0.5*1.3;
                                        break;
                                    case 9:
                                        peso=0.5*0.8;
                                        break;
                                    case 10:
                                        peso=0.5*0.7;
                                        break;
                                    case 11:
                                        peso=0.5*0.6;
                                        break;
                                    case 12:
                                        peso=0.5*0.5;
                                        break;
                                    case 13:
                                        peso=0.5*0.4;
                                        break;
                                    case 14:
                                        peso=0.5*0.3;
                                        break;
                                    case 15:
                                        peso=0.5*0.2;
                                        break;
                                    case 16:
                                        peso=0.5*0.1;
                                        break;
                                    default:
                                        break;
                                }
                             }else if(mat[j][1]==1){
                                switch (i+1) {
                                    case 1:
                                        peso=0.1*1.6;
                                        break;
                                    case 2:
                                        peso=0.1*1.5;
                                        break;
                                    case 3:
                                        peso=0.1*1.2;
                                        break;
                                    case 4:
                                        peso=0.1*1.1;
                                        break;
                                    case 5:
                                        peso=0.1*1.0;
                                        break;
                                    case 6:
                                        peso=0.1*0.9;
                                        break;
                                    case 7:
                                        peso=0.1*1.4;
                                        break;
                                    case 8:
                                        peso=0.1*1.3;
                                        break;
                                    case 9:
                                        peso=0.1*0.8;
                                        break;
                                    case 10:
                                        peso=0.1*0.7;
                                        break;
                                    case 11:
                                        peso=0.1*0.6;
                                        break;
                                    case 12:
                                        peso=0.1*0.5;
                                        break;
                                    case 13:
                                        peso=0.1*0.4;
                                        break;
                                    case 14:
                                        peso=0.1*0.3;
                                        break;
                                    case 15:
                                        peso=0.1*0.2;
                                        break;
                                    case 16:
                                        peso=0.1*0.1;
                                        break;
                                    default:
                                        break;
                                }
                              }
                           
                        }
                         }
                    
                }suma=suma+peso;
            System.out.println(peso);     
            return suma;              
    }
          
        }

