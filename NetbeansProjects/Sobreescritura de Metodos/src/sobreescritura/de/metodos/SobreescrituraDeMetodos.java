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
public class SobreescrituraDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c=new Curso("SIC216,Programacion II,SIS507");
        Estudiante e1=new Estudiante("1805094230,201520640,Jose,Murillo");
        Estudiante e2=new Estudiante("1704567892,201567324,Luis,Moran");
        Estudiante e3=new Estudiante("1803452836,201525639,Juan,Noboa");
        Estudiante e4=new Estudiante("1703248364,201573929,Carlos,Arcos");
        e1.matricula(c);
        e2.matricula(c);
        e3.matricula(c);
        e4.matricula(c);
        
        c.imprimirEstudiantes();
    }
    
}
