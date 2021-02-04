/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USRBET
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import modelo.Usuario;

public class Validar {

    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    //Ustedes pongan el objetos leer y escribir archivos 
    //leeryEscribirArchivos

    public List<Integer> camposVacios(List<String> campos) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if (campo.trim().equals("")) {
                pos.add(i);
            }
        }
        return pos;
    }

    public String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public int validarClave(String clave) {
        int valorBarra = 0;
//
        if (clave.length() > 5) {
            valorBarra = 100;
        } else {
            valorBarra = 50;
        }

        return valorBarra;
    }

    public String buscarUsuario(String usuario, String clave, boolean tipo) {
        //
        String nombreyApellido = "";
//        List<Object> listaUsuario = leeryEscribirArchivos.leerArchivos("Usuario.lista");
//        for (Object listaUsuario1 : listaUsuario) {
//            Usuario u = (Usuario) listaUsuario1;
//            if (u.getUsuario().equals(usuario) && u.getPass().equals(clave)
//                    && u.isTipo() == tipo) {
//                nombreyApellido = u.getNombreApellido();
//                break;
//            }
//        }
        return nombreyApellido;

    }

}
