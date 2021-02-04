package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import modelo.Avion;

public class HiloVelocidad extends Thread {

    JProgressBar barravelocidad;
    JTextField txtvelocidactual;
    String intervalo;
    Avion avion;
    int velocActual;
    boolean estado;
    int progreso;
    

    public HiloVelocidad(JProgressBar barravelocidad, JTextField txtvelocidactual, String intervalo, Avion avion, int velocActual) {
        this.barravelocidad = barravelocidad;
        this.txtvelocidactual = txtvelocidactual;
        this.intervalo = intervalo;
        this.avion = avion;
        this.velocActual = velocActual;
        this.estado = true;
        this.progreso = 0;
    }

    @Override
    public void run() {
        while (estado==true && progreso < avion.getVelocidadMax()) {
            barravelocidad.setMaximum((int) avion.getVelocidadMax());
                this.progreso += Integer.parseInt(intervalo);
                avion.acelerat(progreso);
                barravelocidad.setValue(progreso);
                barravelocidad.setString("Aumentando" + progreso + "[m/s]");
                txtvelocidactual.setText(String.valueOf(avion.getVelocActual()));
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloVelocidad.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (progreso == avion.getVelocidadMax()) {
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
