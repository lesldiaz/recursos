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
    int nodsrec=1;
    ArrayList<Nodo> nolist = new ArrayList<>();
    public void insRaiz(int [][] matriz) {
        this.raiz = new Nodo(null, matriz,"Raiz");
    }
    
    public void insertG(Nodo padre, Nodo nodo){
        nodo.padre=padre;
        nodo.getPadre().listanodos.add(nodo);
    }
    
    public Nodo generarMat(int matriz[][], Nodo padre) {
        boolean filas[] = new boolean[8];
        Arrays.fill(filas, false);
        boolean columnas[] = new boolean[8];
        Arrays.fill(columnas, false);
        boolean diagonalInferior[] = new boolean[29];
        Arrays.fill(diagonalInferior, false);
        boolean diagonalSuperior[] = new boolean[29];
        Arrays.fill(diagonalSuperior, false);
        //contador
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] == 1) {
                    filas[i] = true;
                    columnas[j] = true;
                    diagonalInferior[j - i + 7] = true;
                    diagonalSuperior[j + i] = true;
                }
            }
        }
        //System.out.println(padre.name);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!(filas[i])) {
                    if (!(columnas[j])) {
                        if (!(diagonalInferior[j - i + 7])) {
                            if (!(diagonalSuperior[j + i])) {
                                int[][] nmatriz = matriz;
                                nmatriz[i][j] = 1;
                                Nodo newnodo = new Nodo(padre, nmatriz, "(H"+ j + " de " + padre.name+")");
                                //aqui aniade la matriz
                                padre.listanodos.add(newnodo);
                                if (solucion(newnodo.reinas)) {
                                    return padre;
                                } else {
                                    return generarMat(newnodo.getReinas(),newnodo);
                                }

                            }
                        }
                    }
                }

            }
        }
        return padre;
    }

    public boolean solucion(int[][] matriz){
        boolean solucion=false;
        int cont=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]==1){
                    cont++;
                } 
            }
        }
        if(cont==8){
            solucion=true;
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
    
    public void recorridoProf(Nodo raiz,int con){
        if (solucion(raiz.getReinas())){
                System.out.println("Solucion encontrada en el nodo " + raiz.name + 
                                    " del padre " + raiz.padre.name);
                imprimirMatriz(raiz.getReinas());
                System.out.println("Nodos Recorridos:" + nodsrec);
                System.exit(0);            
        } else {
           ArrayList <Nodo> list = raiz.getListanodos();
            for (int i = con; i < list.size(); i++) {
                Nodo nod = list.get(i);
                
                if (nod.listanodos!=null){
                    recorridoProf(nod,0);   
                } else {
                    recorridoProf(nod.getPadre(),con+1);
                }
                imprimir(nod);
                nodsrec++;
            }
        }
        
    }
    
    public void recorridoAncho(Nodo raiz){
        if (solucion(raiz.getReinas())){
            System.out.println("Solucion encontrada en el nodo " + raiz.name + 
                                " del padre" + raiz.padre.name);
            imprimirMatriz(raiz.getReinas());
        } 
        recNodos(raiz);       
    }
    
    private void recNodos(Nodo nodo){
        ArrayList<Nodo> listanod = nodo.getListanodos();
        int con =1;
        for (int i = 0; i < listanod.size(); i++) {
                 Nodo nod = listanod.get(i);
                if (solucion(nod.getReinas())){
                    System.out.println("Solucion encontrada en el nodo " + nod.name + " del nodo " + nod.padre.name);
                    imprimirMatriz(nod.getReinas());
                    break; 
                } else {
                    con++;
                    System.out.println("nodo " + nod.name + " padre" + nod.padre.name);
                }
        }
        if (con==listanod.size()) {
            recListNodos(listanod);
        }
    }
   
    private void recListNodos(ArrayList<Nodo> listanodo){
        for (int i = 0; i < listanodo.size(); i++) {
            Nodo nodo = listanodo.get(i);
            System.out.println("Nodo "+ nodo.name);
            for (int j = 0; j < nodo.listanodos.size(); j++) {
                Nodo nod = nodo.listanodos.get(j);
                if (solucion(nod.reinas)){
                    System.out.println("Solucion Encontrada en el nodo "+ nod.name + " del padre "+ nod.padre.name);
                    imprimirMatriz(nod.reinas);
                    break;
                }
                System.out.println("nodo "+ nod.name + " padre "+ nod.padre.name);
            }
           recListNodos(nodo.getListanodos());
        }
    }
        
public static void main(String[] args) {
        Nodo nodoPadre;
        ArrayList<int[][]> matrices = new ArrayList<>();
        Reinas arbol = new Reinas();
        int[][] matrizInicial = {{0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}, 
                                {0, 0, 0, 0, 0, 0, 0, 0}};
        Nodo raiz = new Nodo(null, matrizInicial,"Raiz");
        arbol.insRaiz(matrizInicial);

        for (int k = 0; k < 8; k++) {
            int matrizInicial2[][] = new int[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    matrizInicial2[i][j] = 0;
                }
            }
            matrizInicial2[k][0] = 1;
            matrices.add(matrizInicial2);
            nodoPadre = new Nodo(raiz, matrices.get(k),"P" + (k+1));
            Nodo nodoN = arbol.generarMat(nodoPadre.reinas, nodoPadre);
            //System.out.println("NodoSD");
           // arbol.imprimir(nodoN);
            nodoPadre.listanodos.add(nodoN);
            arbol.nolist.add(nodoPadre);
            arbol.raiz.listanodos.add(nodoPadre);
            raiz.setListanodos(arbol.nolist);
            //System.out.println(k);
            //arbol.imprimirMatriz(nodoPadre.hijos.get(0).getreinas());
            
        }

        //arbol.imprimir(raiz);
        long startTime = System.nanoTime();
        arbol.recorridoProf(raiz,0);
        long totalSum = (System.nanoTime()- startTime);
        System.out.println("Tiempo Ejec: " + totalSum);
//        long startTime1 = System.currentTimeMillis();
//        arbol.recorridoAncho(raiz);
//        long totalSum1 = (System.currentTimeMillis()- startTime1);
//        System.out.println("Tiempo Ejec: " + totalSum1);
    }
    

   
}
