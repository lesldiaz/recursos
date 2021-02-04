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
public class HiloFreno extends Thread {
    Avion avion;
    JTextField txtvelocidactual;
    String intervelo;
    boolean estado;
    double progreso;
    

    public HiloFreno(Avion avion, JTextField txtvelocidactual, String intervelo) {
        this.avion = avion;
        this.txtvelocidactual = txtvelocidactual;
        this.intervelo = intervelo;
        this.estado=true;
        this.progreso=avion.getVelocActual();
    }
    

    
    @Override
    public void run() {
       while(estado && progreso>=0){
           this.progreso -= Integer.parseInt(intervelo);
            avion.frenar(progreso);
            txtvelocidactual.setText(String.valueOf(avion.getVelocActual()));
        try {   
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloFreno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(avion.getVelocActual()==0){
            estado=false;
        }
       } 
        
        
    }
  
    
    
}
