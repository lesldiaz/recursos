/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucho
 */
public class Terreno extends Propiedad{
    //Atributos
    private double precio;
    
    //Constructor

    public Terreno(double precio, String nombre, String calleprincipal, String numerocasa, String callesecundaria, String sector, int extension, String descripcion, String tipocontrato) {
        super(nombre, calleprincipal, numerocasa, callesecundaria, sector, extension, descripcion, tipocontrato);
        this.precio = precio;
    }

    public Terreno() {
    }
    
    //Metodos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
