/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TablaPrueba;
/**
 *
 * @author Leslie Diaz
 */
public class TablaPruebaBD {
    private Coneccion coneccion;

    public TablaPruebaBD(Coneccion coneccion) {
        this.coneccion = coneccion;
    }

    public Coneccion getConeccion() {
        return coneccion;
    }

    public void setConeccion(Coneccion coneccion) {
        this.coneccion = coneccion;
    }
    
   public int agregarValores(TablaPrueba tablaprueba){
       int valor = -1;
       try {
            PreparedStatement ps = coneccion.getCnx().prepareStatement("INSERT INTO TablaPruebaBD" + "VALUES (0,"+tablaprueba.getParametro1()+ "," +tablaprueba.getParametro2() +")" );
            valor = ps.executeUpdate();
        } catch (SQLException ex) {
            valor = -1;
        }
      coneccion.cerrar();
      return valor;
   }
   
   public void buscarTodo(){
        try {
            PreparedStatement ps = coneccion.getCnx().prepareStatement("SELECT * FROM TablaPruebaBD");
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                System.out.println(resultado.getInt("codigo"));
                System.out.println(resultado.getDouble("parametro1"));
                System.out.println(resultado.getInt("parametro2"));
            }
         coneccion.cerrar();     
        } catch (SQLException ex) {
            Logger.getLogger(TablaPruebaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
