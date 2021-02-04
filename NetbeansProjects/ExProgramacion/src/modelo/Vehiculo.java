/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author PAVILLION
 */
public class Vehiculo implements Desplazable {
    private double velocidadPromedio;
    private int velocidadMaxima;

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void romperInercia(){
        
    }
    @Override
    public void esquivarObstaculo() {
        
    }
    
    public void listaRuedas(Rueda rueda){
        ArrayList<Rueda> listaruedas = new ArrayList<>();
        listaruedas.add(rueda);
    }
}
