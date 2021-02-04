/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author USRBET
 */
public class Usuario implements Serializable{
    //Atributos
    private String nomYAp, usuario, pass;
    private boolean tipo;
    private List lista;
    private static final long serialVersionUID = 2016;
    
    //Constructor

    public Usuario(String nomYAp, String usuario, String pass, boolean tipo, List lista) {
        this.nomYAp = nomYAp;
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
        this.lista = lista;
    }
    
    public Usuario (String nomYAp, String usuario, String pass, boolean tipo){
        this.nomYAp = nomYAp;
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
    }

    public Usuario() {
    }
        
    //Metodos

    public String getNomYAp (){
        return nomYAp;
    }
    
    public String getUsuario (){
        return usuario;
    }
    
    public String getPass (){
        return pass;
    }
    
    public boolean isTipo (){
        return tipo;
    }
    
    public List getLista(){
        return lista;
    }

    public void setNomYAp (String nomYAp){
        this.nomYAp = nomYAp;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nomYAp; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
