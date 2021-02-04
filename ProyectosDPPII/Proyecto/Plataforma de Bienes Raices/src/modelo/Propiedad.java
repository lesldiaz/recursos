/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucho
 */
public class Propiedad {

    //Atributos
    private String nombre, calleprincipal, numerocasa, callesecundaria, sector, tipo, extension, numerocuartos, descripcion, tipocontrato;
    private double precio;

    //Constructor
    public Propiedad(String nombre, String calleprincipal, String numerocasa, String callesecundaria, String sector, String tipo, String extension, String numerocuartos, String descripcion, String tipocontrato, double precio) {
        this.nombre = nombre;
        this.calleprincipal = calleprincipal;
        this.numerocasa = numerocasa;
        this.callesecundaria = callesecundaria;
        this.sector = sector;
        this.tipo = tipo;
        this.extension = extension;
        this.numerocuartos = numerocuartos;
        this.descripcion = descripcion;
        this.tipocontrato = tipocontrato;
        this.precio = precio;
    }

    public Propiedad() {
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalleprincipal() {
        return calleprincipal;
    }

    public void setCalleprincipal(String calleprincipal) {
        this.calleprincipal = calleprincipal;
    }

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getCallesecundaria() {
        return callesecundaria;
    }

    public void setCallesecundaria(String callesecundaria) {
        this.callesecundaria = callesecundaria;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNumerocuartos() {
        return numerocuartos;
    }

    public void setNumerocuartos(String numerocuartos) {
        this.numerocuartos = numerocuartos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio(double valormetro) {
        double valor = 0;
        double extensionaux = 0;
        try {
            extensionaux = Double.parseDouble(extension);
            valor = valormetro * extensionaux;
        } catch (Exception e) {
            System.out.println("Valor de extension invalido");
        }
        valor = valormetro * extensionaux;
        return valor;
    }

}
