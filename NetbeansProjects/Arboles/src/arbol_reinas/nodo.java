/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_reinas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author personal
 */

public class nodo {
    nodo padre;
    String nombre;
    int reinas[][];
  
    ArrayList<nodo> hijos;
    
    public nodo(int[][] matriz,String nom,nodo padre){
     this.nombre=nom;
    this.reinas=matriz;
    this.padre=padre;
    this.hijos = new ArrayList<>();
    
    }  
    
    
    ArrayList<nodo>  getListahijos(){
    return hijos;
    }
    
 
    
    int[][] getreinas(){
        return reinas;
    }
    
    void setreinas(int[][] nmatriz){
    this.reinas=nmatriz;
    }
   void setHijos(ArrayList<nodo> hijos){
   this.hijos=hijos;
   }
    nodo getpadre(){
    return this.padre;
    }
    
    
    

}
