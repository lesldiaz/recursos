/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorecursividad;

/**
 *
 * @author Leslie Diaz
 */
public class TorreHanoi {
    int i=0;
    public int resolverHanoi(int numero, char inicio, char fin, char aux){
        if(numero==1){
            i=i+1;
            System.out.println("\n" + i + " " + inicio + "->" + fin);
            return 0;
        } else{
            resolverHanoi(numero-1,inicio,aux,fin);
            i= i+1;
            System.out.println("\n" + i + " " + inicio + "->" + fin);
            resolverHanoi(numero-1,aux, fin,inicio);
            return 0;
        }
    }
}


