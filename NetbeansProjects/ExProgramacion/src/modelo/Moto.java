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
public class Moto extends Vehiculo {
    public static int N_RUEDAS=2;

    public static int getN_RUEDAS() {
        return N_RUEDAS;
    }

    public Moto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }
 
}
