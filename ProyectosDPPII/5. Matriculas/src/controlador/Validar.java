package controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USRBET
 */
public class Validar {

    EscribirLeerArchivos escribir = new EscribirLeerArchivos();

    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public List camposVacios(List<String> campos) {
        List<Integer> posicion = new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if (campo.trim().equals("")) {
                posicion.add(i);
            }
        }
        return posicion;
    }

    public static String encriptaEnMD5(String stringAEncriptar) {
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
        //
        int valorbarra = 0;
        if (clave.length() > 5) {
            valorbarra = 100;
        } else {
            valorbarra = 50;
        }
        return valorbarra;
    }

    public String buscarUsuario(String usuario, String clave, boolean tipo) {
        String nombreyApellido = "";
        List<Object> listaUsuario = (List) escribir.leerArchivo("lista_usuarios");
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = (Usuario) listaUsuario.get(i);
            if (u.getUsuario().equals(usuario) && u.getPass().equals(clave) && u.isTipo()==tipo) {
                nombreyApellido = u.getNomYAp();
                break;
            }
        }

        return nombreyApellido;
    }
    
    public int matricularUsuario (String usuario){
        Integer index = 0;
        List<Object> listaUsuario = (List) escribir.leerArchivo("lista_usuarios");
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = (Usuario) listaUsuario.get(i);
            if (u.getUsuario().equals(usuario)){
                index = i;
            }
        }
        return index;
    }

}
