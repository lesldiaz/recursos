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
public class MainVehiculo {
    public static void main (String []args){
        
     Vehiculo vehiculo1=new Vehiculo(2015,4,"PRO-306","azul");
     vehiculo1.setColor("Verde");
     System.out.println("Placa del vehiculo es:" + vehiculo1.getPlaca());
     System.out.println("El color del vehiculo es:" + vehiculo1.getColor());
    }
   
}