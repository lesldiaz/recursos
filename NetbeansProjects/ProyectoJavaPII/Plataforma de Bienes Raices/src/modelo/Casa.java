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
public class Casa extends Propiedad{
    //Atributos
    private int numeropisos, numerocuartos, numerobanios;
    private boolean patio, parqueadero;
    private double precio;
    
    //Constructor

    public Casa(int numeropisos, int numerocuartos, int numerobanios, boolean patio, boolean parqueadero, double precio, String nombre, String calleprincipal, String numerocasa, String callesecundaria, String sector, int extension, String descripcion, String tipocontrato) {
        super(nombre, calleprincipal, numerocasa, callesecundaria, sector, extension, descripcion, tipocontrato);
        this.numeropisos = numeropisos;
        this.numerocuartos = numerocuartos;
        this.numerobanios = numerobanios;
        this.patio = patio;
        this.parqueadero = parqueadero;
        this.precio = precio;
    }

    public Casa() {
    }

    //Metodos

    public int getNumeropisos() {
        return numeropisos;
    }

    public void setNumeropisos(int numeropisos) {
        this.numeropisos = numeropisos;
    }

    public int getNumerocuartos() {
        return numerocuartos;
    }

    public void setNumerocuartos(int numerocuartos) {
        this.numerocuartos = numerocuartos;
    }

    public int getNumerobanios() {
        return numerobanios;
    }

    public void setNumerobanios(int numerobanios) {
        this.numerobanios = numerobanios;
    }

    public int isPatio() {
        if (patio){
            return 1;
        } else {
            return 0;
        }
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public int isParqueadero() {
        if (parqueadero){
            return 1;
        } else {
            return 0;
        }
    }

    public void setParqueadero(boolean parqueadero) {
        this.parqueadero = parqueadero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
