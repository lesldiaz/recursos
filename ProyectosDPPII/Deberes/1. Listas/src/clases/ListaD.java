/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author USRBET
 */
public class ListaD extends ArrayList<Docente> implements Serializable{

    @Override
    public boolean add(Docente e) {
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
