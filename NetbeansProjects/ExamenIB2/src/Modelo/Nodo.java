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

public class Nodo implements Serializable{
    Nodo padre;
    String name;
    int reinas[][];
    ArrayList<Nodo> listanodos;
    //boolean vis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Nodo(Nodo padre, int[][] reinas, String name) {
        this.name=name;
        this.padre = padre;
        this.reinas = reinas;
        this.listanodos = new ArrayList<>();
        
    }

    
    public int[][] getReinas() {
        return reinas;
    }

    public void setReinas(int[][] reinas) {
        this.reinas = reinas;
    }

    public ArrayList<Nodo> getListanodos() {
        return listanodos;
    }

    public void setListanodos(ArrayList<Nodo> listanodos) {
        this.listanodos = listanodos;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    
    
    

}
