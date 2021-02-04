/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;


public class Hilo extends Thread{
    JProgressBar barra;
    String parrafo;
    JList<Object> lista;
    ArrayList <String> listatokens = new ArrayList<>();

    public Hilo(JProgressBar barra, String parrafo, JList<Object> lista) {
        this.barra = barra;
        this.parrafo = parrafo;
        this.lista = lista;
    }

    @Override
    public void run() {
       StringTokenizer st = new StringTokenizer (parrafo);
       barra.setMaximum(st.countTokens());
       int i = 0;
        for (;st.hasMoreTokens(); i ++) {
           String token = st.nextToken();
           System.out.println(token);
           barra.setValue(i);
           barra.setString("Esta avanzando " + i + "de" + st.countTokens());
           listatokens.add(token);
           actualizarListas(listatokens,lista);
           
           try {    
               sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }
    }
    
    public void actualizarListas (List lista, JList listaVista){
        DefaultListModel model = new DefaultListModel();  // index es la posicion en la que quiero guardar
        for (int i = 0; i < lista.size(); i++) {
            model.addElement(lista.get(i));
        }
        listaVista.setModel(model);
        listaVista.revalidate();//
        listaVista.repaint();
    }
    
   
            
    
    
}
