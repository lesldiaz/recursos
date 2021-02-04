/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivacion;

/**
 *
 * @author PAVILLION
 */
public class CalcularDerivada {

    public double calcularDerivada(double dt,double p) {
        double valor1 = p + dt;
        double derivada = (Math.pow(valor1, 2)-4) - (Math.pow(p, 2))/(dt);
        return derivada;
    }
    
    
}
