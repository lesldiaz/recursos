/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Lucho
 */
public class Comprador extends Usuario{
    //Atributos
    int transaccionescompletadas;

    //Constructor

    public Comprador(int transaccionescompletadas, String nombres, String appelidos, String ci, String correo, String fechanacimiento, String contrasenia, List listacasas, int telefonoconvencional, int celular) {
        super(nombres, appelidos, ci, correo, fechanacimiento, contrasenia, listacasas, telefonoconvencional, celular);
        this.transaccionescompletadas = transaccionescompletadas;
    }
    
    public Comprador(int transaccionescompletadas) {
        this.transaccionescompletadas = transaccionescompletadas;
    }

    public Comprador() {
    }
    
    //Metodos
    public int getTransaccionescompletadas() {
        return transaccionescompletadas;
    }

    public void setTransaccionescompletadas(int transaccionescompletadas) {
        this.transaccionescompletadas = transaccionescompletadas;
    }
    
    public Citas agendarCita (){
        Citas cita = new Citas();
        System.out.println("\nDatos de la Cita");
        System.out.println("\nDia de la semana: ");
        String dia = sc.nextLine();
        cita.setDiadelasemana(dia);
        System.out.println("\nFecha: ");
        String fecha = sc.nextLine();
        cita.setFecha(fecha);
        System.out.println("\nHora (HH:MM): ");
        String hora = sc.nextLine();
        cita.setHora(hora);
        System.out.println ("Cita Agregada Correctamente");
        return cita;
    }
}
