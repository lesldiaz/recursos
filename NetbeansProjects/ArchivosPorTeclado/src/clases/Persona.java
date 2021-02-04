/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USRBET
 */
public class Persona {

    private String nombres, apellidos, id, fechanacimiento;
    private Date fechaactual = new Date();
    private Date fechaNacimiento;
    

    public Persona(String nombres, String apellidos, String id, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int calcularEdad(String fechanacimiento) {
       
        int edad; //declarar la variable
        //edad = 0; darle un valor inicial de la variable
        fechaNacimiento = new Date(fechanacimiento); //yyyy/dd/mm
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
        String anionacimiento = sdf.format(fechaNacimiento);
        //System.out.println(anionacimiento); si quiero que me iprima el año de nacimiento
         
        //SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY"); innecesario
        String anioActual = sdf.format(fechaactual);
        //System.out.println(anioActual);si quiero que me imprima el año actual
        
        //int anioActual1 = Integer.parseInt(anioActual); innecesario
        //int anioNacimiento1 = Integer.parseInt(anionacimiento); innecesario
        
        edad = Integer.parseInt(anioActual) - Integer.parseInt(anionacimiento);
        System.out.println(edad);
       
        return edad;   //usamos la clase date de java

    }
    public Persona() {

    }
    
    @Override
    public String toString() {
        return ("Mi nombre es: " + nombres + " \nApellidos: " + apellidos + "\nId: " + id  ); //en ves de un system.out.println(en el main editamos el to string y listoo
    }

    
    
}
