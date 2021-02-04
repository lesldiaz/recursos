/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion;

import clases.Alumno1;
import clases.Lista;

/**
 *
 * @author Lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno1 a1 = new Alumno1(01102,5,"Nombre A1","Apellido A1","","");
        Alumno1 a2 = new Alumno1(01103,4,"Nombre A2","Apellido A2","","");
        Alumno1 a3 = new Alumno1(01104,6,"Nombre A3","Apellido A2","","");
        Lista l = new Lista();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        controlador.LeerEscribirArchivo lio = new controlador.LeerEscribirArchivo();
        lio.escribirArchivo (l, "leccion1");
        l=(Lista) lio.leerArchivo("leccion1");
        System.out.println(l);
        System.out.println("tamaño del archivo: "+ l.size());
    }
    
}
