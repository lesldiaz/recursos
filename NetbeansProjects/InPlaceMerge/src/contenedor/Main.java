/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor;

import static contenedor.MySelectionSort.doInsertionSort;
import static contenedor.MySelectionSort.doSelectionSort;
import java.util.Random;


/**
 *
 * @author PAVILLION
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long sum =0;
        Merge mms = new Merge();
//        
        // TODO code application logic here
        for (int i = 0; i < 5; i++) {
            int[] inputArr = genNum(50000);
        
        String a[] =  
        Merge.sort(a);
        show(a);
        mms.sort(inputArr);
         TFin = System.currentTimeMillis();//Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio;
        sum = (sum + tiempo);
        }
        sum=sum/5;
        
//        MyQuickSort sorter = new MyQuickSort();
////       
//  int[] input ={45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,12,34,45,26,74,87,24,65,23,54};
//
//        sorter.sort(input);
//        for(int i:input){
//            System.out.print(i);
//            System.out.print(" ");
//        }
        
        
//        int[] arr1 = {45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,75,24};
//        int[] arr2 = doSelectionSort(arr1);
//        for(int i:arr2){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//     
       
//        int[] inputArr = {45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,75,24};
//        MyMergeSort mms = new MyMergeSort();
//        mms.sort(inputArr);
//        for(int i:inputArr){
//            System.out.print(i);
//            System.out.print(" ");
//        }
        //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + sum); 

    }
    
    public static int[] genNum (int tam){
        
        
        
        
        
        
        
        int[] arreglo = new int [tam];
        for (int i = 0; i < tam; i++) {
            arreglo[i]= (int) (Math.random() * 100) + 1;      
        }
        return arreglo;
    }
    
}

/* {45,23,11,89,77,98,4,28,65,43};
    {45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42};
    {45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,12,34,45,26,74,87,24,65,23,54};
{45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,12,34,45,26,74,87,24,65,23,54,123,43,24,54,765,234,67,24,32,1};
{45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,12,34,45,26,74,87,24,65,23,54,123,43,24,54,765,234,67,24,32,1,2,5,3,3,67,2,72,4,19,44};
{45,23,11,89,77,98,4,28,65,43,13,16,33,44,74,24,67,343,56,42,12,34,45,26,74,87,24,65,23,54,123,43,24,54,765,234,67,24,32,1,2,5,3,3,67,2,72,4,19,44,34,6,12,66,12,4,7,34,99,435};
    */