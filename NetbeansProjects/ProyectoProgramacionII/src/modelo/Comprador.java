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
public class Comprador extends Usuario{
    private int transaccionescompletadas;

    public int getTransacciones() {
        return transaccionescompletadas;
    }

    public void setTransacciones(int transaccionescompletadas) {
        this.transaccionescompletadas = transaccionescompletadas;
    }

    public Comprador(int transaccionescompletadas , String nombresusuario, String apellidopaterno, String apellidomaterno, String documentoidentidad, String fechanacimiento, String email, String password, int telefconvencional, int celular) {
        super(nombresusuario, apellidopaterno, apellidomaterno, documentoidentidad, fechanacimiento, email, password, telefconvencional, celular);
        this.transaccionescompletadas = transaccionescompletadas;
        
    }
    
    
    
}
