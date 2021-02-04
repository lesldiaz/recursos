/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Leslie Diaz
 */
public class Validar {
    private static final char[] CONSTS_HEX = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f' };
    
    public List<Integer> camposVacios(List<String> campos){
        List<Integer> posicion =new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if (campo.trim().equals("")){
               posicion.add(i);
            }
        }
        return posicion;
    }

    public  String encriptaEnMD5(String stringAEncriptar){
        try
        {
           MessageDigest msgd = MessageDigest.getInstance("MD5");
           byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
           StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
           for (int i = 0; i < bytes.length; i++)
           {
               int bajo = (int)(bytes[i] & 0x0f);
               int alto = (int)((bytes[i] & 0xf0) >> 4);
               strbCadenaMD5.append(CONSTS_HEX[alto]);
               strbCadenaMD5.append(CONSTS_HEX[bajo]);
           }
           return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
           return null;
        }
    }

    public boolean isEmail (String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat =pat.matcher(correo);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarCedula(String cedula){
        int total=0,tamanoLongitudCedula=10,numeroProvincias=24,tercerDigito=6;
        int [] coeficientes = {2,1,2,1,2,1,2,1,2};
        if(cedula.matches("[0-9]*")&& cedula.length()==tamanoLongitudCedula){
            int provincia= Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitoTres = Integer.parseInt(cedula.charAt(2) + "");
            
            if( provincia>0 && provincia<=numeroProvincias && digitoTres<tercerDigito){
                int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9)+ "");
                for(int i=0;i<coeficientes.length;i++){
                    int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i)+ "");
                    total = valor>=10? total + (valor-9) : total + valor;
                }
                int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;
                
                if(digitoVerificadorObtenido == digitoVerificadorRecibido){
                    return true;
                }
            }
            return false;
        }
    return false;
    }
}
