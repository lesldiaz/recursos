/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lucho
 */
public class Persona implements Serializable{
    //Atributos
    private String nombres, apellidos, id, fechanacimiento;
    
    //Variables
    @SuppressWarnings("FieldMayBeFinal")
    private Date fechaActual = new Date(); /*Si va vacio es la fecha actual*/
    private Date fechaNacimiento;
    
    //Constructor
    public Persona(String nombres, String apellidos, String id, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.fechanacimiento = fechanacimiento;
    }

    public Persona() {
    }
    
    //Metodos
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
    
    public int calcularEdad (String fechanacimiento){
        int edad;
        Date fechaActual = new Date();
        Date fechaNacimiento = new Date(fechanacimiento);// yyyy/dd/mm
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY"); //Da el formato normal anio y mes en mayusculas, dia en minusculas
        String anionacimiento = sdf.format(fechaNacimiento); //sdf.format da el formato que se desea
        String anioactual = sdf.format(fechaActual);
        edad = Integer.parseInt(anioactual) - Integer.parseInt(anionacimiento);
        System.out.println ("\nEdad: " + edad);
        return edad;
    }

    @Override
    public String toString() {
        return ("Mi nombre es: "+nombres+" apellidos: "+apellidos); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
