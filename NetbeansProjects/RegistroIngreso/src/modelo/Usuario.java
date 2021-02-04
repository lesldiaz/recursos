/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;


public class Usuario implements Serializable {
    private String nombreApellido,usuario,contraseña;
    private boolean tipo;

    public Usuario(String nombreApellido, String usuario, String contraseña, boolean tipo) {
        this.nombreApellido = nombreApellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public Usuario() {
    }

    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombreApellido; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
}
