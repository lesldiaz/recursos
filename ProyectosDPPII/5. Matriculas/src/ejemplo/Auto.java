/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author USRBET
 */
public class Auto {
    //Atributos
    private String placa, color, modelo, kilometraje;
    
    //Constructor

    public Auto(String placa, String color, String modelo, String kilometraje) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public Auto() {
    }
    
    //Metodos

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return placa; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
