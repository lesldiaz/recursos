package main;

import clases.Persona;

public class MainPersona {

    public static void main(String[] args) {
    //       con el costructor por parametros
        Persona p1 = new Persona("Leslie", "apellidos", "cedula", "fecha de nacimiento");
        Persona p2 = new Persona("Traecy", "apellidos", "cedula", "fecha de nacimiento");
        Persona p3 = new Persona("Carmen", "apellidos", "cedula", "fecha de nacimeinto");
        Persona p4 = new Persona("Manuel", "apellidos", "cedula", "fecha de nacimeinto");
        System.out.println("Los Integrantes de la Familia son: \n" + p1.getNombre() + "\n"+ p2.getNombre()+"\n"+p3.getNombre()+ "\n"+p4.getNombre());
        
    //       con el constructor por defecto
        Persona p = new Persona();
        for (int i = 0; i <= 4; i++) {
            
            p.setNombre("nombre " + i);
            p.setApellidos("apellido " + i);
            p.setCedula("cedula " +i);
            p.setFechadenacimiento("fechadenacimiento " + i);
            
        System.out.println("Los datos son: \n " +p.getNombre() +"\n "+ p.getApellidos()+"\n "+ p.getCedula()+"\n "+ p.getFechadenacimiento());
        }
    
    }
}
