/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leslie Diaz
 */
public class TablaPrueba {
    private int codigo;
    private double parametro1,parametro2;

    public TablaPrueba() {
    }

    public TablaPrueba(int codigo, double parametro1, double parametro2) {
        this.codigo = codigo;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getParametro1() {
        return parametro1;
    }

    public void setParametro1(double parametro1) {
        this.parametro1 = parametro1;
    }

    public double getParametro2() {
        return parametro2;
    }

    public void setParametro2(double parametro2) {
        this.parametro2 = parametro2;
    }
    
    
}
