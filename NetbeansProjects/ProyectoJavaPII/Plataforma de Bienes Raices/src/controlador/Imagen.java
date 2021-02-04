/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author Leslie Diaz
 */
public class Imagen extends javax.swing.JPanel{

    public Imagen() {
    this.setSize(200,300);
    }
    

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }

    public void copiarImg (BufferedImage bimage, String nombre){
        try {
            ColorModel cm = bimage.getColorModel(); //Obtengo el color de la imagen
            boolean isAlphaPre = cm.isAlphaPremultiplied(); //saber si es editada o no
            WritableRaster raster = bimage.copyData(null); //Obtener los datos escritos sobre la imagen
            //archivo de copia
            BufferedImage copiaBufferImage = new BufferedImage(cm, raster, isAlphaPre, null);
            //Buscamor ruta
            java.io.File guardarImagen = new java.io.File("Plataforma de Bienes Raices", nombre);
            ImageIO.write(copiaBufferImage, "png", guardarImagen);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

