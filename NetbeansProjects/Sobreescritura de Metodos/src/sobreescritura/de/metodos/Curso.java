/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura.de.metodos;

import java.util.ArrayList;

/**
 *
 * @author USRKAP
 */
public class Curso {

    private String cod;
    private String nombre;
    private String aula;
    private String creditos;
    private ArrayList<Estudiante> estudiantes;
    private int numestudiantes;

    public Curso(String datos) {
        String[] datos1 = datos.split(",");
        this.cod = datos1[0];
        this.nombre = datos1[1];
        this.aula = datos1[2];
        this.creditos = datos1[3];

    }

    public void Registrar(Estudiante estudiante) {
        int aux = 0;
        for (Estudiante e : this.estudiantes) {
            if (estudiante.getCI().equals(e.getCI())) {
                System.out.println("El estudiante ya esta matriculado");
                aux = 1;
            }
        }
        if (aux == 0) {
            this.estudiantes.add(estudiante);
            this.numestudiantes++;
        }
    }

    public void imprimirEstudiantes() {
        int cont = 1;
        for (Estudiante e : this.estudiantes) {
            System.out.println(cont + ". " + e.toString());
            cont++;
        }
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
