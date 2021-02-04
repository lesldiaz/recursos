/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author PAVILLION
 */
public class Validar {

     public void actualizarListas (ArrayList lista, JList listaVista){
        DefaultListModel model = new DefaultListModel();  // index es la posicion en la que quiero guardar
        for (int i = 0; i < lista.size(); i++) {
            model.addElement(lista.get(i));
        }
        listaVista.setModel(model);
        listaVista.revalidate();//
        listaVista.repaint();
    }


}
