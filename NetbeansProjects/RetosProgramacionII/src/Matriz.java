
public class Matriz {

    public Matriz(int m , int n) {
        int  matriz[][]= new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matriz [i][j] = (int)(Math.random()*9+1);
               }
            }
            
        }
       
    }




