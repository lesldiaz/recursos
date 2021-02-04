/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
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
 * @author Lucho
 */
public class EscribirLeerArchivos {
    //Metodos
    public void crearArchivo (String nombreArchivo){
        try {
            FileOutputStream fos = new FileOutputStream("src"+ File.separator + "archivos" + File.separatorChar + nombreArchivo + ".lista");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirLeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escribirArchivos (Object Usuarios, String nombrearchivo){
        try {
            FileOutputStream fos = new FileOutputStream("src" + File.separatorChar + "archivos" + File.separatorChar + nombrearchivo +".lista");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(Usuarios);
            ous.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirLeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscribirLeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    
    public Object leerArchivo (String nombrearchivo) {
        Object objeto = null;
        try {
            FileInputStream fis = new FileInputStream ("src" + File.separatorChar + "archivos" + File.separatorChar + nombrearchivo +".lista");
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirLeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EscribirLeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objeto;
    }
}
