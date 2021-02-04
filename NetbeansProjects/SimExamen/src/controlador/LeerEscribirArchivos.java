/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leslie Diaz
 */
public class LeerEscribirArchivos {

    public void escribirarchivo(Object objeto,String nombreArchivo) {

        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/" + nombreArchivo + ".arc"); 
// File.separator = para determinar si uso /: para windows o \: para linux
            ObjectOutputStream ous = new ObjectOutputStream (fos);
            ous.writeObject(objeto);
            ous.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
  
      public Object leerArchivo(String nombreArchivo){  
        Object objeto = null;
        try {
            FileInputStream fis = new FileInputStream("src/archivos/" + nombreArchivo + ".arc");
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      return objeto;
        
        
        }
}
