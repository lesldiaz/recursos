package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import modelo.Avion;

public class HiloAltura extends Thread {

    JProgressBar barraaltura;
    JTextField txtalturaactual;
    String intervalo;
    Avion avion;
    int alturaActual;
    boolean estado;
    int progreso;
    

    public HiloAltura(JProgressBar barraaltura, JTextField txtalturaactual, String intervalo, Avion avion, int alturaActual) {
        this.barraaltura = barraaltura;
        this.txtalturaactual = txtalturaactual;
        this.intervalo = intervalo;
        this.avion = avion;
        this.alturaActual = alturaActual;
        this.estado = true;
        this.progreso = 0;
    }

    @Override
    public void run() {
        while (estado==true && progreso < avion.getAlturaMax()) {
            barraaltura.setMaximum((int) avion.getAlturaMax());
                this.progreso += Integer.parseInt(intervalo);
                avion.ascender(progreso);
                barraaltura.setValue(progreso);
                barraaltura.setString("Aumentando" + progreso + "[m]");
                txtalturaactual.setText(String.valueOf(avion.getAltuActual()));
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloAltura.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (progreso == avion.getAlturaMax()) {
                    estado = false;
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
