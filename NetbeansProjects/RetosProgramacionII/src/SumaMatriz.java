/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Leslie Diaz
 */
public class SumaMatriz {
    public int sumMatriz(int filas , int columnas , int orden,int matriz [][]){
        if(filas==0 && columnas ==0){
            return matriz [0][0];
        }else {
            if (columnas < 0){
                return sumMatriz (filas-1,orden,orden,matriz);
            }else{
                return matriz[filas][columnas] + sumMatriz(filas,columnas-1,orden,matriz);
            }
        }
    }
}
