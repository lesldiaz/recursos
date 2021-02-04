/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

/**
 *
 * @author Leslie Diaz
 */
public class VerificarCedula {
    int total=0,tamanoLongitudCedula=10,numeroProvincias=24,tercerDigito=6;
    int [] coeficientes = {2,1,2,1,2,1,2,1,2};
    public boolean VerificarCedula(String cedula){
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
