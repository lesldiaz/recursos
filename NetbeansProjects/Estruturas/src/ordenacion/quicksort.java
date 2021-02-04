/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

/**
 *
 * @author PAVILLION
 */
public class quicksort {
    public static int[] quicksort(int arreglo[], int izq, int der) {

  int pivote=arreglo[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(arreglo[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(arreglo[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= arreglo[i];                  // los intercambia
         arreglo[i]=arreglo[j];
         arreglo[j]=aux;
     }
   }
   arreglo[izq]=arreglo[j]; // se coloca el pivote en su lugar de forma que tendremos
   arreglo[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(arreglo,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(arreglo,j+1,der); // ordenamos subarray derecho

    return arreglo;
    }
}
