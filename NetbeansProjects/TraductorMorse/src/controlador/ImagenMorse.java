/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author Leslie Diaz
 */
public class ImagenMorse extends javax.swing.JPanel{

    public ImagenMorse() {
    this.setSize(200,200);
    }
    

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/morse1.jpg"));
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }

}

