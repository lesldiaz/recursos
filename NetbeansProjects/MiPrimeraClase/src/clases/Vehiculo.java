/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USRBET
 */
public class Vehiculo {

    //atributos
    private int modelo, numeropuertas;
     private String color, placa;
    //private String placa;
    //private int numeropuertas;

    //constructor
    public Vehiculo(int modelo, int numeropuertas, String placa, String color) {
        this.modelo = modelo;
        this.numeropuertas = numeropuertas;
        this.color = color;
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
