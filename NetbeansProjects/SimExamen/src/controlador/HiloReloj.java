/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Leslie Diaz
 */
public class HiloReloj extends Thread {

    private JLabel txthora;

    public HiloReloj(JLabel txthora) {
        this.txthora = txthora;
    }

    @Override
    public void run() {
        while (true) {
            Date horaActual = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            txthora.setText(sdf.format(horaActual));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloReloj.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
