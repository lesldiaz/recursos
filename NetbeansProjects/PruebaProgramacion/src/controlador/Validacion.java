/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import vista.Ventana;
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
 * @author USRBET
 */
public class Validacion {
    
    public boolean verificarCedula(String cedula){
        int total=0,tamanoLongitudCedula=10,numeroProvincias=24,tercerDigito=6;
        int [] coeficientes = {2,1,2,1,2,1,2,1,2};
        if(cedula.matches("[0-9]*")&& cedula.length()==tamanoLongitudCedula){
            int provincia= Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitoTres = Integer.parseInt(cedula.charAt(2) + "");
            
            if( provincia>0 && provincia<=numeroProvincias && digitoTres<tercerDigito){
                int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9)+ "");
                for(int i=0;i<coeficientes.length;i++){
                    int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i)+ "");
                    total = valor>=10? total + (valor-9) : total + valor;
                }
                int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;
                
                if(digitoVerificadorObtenido == digitoVerificadorRecibido){
                    return true;
                }
            }
            return false;
        }
    return false;
    }
    
     public void copiarImg(BufferedImage bimage,String nombrecopia) { // buffered imagen es un almacenamiento de algo se guarda en un espacio de memoria buffer contenedor pequeño donde puedo almacenar cosas
        // ctrl + c
        ColorModel cm = bimage.getColorModel();
        //OBTENGO el color de la imagen, esa imagen tiene datos: pixel RGB : 0 a 255 a cada pizel, obtenemos todo el modelo de ese pixel obtengo todo el modelo rgb
        boolean alpha = cm.isAlphaPremultiplied(); //es un boolean y nos indica si la imagen es editada, nos sirve para mantener la edicion de la imagen
        WritableRaster raster = bimage.copyData(null); /// obtener los DATOS escritos sobre la imagen
        //arcivo de copia ctrl + v
        BufferedImage copia = new BufferedImage(cm,raster, alpha, null);
        // buscar la ruta de la imagen, ruta para guardar
        File guardarimagen = new File("L:\\Familia\\Documents\\NetBeansProjects\\PruebaProgramacion\\src\\imagenes", nombrecopia);//nombrecopia es el nombre de la misma imagen
        try {
            ImageIO.write(copia,"jpg", guardarimagen);
        } catch (IOException ex) { // no se pueda leer escribir, imagen protegida, no encuetra direccion
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public List<Integer> camposVacios(List<String> campos){
        List<Integer> posicion =new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if(campo.trim().equals("")){
               posicion.add(i);
            }
        }
        return posicion;
    }
      
      public void escribirarchivo(Object objeto,String nombreArchivo) {

        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/" + nombreArchivo + ".lista"); 
// File.separator = para determinar si uso /: para windows o \: para linux
            ObjectOutputStream ous = new ObjectOutputStream (fos);
            ous.writeObject(objeto);
            ous.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
    public Object leerArchivo(String nombreArchivo){  
        Object objeto = null;
        try {
            FileInputStream fis = new FileInputStream("src/archivos/" + nombreArchivo + ".lista");
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      return objeto;
        
        
        }
}
