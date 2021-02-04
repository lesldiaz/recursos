/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author No Name
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        String opciones[]={"J vs J","J vs PC"};
        int opcion=JOptionPane.showOptionDialog(null, "Elija una opcion", "Tres en raya", 1, 1, null, opciones, 0);
        if(opcion==0){
            JuegoDosPersonas juego = new JuegoDosPersonas();
        }else if(opcion==1){
            JuegoDosPersonas juego = new JuegoDosPersonas();
        }
        
        
    }
    
}
