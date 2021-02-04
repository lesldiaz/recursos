/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leslie Diaz
 */
public interface Accion {
    public void prender();
    public void apagar();
    public void frenar(double variacion);
    public void acelerat(double variacion);
}
