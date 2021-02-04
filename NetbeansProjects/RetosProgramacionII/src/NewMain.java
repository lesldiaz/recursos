/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leslie Diaz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int m = 2;
    int n =m;
        int  matriz[][]= new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matriz [i][j] = (int)(Math.random()*9+1);
               }
            }
        System.out.println(new SumaMatriz().sumMatriz(2,2,2,matriz));   
        }

    }


