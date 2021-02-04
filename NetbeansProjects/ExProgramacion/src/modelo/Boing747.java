/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author PAVILLION
 */
public class Boing747 extends Vehiculo {
    private int viajes;

    public Boing747(int viajes, double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
        this.viajes = viajes;
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }
   
    public void aterrizar(){
        
    }
    
    public void despegar(){
        
    }
    public void agregarViaje(){
        
    }
}
