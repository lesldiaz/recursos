/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectarsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author PAVILLION
 */
public class ConectarSQL {
    Connection c;
    /**
     * @param args the command line arguments
     */
    
    public ConectarSQL() {
         try {
            String connectionUrl = "jdbc:sqlserver://;database=prueba2;integratedSecurity=true;";
            c = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
        } catch (SQLException ex) {
            System.out.println("Error.");
        }
    }

    public String ejecutarConsulta(JList<Cargo> lista) {
        String com = "";
        try {
            String SQL = "SELECT * FROM cargos";
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            DefaultListModel model = new DefaultListModel();
            
            for (int i =1; rs.next();i++) {
                Cargo ap = new Cargo();
                ap.setCodcar(rs.getString("codCargo"));
                ap.setNomcar(rs.getString("nomCargo"));
                ap.setSueldo(rs.getString("sueldomax"));
                ap.setFecha(rs.getString("fecha_creacion"));
                model.addElement(ap);
                lista.setModel(model);
                lista.revalidate();
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return com;
    }
     public String eliminarRegistro (JList<Cargo> lista,String cargo, int pos) {
        String com = "";
        try {
            String SQL = "DELETE FROM cargos WHERE CodCargo = "+cargo;
            Statement stmt = c.createStatement();
            int count = stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null,""+count+ " Registro Eliminado con exito");
            stmt.close();
            DefaultListModel<Cargo> cd = (DefaultListModel<Cargo>) lista.getModel();
            

        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return com;
    }

}
