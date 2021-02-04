/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Leslie Diaz
 */
public class Ala implements Serializable{
    private double peso,longitud;
    private int numTurbinas;

    public Ala(double peso, double longitud,int numTurbinas) {
        this.peso = peso;
        this.longitud = longitud;
        this.numTurbinas=numTurbinas;
    }

    public ArrayList listaTurbina(double potenciamotor){
       ArrayList <Turbina> listaTurbina = new ArrayList<>();
        if (numTurbinas<=4){
            for (int i = 0; i < numTurbinas; i++) {
                listaTurbina.add(new Turbina(new Motor(potenciamotor)));
            }
        return listaTurbina;
        }else{
            JOptionPane.showMessageDialog(null,"Numero en Exceso","Turbinas",JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
}
