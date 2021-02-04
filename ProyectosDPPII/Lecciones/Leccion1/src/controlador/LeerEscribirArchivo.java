/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.Lista;
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
public class LeerEscribirArchivo {
    public void escribirArchivo (Lista lista, String nombreArchivo){
        try{
            FileOutputStream fos = new FileOutputStream("src" + File.separatorChar + "archivos" +File.separatorChar + nombreArchivo + ".lista");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(lista);
            ous.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object leerArchivo (String nombreArchivo){
        Object objeto = null;
        try {
            FileInputStream fis = new FileInputStream ("src"+File.separatorChar+"archivos"+File.separatorChar+nombreArchivo+".lista");
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objeto;
    }
}
