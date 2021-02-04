/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author personal
 */

public class nodo1{
    nodo1 padre;
    String nombre;
    int reinas[][];
  
    ArrayList<nodo1> hijos;
    
    public nodo1(int[][] matriz,String nom,nodo1 padre){
     this.nombre=nom;
    this.reinas=matriz;
    this.padre=padre;
    this.hijos = new ArrayList<>();
    
    }  
    
    
    ArrayList<nodo1>  getListahijos(){
    return hijos;
    }
    
 
    
    int[][] getreinas(){
        return reinas;
    }
    
    void setreinas(int[][] nmatriz){
    this.reinas=nmatriz;
    }
   void setHijos(ArrayList<nodo1> hijos){
   this.hijos=hijos;
   }
    nodo1 getpadre(){
    return this.padre;
    }
    
    
    

}
