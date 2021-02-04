/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Vehiculo;

/**
 *
 * @author USRBET
 */
public class Main {
    
    
    public static void main (String [] args){
        Vehiculo vehiculo1 = new Vehiculo(2016, 5, "PNG-456", "Rojo");
        vehiculo1.setPlaca("HKL-9863");
        Vehiculo vehiculo2 = new Vehiculo(2000, 3, "TGR-6587", "Negro");
        Vehiculo vehiculo3 = new Vehiculo(1997, 3, "IBR-963", "Azul");
        Vehiculo vehiculo4 = new Vehiculo(2010, 5, "PHP-864", "Verde");
        Vehiculo vehiculo5 = new Vehiculo(2008, 5, "GFG-367", "Gris");
        System.out.println("Placa del vehiculo es: "+vehiculo1.getPlaca());
                
    }
}
