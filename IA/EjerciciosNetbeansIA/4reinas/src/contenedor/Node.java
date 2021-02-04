/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.edu.tresenraya;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author slema
 */
public class Node{

    private Node nodoPadre;
    private List<Node> nodosHijos;
    private Integer[][] informacion;
    
    public Node() {
        this.nodosHijos = new ArrayList<>();
    }
   

    public Node(Integer[][] informacion) {
        this.informacion = informacion;
        this.nodosHijos = new ArrayList<>();
    }

    public Node getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(Node nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    public List<Node> getNodosHijos() {
        return nodosHijos;
    }

    public void setNodosHijos(List<Node> nodosHijo) {
        this.nodosHijos = nodosHijo;
    }

    public Integer[][] getInformacion() {
        return informacion;
    }

    public void setInformacion(Integer[][] información) {
        this.informacion = información;
    }

    public void aniadirHijo(Node nodo) {
        nodo.setNodoPadre(this);
        getNodosHijos().add(nodo);
    }
    


}
