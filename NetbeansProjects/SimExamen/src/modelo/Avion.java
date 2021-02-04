/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Leslie Diaz
 */
public class Avion extends Vehiculo implements Accion,Serializable {
private int capacidadMax;
private double alturaMax,alturaMin,velocidadMin,velocidadMax;
private Ala ala;
private Rueda rueda;
private boolean estadoini;
public double velocActual,altuActual;

    public Avion(int capacidadMax, double alturaMax, double alturaMin, double velocidadMin, double velocidadMax ,Ala ala, Rueda rueda, boolean estadoini, String modelo, String tipo, double velocActual,double altuActual) {
        super(modelo, tipo);
        this.capacidadMax = capacidadMax;
        this.alturaMax = alturaMax;
        this.alturaMin = alturaMin;
        this.velocidadMin = velocidadMin;
        this.ala = ala;
        this.rueda = rueda;
        this.estadoini = estadoini;
        this.velocidadMax= velocidadMax;
        this.velocActual = velocActual;
        this.altuActual = altuActual;
    }

    public double getVelocActual() {
        return velocActual;
    }

    public void setVelocActual(double velocActual) {
        this.velocActual = velocActual;
    }

    public double getAltuActual() {
        return altuActual;
    }

    public void setAltuActual(double altuActual) {
        this.altuActual = altuActual;
    }

    

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    public double getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(double alturaMin) {
        this.alturaMin = alturaMin;
    }

    public double getVelocidadMin() {
        return velocidadMin;
    }

    public void setVelocidadMin(double velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    public Ala getAla() {
        return ala;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public boolean isEstadoini() {
        return estadoini;
    }

    public void setEstadoini(boolean estadoini) {
        this.estadoini = estadoini;
        
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    

//    true prendido
//    false apagado
    

    @Override
    public void prender() {
       if(estadoini==true){
            JOptionPane.showMessageDialog(null,"El vehiculo ya esta encendido");
           
        }else{
           JOptionPane.showMessageDialog(null,"Encendido");
           estadoini=true;
       }
    }
    @Override
    public void apagar() {
        if(estadoini==false){
            JOptionPane.showMessageDialog(null,"El vehiculo ya esta apagado");
        }else if(velocActual==0 && altuActual==0){
            JOptionPane.showMessageDialog(null,"Apagado");
            estadoini=false;
       }
    }

    @Override
    public void frenar(double variacion) {
        velocActual=variacion;
    }

    @Override
    public void acelerat(double variacion) {
        velocActual=variacion;
    }
    
    public void descender(double variacion){
        altuActual=variacion;
    }
    
    public void ascender(double variacion){
        altuActual=variacion;
    }
}
