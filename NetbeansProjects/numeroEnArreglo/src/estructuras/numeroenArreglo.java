/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author PAVILLION
 */
public class numeroenArreglo {
    Scanner sc = new Scanner (System.in);
    int[]vector; 
    int var1,var2,var3;
    public void numeroArreglo(){
        System.out.println("Ingresar el tamaño del arreglo:"); 
        String variable = sc.nextLine();
        var1 = Integer.parseInt(variable);
        vector=new int[var1];
        //reyenar el arreglo
        for(int i=0;i<var1;i++){
           System.out.println("Ingrese el " + (i+1) + " elemento del arreglo");
           int valor = Integer.parseInt(sc.nextLine());
           vector[i]=valor;
        }
        //Pedir numero a buscar y su reemplazo
        System.out.println("Ingrese el valor a buscar en el arreglo:");
        var2= Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor para el reemplazo");
        var3=Integer.parseInt(sc.nextLine());
      //Cambiar las posiciones y reemplazar 
        for(int j=0;j<var1;j++){
             int valor1=vector[j];
             
             if(valor1==var2){
                if(valor1==vector[var1-1]){
                    vector[j]=var3;
                }else{
                int valoranterior=vector[j+1];
                 vector[j]= valoranterior;
                 vector[j+1]= var3;
                }
             }
        
    
       }
       //Imprimir el vector
        for (int k = 0; k < var1; k++) {
            System.out.print(vector[k]);
        }
    
} 
}
