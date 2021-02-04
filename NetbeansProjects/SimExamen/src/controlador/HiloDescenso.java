/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import modelo.Avion;

/**
 *
 * @author Leslie Diaz
 */
public class HiloDescenso extends Thread {

    Avion avion;
    JTextField txtalturaactual;
    String interaltu;
    boolean estado;
    double progresoactual;

    public HiloDescenso(Avion avion, JTextField txtalturaactual, String interaltu) {
        this.avion = avion;

        this.txtalturaactual = txtalturaactual;
        this.interaltu = interaltu;
        this.estado = true;
        this.progresoactual = avion.getAltuActual();

    }

    @Override
    public void run() {
        while (estado == true) {
            if (avion.getAltuActual() >= 0) {
                this.progresoactual -= Integer.parseInt(interaltu);
                avion.descender(progresoactual);
                txtalturaactual.setText(String.valueOf(avion.getAltuActual()));

                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloDescenso.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (avion.getVelocActual() == progresoactual) {
                    estado = false;
                }
            }
        }

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
