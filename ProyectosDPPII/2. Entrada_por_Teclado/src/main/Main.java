/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Alumno;
import clases.Docente;
//import clases.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el numero de personas: ");
//        int j = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < j; i++) {
//            Persona persona = new Persona();
//            System.out.println("\nDatos Persona "+ (i+1));
//            System.out.println("\nNombres: ");
//            String nombres = sc.nextLine();
//            persona.setNombres(nombres);
//            System.out.println("\nApellidos: ");
//            String apellidos = sc.nextLine();
//            persona.setApellidos(apellidos);
//            System.out.println("\nID: ");
//            String id = sc.nextLine();
//            persona.setID(id);
//            System.out.println("\nFecha de Nacimiento: ");
//            String fechanacimiento = sc.nextLine();
//            persona.setFechanacimiento(fechanacimiento);
//            System.out.println("\t\tPersona "+ (i+1) + '\n' + "Nombre: " + persona.getNombres() + '\n' + "Apellido: " + persona.getApellidos() + '\n' + "ID: " + persona.getID() + '\n' + "Fecha de Nacimiento: " + persona.getFechanacimiento());
//        }
        Docente docente1 = new Docente();
        System.out.println("\nDatos del Docente");
        System.out.println("\nNombres: ");
        String nombres = sc.nextLine();
        docente1.setNombres(nombres);
        System.out.println("\nApellidos: ");
        String apellidos = sc.nextLine();
        docente1.setApellidos(apellidos);
        System.out.println("\nID: ");
        String id = sc.nextLine();
        docente1.setID(id);
        System.out.println("\nFecha de Nacimiento: ");
        String fechanacimiento = sc.nextLine();
        docente1.setFechanacimiento(fechanacimiento);
        try{
        System.out.println("\nNumero de alumnos: ");
        String numalumnos = sc.nextLine();
        int numealumnos = Integer.parseInt(numalumnos);
        docente1.setNumalumnos(numealumnos);
        } catch (Exception e){
            System.out.println("Ingrese un numero valido");
        }
        
        System.out.println("\nSueldo: ");
        String sueldos = sc.nextLine();
        double sueldo = Double.parseDouble(sueldos);
        docente1.setSueldo(sueldo);
        System.out.println("\t\tDocente" + '\n' + "Nombre: " + docente1.getNombres() + '\n' + "Apellido: " + docente1.getApellidos() + '\n' + "ID: " + docente1.getID() + '\n' + "Fecha de Nacimiento: " + docente1.getFechanacimiento() + '\n' + "Numero de alumnos: " + docente1.getNumalumnos() + '\n' + "Sueldo: " + docente1.getSueldo());

        
        
        Alumno alumno = new Alumno();
        System.out.println("\nDatos del Alumno");
        System.out.println("\nNombres: ");
        String nombresa = sc.nextLine();
        alumno.setNombres(nombresa);
        System.out.println("\nApellidos: ");
        String apellidosa = sc.nextLine();
        alumno.setApellidos(apellidosa);
        System.out.println("\nID: ");
        String ida = sc.nextLine();
        alumno.setID(ida);
        System.out.println("\nFecha de Nacimiento: ");
        String fechanacimientoa = sc.nextLine();
        alumno.setFechanacimiento(fechanacimientoa);
        System.out.println("\nNumero de matricula: ");
        String nummatricula1 = sc.nextLine();
        int nummatricula = Integer.parseInt(nummatricula1);
        alumno.setNumMatricula(nummatricula);
        System.out.println("\nSemestre (En numeros): ");
        String semestres = sc.nextLine();
        int semestre = Integer.parseInt(semestres);
        alumno.setSemestre(semestre);
        System.out.println("\nNumero de materia: ");
        String nummaterias = sc.nextLine();
        int nummateria = Integer.parseInt(nummaterias);
        alumno.setNummateria(nummateria);
        System.out.println("\t\tDocente" + '\n' + "Nombre: " + alumno.getNombres() + '\n' + "Apellido: " + alumno.getApellidos() + '\n' + "ID: " + alumno.getID() + '\n' + "Fecha de Nacimiento: " + alumno.getFechanacimiento() + '\n' + "Numero de Materia: " + alumno.getNumMatricula() + '\n' + "Semestre: " + alumno.getSemestre() + '\n' + "Numero de materia: " + alumno.getNummateria());
    }

}
