package dinamicaex;

import java.awt.*;
import javax.swing.*;

public class Imagen extends javax.swing.JPanel {

    public Imagen() {
        this.setSize(400, 225); //se selecciona el tamaño del panel
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/dinamicaex/20160819_193204-1.jpg"));
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }

}
