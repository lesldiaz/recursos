/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Propiedad;

/**
 *
 * @author Lucho
 */
public class AuxiliarTipoPropiedad extends Propiedad{
        //Atributos
    private String tipop;
    private int numeropisos, numerocuartos, numerobanios, piso;
    private boolean patio, parqueadero;
    private double precio;
    
    //Constructor

    public AuxiliarTipoPropiedad() {
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

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public boolean isParqueadero() {
        return parqueadero;
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

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }
    
    
    
    
}
