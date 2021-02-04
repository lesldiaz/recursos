/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PAVILLION
 */
public class Articulo {
    String categoria,marca,titulo,tipoprecio,descripcion;
    private boolean usado, nuevo;
    private int precio;
   

    public Articulo(String categoria, String marca, String titulo, String tipoprecio, String descripcion, boolean usado, boolean nuevo, int precio) {
        this.categoria = categoria;
        this.marca = marca;
        this.titulo = titulo;
        this.tipoprecio = tipoprecio;
        this.descripcion = descripcion;
        this.precio = precio;
        this.usado = usado;
        this.nuevo = nuevo;
    }


    public Articulo() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoprecio() {
        return tipoprecio;
    }

    public void setTipoprecio(String tipoprecio) {
        this.tipoprecio = tipoprecio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    
}
