/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import coneccion.*;
import modelo.TablaPrueba;

/**
 *
 * @author Leslie Diaz
 */
public class BaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coneccion cnx = new Coneccion();
       cnx.obtener();
       new TablaPruebaBD(cnx).agregarValores(new TablaPrueba(1,5,9));
       cnx.cerrar();
       
       cnx = new Coneccion();
       cnx.obtener();
       new TablaPruebaBD(cnx).buscarTodo();
    }
    
}
