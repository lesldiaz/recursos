/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura.de.metodos;

/**
 *
 * @author USRKAP
 */
public class EPregrado extends Estudiante {

    private String club;

    public EPregrado(String club, String datos) {
        super(datos);
        this.club = club;
    }
    @Override //Sobreescribir sea que se hubieran implemantado o no

    public void imprimir() {

        super.imprimir();
        System.out.println("El club al que pertenece es: " + this.club);

    }

}
