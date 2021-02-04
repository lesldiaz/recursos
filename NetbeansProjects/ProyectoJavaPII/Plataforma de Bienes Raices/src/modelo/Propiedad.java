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
    private String nombre, calleprincipal, numerocasa, callesecundaria, sector, descripcion, tipocontrato;
    private int extension;

    //Constructor

    public Propiedad(String nombre, String calleprincipal, String numerocasa, String callesecundaria, String sector, int extension, String descripcion, String tipocontrato) {
        this.nombre = nombre;
        this.calleprincipal = calleprincipal;
        this.numerocasa = numerocasa;
        this.callesecundaria = callesecundaria;
        this.sector = sector;
        this.extension = extension;
        this.descripcion = descripcion;
        this.tipocontrato = tipocontrato;
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

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
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

}
