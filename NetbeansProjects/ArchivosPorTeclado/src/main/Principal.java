/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Persona;
import java.util.Scanner;

/**
 *
 * @author Leslie
 */
public class Principal {
    
    public static void main(String argv[]) {
//        Persona p1 = new Persona("n3", "ap1", "1234567891", "1997-11-06");
////objeto: valores capsulados de una clases
//        Persona p2 = new Persona("n2", "ap2", "1234567891", "1998-10-30");
////clase: atributos y metodos
//        Persona p3 = new Persona("n3", "ap3", "1234567891", "1999-02-06");
//        Persona p4 = new Persona("n4", "ap4", "1234567891", "1974-12-16");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca el numero de personas: ");
//        String i = sc.nextLine();
//        int j = Integer.parseInt(i);
//
//                                            //Buscar en google "API java" como una guia de para que sirve esas clases atributos metodos etc; System.in es un metodo
//        // String nombre = sc.nextLine();
//        // p1.setNombres(nombre);
//        //recibir datos del teclado clase scanner y el nextLine();
//        // String apellido =sc.nextLine();
//        //p1.setApellidos(apellido);
//        //String ide =sc.nextLine();
//        //p1.setId(ide);
//        //String fechanacimiento =sc.nextLine();
//        // p1.setFechanacimiento(fechanacimiento);
//      //System.out.println("Nombres:" + p1.getNombres());
//        //System.out.println("Apellidos:" + p1.getApellidos());
//        //System.out.println("I.D.:" + p1.getId());
//        //System.out.println("Fecha de Nacimiento:" + p1.getFechanacimiento());
//        for (j = 0; j < 3; j++) {
//            Persona p = new Persona();
//            System.out.println("Ingrese sus nombres completos:");
//            String nombre = sc.nextLine();
//            p.setNombres(nombre);
//
//            System.out.println("Ingrese sus apellidos completos: ");
//            String apellido = sc.nextLine();
//            p.setApellidos(apellido);
//
//            System.out.println("Ingrese su I.D.");
//            String ide = sc.nextLine();
//            p.setId(ide);
//
//            System.out.println("Ingrese su Fecha de Nacimiento: ");
//            String fechanacimiento = sc.nextLine();
//            p.setFechanacimiento(fechanacimiento);
//
//            System.out.println("Nombre:" + nombre + "\nApellidos:" + apellido + "\nI.D.:" + ide + "\nFecha de nacimiento:" + fechanacimiento);
//
//        }
        
        clases.Persona persona1 = new clases.Persona();
        String hola = "Hola mundo";
        String fechanacimiento = "Mi edad es 1997/6/11"; //String es una clases y estamos creando un objeto de clase String
        //fechanacimiento = fechanacimiento.trim(); //Corta espacios el trim
        
//        //fechanacimiento = fechanacimiento.concat(hola);
//        //System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.intern(); 
//        System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.replaceAll("edad","YYYY" ); 
//        System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.replace("mundo",fechanacimiento);
//        System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.replaceFirst("Mi",fechanacimiento);
//        System.out.println(fechanacimiento);
          fechanacimiento = fechanacimiento.substring(11); 
//        System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.toLowerCase(); 
//        System.out.println(fechanacimiento);
//        fechanacimiento = fechanacimiento.toUpperCase(); 
//        System.out.println(fechanacimiento);
//       

          persona1.calcularEdad(fechanacimiento);
          System.out.println(persona1.toString() + "\nFecha de Nacimiento: " + fechanacimiento);
    }
}

//modelo entidad relacion