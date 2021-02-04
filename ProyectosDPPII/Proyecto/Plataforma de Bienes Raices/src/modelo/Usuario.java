/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class Usuario {

    Scanner sc = new Scanner(System.in);
    
    //Atributos
    private String nombres, appelidos, ci, correo, fechanacimiento, contrasenia;
    private List listacasas;
    private int telefonoconvencional, celular;

    //Constructor
    public Usuario(String nombres, String appelidos, String ci, String correo, String fechanacimiento, String contrasenia, List listacasas, int telefonoconvencional, int celular) {
        this.nombres = nombres;
        this.appelidos = appelidos;
        this.ci = ci;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.contrasenia = contrasenia;
        this.listacasas = listacasas;
        this.telefonoconvencional = telefonoconvencional;
        this.celular = celular;
    }

    public Usuario() {
    }

    //Metodos
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAppelidos() {
        return appelidos;
    }

    public void setAppelidos(String appelidos) {
        this.appelidos = appelidos;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List getListacasas() {
        return listacasas;
    }

    public void setListacasas(List listacasas) {
        this.listacasas = listacasas;
    }

    public int getTelefonoconvencional() {
        return telefonoconvencional;
    }

    public void setTelefonoconvencional(int telefonoconvencional) {
        this.telefonoconvencional = telefonoconvencional;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void agregarCasa() {
        Propiedad nuevapropiedad = new Propiedad();
        System.out.println("\nDatos de la Propiedad");
        System.out.println("\nNombre: ");
        String nombre = sc.nextLine();
        nuevapropiedad.setNombre(nombre);
        System.out.println("\nCalle Principal: ");
        String calleprincipal = sc.nextLine();
        nuevapropiedad.setCalleprincipal(calleprincipal);
        System.out.println("\nNumero: ");
        String numero = sc.nextLine();
        nuevapropiedad.setNumerocasa(numero);
        System.out.println("\nCalle Secundario: ");
        String callesecundaria = sc.nextLine();
        nuevapropiedad.setCallesecundaria(callesecundaria);
        System.out.println("\nSector: ");
        String sector = sc.nextLine();
        nuevapropiedad.setSector(sector);
        System.out.println("\nTipo (casa, departamento, etc): ");
        String tipo = sc.nextLine();
        nuevapropiedad.setTipo(tipo);
        System.out.println("\nExtension: ");
        String extension = sc.nextLine();
        nuevapropiedad.setExtension(extension);
        System.out.println("\nNumero de Cuartos: ");
        String numerocuartos = sc.nextLine();
        nuevapropiedad.setNumerocuartos(numerocuartos);
        System.out.println("\nIngrese una Breve Descripcion: ");
        String descripcion = sc.nextLine();
        nuevapropiedad.setDescripcion(descripcion);
        System.out.println("\nPrecio: ");
        String precio = sc.nextLine();
        try {
            double valor = Double.parseDouble(precio);
            nuevapropiedad.setPrecio(valor);
        } catch (Exception e) {
            System.out.println ("Precio invalido");
        }
        System.out.println("\nTipo de Contrato: ");
        String tipocontrato = sc.nextLine();
        nuevapropiedad.setTipocontrato(tipocontrato);
        listacasas.add(nuevapropiedad);
        System.out.println ("Casa Agregada");
    }

    public void eliminarCasa (){
        System.out.println ("Nombre de la propiedad que desea eliminar: ");
        String propiedadaborrar = sc.nextLine();
        for (int i = 0; i < listacasas.size(); i++) {
            Propiedad propiedad = (Propiedad) listacasas.get(i);
            if (propiedad.getNombre().equals(propiedadaborrar))
                listacasas.remove(i);
        }
        System.out.println ("Casa Removida");
    }
}
