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
public class Auto extends Vehiculo{
    public static int N_RUEDA = 4;

    public Auto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public int getN_RUEDA() {
        return N_RUEDA;
    }

}
