/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;

/**
 *
 * @author PAVILLION
 */
public class AuxiliarArticulo {
    String categoria,titulo,descripcion,marca,tipoprecio;
    private boolean nuevo, usado;
    private int precio;
    private int idPersona;

   public AuxiliarArticulo() {
    }

    public String getTipoprecio() {
        return tipoprecio;
    }

    public void setTipoprecio(String tipoprecio) {
        this.tipoprecio = tipoprecio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return ("<html><b>Nombre del Artículo:</b> "+titulo + "<BR>" + "<b>Descripcion: </b>" + descripcion +"<BR><b>Categoria: </b>"+categoria+"<BR>" + "<b>Marca: </b>" +marca);
    }

    
}
