/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 *
 * @author USRBET
 */
public class Validar {
   public List<Integer> camposVacios(List<String> campos){
        List<Integer> posicion =new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if(campo.trim().equals("")){
               posicion.add(i);
            }
        }
        return posicion;
    }
  
}

