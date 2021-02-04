/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura.de.metodos;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author USRKAP
 */
public class Estudiante {

    private String CI;
    private String numUnico;
    private String nombre;
    private String apellido;
    private ArrayList<Curso> cursos;
    public ArrayList<Estudiante> estudiantes=new ArrayList<Estudiante>();
    private EPregrado pregrado;
   

    public Estudiante(String datos) {
        this.cursos = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(datos, ",");
        this.CI = st.nextToken();
        this.numUnico = st.nextToken();
        this.nombre = st.nextToken();
        this.apellido = st.nextToken();
       // this.pregrado=st.nextToken();
        
    }

    public String getNumUnico() {
        return numUnico;
    }

    public void setNumUnico(String numUnico) {
        this.numUnico = numUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public EPregrado getPregrado() {
        return pregrado;
    }

    public void setPregrado(EPregrado pregrado) {
        this.pregrado = pregrado;
    }

    public void imprimir() {

        this.CI = "";
        this.apellido = "";
        this.nombre = "";
        this.numUnico = "";

        System.out.println("Ingrese numero de cedula:" + this.CI + "\n" + "Ingrese  numero :" + this.numUnico + "\n" + "Ingrese el nombre:" + this.nombre + "\n" + "Ingrese el apellido" + this.apellido);

    }
    
 
    public void Matricular(String datos) {

        ArrayList<Curso> Listacurso = new ArrayList<Curso>();
        this.cursos = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(datos, ",");
        this.CI = st.nextToken();
        this.numUnico = st.nextToken();
        this.nombre = st.nextToken();
        this.apellido = st.nextToken();

    }

    public String getCI() {
        return CI;
    }
      public void matricula(Curso curso){
        cursos.add(curso);
        curso.Registrar(this);
    }

    @Override
    public String toString() {
        return "Ci=" + CI + "." + "\t Numero Unico=" + numUnico + "." + "\t Nombre=" + nombre + "." + "\t Apellido=" + apellido + "." + "\t";
    }

}
