/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

/**
 *
 * @author Lucho
 */
public class HiloContrasenia extends Thread{
    //Atributos
    private JProgressBar barra;
    private JPasswordField texto;
    
    //Metodos

    public HiloContrasenia(JProgressBar barra, JPasswordField texto) {
        this.barra = barra;
        this.texto = texto;
    }

    @Override
    public void run() {
        barra.setMaximum(8);
        barra.setValue(texto.getText().length()-1);
    }
}
