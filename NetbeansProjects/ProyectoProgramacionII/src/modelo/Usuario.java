/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leslie Diaz
 */
public class Usuario {
    private String nombresusuario,apellidopaterno,apellidomaterno,documentoidentidad,fechanacimiento,email,password;
    

    public Usuario(String nombresusuario, String apellidopaterno, String apellidomaterno, String documentoidentidad, String fechanacimiento, String email, String password, int telefconvencional, int celular) {
        this.nombresusuario = nombresusuario;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.documentoidentidad = documentoidentidad;
        this.fechanacimiento = fechanacimiento;
        this.email = email;
        this.password = password;
        
    }

    public String getNombresusuario() {
        return nombresusuario;
    }

    public void setNombresusuario(String nombresusuario) {
        this.nombresusuario = nombresusuario;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getDocumentoidentidad() {
        return documentoidentidad;
    }

    public void setDocumentoidentidad(String documentoidentidad) {
        this.documentoidentidad = documentoidentidad;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    
 
}
