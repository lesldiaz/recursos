/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import clases.Horario;
import clases.Lista;
import clases.Materia;
import controlador.LeerEscribirArchivos;

import java.util.Scanner;

/**
 *
 * @author Leslie
 */
public class MainCrearHorMat {

    public static void main(String argv[]) {

//

Scanner sc = new Scanner(System.in);
//        int N;
//        Lista listaAlumnos = new Lista();
//        do {
//            System.out.println("Introduzca el numero de alumnos: ");
//            String k = sc.nextLine();
//            N = Integer.parseInt(k);
//
//        } while (N <= 0);
//
//        for (int i = 1; i <= N; i++) {
//            System.out.println("\nAlumno" + i + "\nDatos del Estudiante");
//            Alumno a = new Alumno();
//            //System.out.println("");
//            System.out.println("\nIngrese sus nombres completos:");
//            String nombre = sc.nextLine();
//            a.setNombres(nombre);
//
//            System.out.println("\nIngrese sus apellidos completos: ");
//            String apellido = sc.nextLine();
//            a.setApellidos(apellido);
//
//            System.out.println("\nIngrese su I.D.");
//            String ide = sc.nextLine();
//            a.setId(ide);
//
//            System.out.println("\nIngrese su Fecha de Nacimiento: ");
//            String fechanacimiento = sc.nextLine();
//            a.setFechanacimiento(fechanacimiento);
//
//            System.out.println("\nIngrese el Nro de matricula:");
//            String nummatricula = sc.nextLine();
//            try {
//                int nummatricula1 = Integer.parseInt(nummatricula);
//                a.setNummatricula(nummatricula1);
//
//            } catch (Exception e) {
//                nummatricula = "Ningun Valor Dado";
//                System.out.println("\nValor Incorrecto!!");
//            }
//
//            System.out.println("\nIngrese el semestre:");
//            String semestre = sc.nextLine();
//
//            try {
//                int semestre1 = Integer.parseInt(semestre);
//                a.setSemestre(semestre1);
//
//            } catch (Exception e) {
//                semestre = "Ningun Valor Dado";
//                System.out.println("\nValor Incorrecto!!");
//            }
//
//        System.out.println("\nNombre: " + nombre + "\nApellidos: " + apellido + "\nI.D.: " + ide + "\nFecha de nacimiento: " + fechanacimiento);
//        System.out.println("Nro de Matricula: " + nummatricula + "\nSemestre Actual: " + semestre);
//
//            listaAlumnos.add(a);
//        }
//
//      LeerEscribirArchivos leerEsc = new LeerEscribirArchivos();
//        //leerEsc.escribirarchivo(listaAlumnos, "listaAlumno");
//        Lista la = (Lista) leerEsc.leerArchivo("listaAlumno");
//        System.out.println("Total: " + la.size());
//        // System.out.println("Total alumnos:" + listaAlumnos.size());
//
//        Alumno alumnoaux = new Alumno();
//
//        for (int i = 0; i < listaAlumnos.size(); i++) {
//            alumnoaux = (Alumno) listaAlumnos.get(i);
//            System.out.println(alumnoaux.getNombres()+ alumnoaux.getApellidos());
//        }

        
        
//        int J;
//        Lista listaDocentes = new Lista();
//        do {
//            System.out.println("\nIntroduzca el numero de docentes: ");
//            String i = sc.nextLine();
//            J = Integer.parseInt(i);
//        } while (J <= 0);
//
//        for (int j = 1; j <= J; j++) {
//            System.out.println("\nDocente" + j);
//            Docente d = new Docente();
//            System.out.println("\nDatos del Docente");
//            System.out.println("\nIngrese sus nombres completos:");
//            String nombre1 = sc.nextLine();
//            d.setNombres(nombre1);
//
//            System.out.println("\nIngrese sus apellidos completos: ");
//            String apellido1 = sc.nextLine();
//            d.setApellidos(apellido1);
//
//            System.out.println("\nIngrese su I.D.");
//            String ide1 = sc.nextLine();
//            d.setId(ide1);
//
//            System.out.println("\nIngrese su Fecha de Nacimiento: ");
//            String fechanacimiento1 = sc.nextLine();
//            d.setFechanacimiento(fechanacimiento1);
//
//            System.out.println("\nIngrese el Nro de Alumnos:");
//            String numalumnos = sc.nextLine();
//            try {
//                int numalumnos1 = Integer.parseInt(numalumnos);
//                d.setNumalumnos(numalumnos1);
//
//            } catch (Exception e) {
//                numalumnos = "Ningun Valor Dado";
//                System.out.println("\nValor Incorrecto!!");
//            }
//            System.out.println("\nIngrese su remuneracion:");
//            String sueldo = sc.nextLine();
//            try {
//                double sueldo1 = Double.parseDouble(sueldo);
//                d.setSueldo(sueldo1);
//            } catch (Exception e) {
//                sueldo = "Ningun Valor Dado";
//                System.out.println("\nValor Incorrecto!!");
//            }
//            System.out.println("\nNombre: " + nombre1 + "\nApellidos: " + apellido1 + "\nI.D.: " + ide1 + "\nFecha de nacimiento: " + fechanacimiento1);
//            System.out.println("Nro de Alumnos: " + numalumnos + "\nSueldo Recibido: " + sueldo);
//
//            listaDocentes.add(d);
//        }
//        Docente docenteaux = new Docente();
//
//        for (int e = 0; e < listaDocentes.size(); e++) {
//           docenteaux = (Docente) listaDocentes.get(e);
//            System.out.println(docenteaux.getNombres());
//        }
//
//       LeerEscribirArchivos leerEsc3 = new LeerEscribirArchivos();
//        leerEsc3.escribirarchivo(listaDocentes, "listaDocentes");
//        
//        Lista ld = (Lista) leerEsc3.leerArchivo("listaDocentes");
//        for( int i = 0; i >10; i++){
//            Object o= ld.get(i);
//            Docente a = (Docente)o;
//        }
//        
//        System.out.println("Total: " + ld.size());
//       
//
//           LeerEscribirArchivos leerEsc = new LeerEscribirArchivos();
//           Lista la = (Lista) leerEsc.leerArchivo("listaAlumno");
//           for( int i = 1; i < 10; i++){
//            Object o = la.get(i);
//            Alumno a = (Alumno)o;
//            }
//           System.out.println("Total alumnos:" + la.size());
//
       
//
//       int L;
//       Lista listamateria = new Lista();
//        do{
//       System.out.println("Introduzca el numero de materias : ");
//            String k = sc.nextLine();
//            L = Integer.parseInt(k);
//
//      } while (L <= 0);
//      
//        for (int l=1; l <= L; l++){
//            System.out.println("\nDatos de la Materia:  " + l);
//            Materia m = new Materia();
//            
//            System.out.println("\nIngrese el Nombre de la Materia:");
//            String nombremateria = sc.nextLine();
//            m.setNombremateria(nombremateria);
//
//            System.out.println("\nIngrese el codigo de la materia: ");
//            String codigo = sc.nextLine();
//            m.setCodigo(codigo);
//
//            System.out.println("\nIngrese el numero de aula: ");
//            String aula = sc.nextLine();
//            m.setAula(aula);
//
//            System.out.println("\nIngrese su Grupo de Trabajo: ");
//            String grupo = sc.nextLine();
//            m.setGrupo(grupo);
//            
//            System.out.println("\nIngrese el numero de creditos de la materia: ");
//            String numcreditos = sc.nextLine();
//            
//            try {
//                int numcreditos1 = Integer.parseInt(numcreditos);
//                m.setNumcreditos(numcreditos1);
//
//            } catch (Exception e) {
//                numcreditos = "Ningun Valor Dado";
//                System.out.println("\nValor Incorrecto!!");
//            }
//            
//        System.out.println("\nNombre de la materia: " + nombremateria + "\nCodigo: " + 
//                codigo + "\nAula: " + aula + "\nGrupo: " + grupo);
//        System.out.println("Nro de Creditos: " + numcreditos);
//        
//        listamateria.add(m);
//        }
//      
//       Materia materiaaux = new Materia();
//
//        for (int o = 0; o < listamateria.size(); o++) {
//            materiaaux = (Materia) listamateria.get(o);
//            System.out.println(materiaaux.getNombremateria());
//        }
//
//       LeerEscribirArchivos leerEsc1 = new LeerEscribirArchivos();
//        leerEsc1.escribirarchivo(listamateria, "listaMateria");
//        Lista lm = (Lista) leerEsc1.leerArchivo("listaMateria");
//        System.out.println("Total: " + lm.size());
//        
        
       
       int M;
       Lista listahorarios = new Lista();
        do{
       System.out.println("Introduzca el numero de materias que tenga: ");
            String k = sc.nextLine();
            M = Integer.parseInt(k);

      } while (M <= 0);
      
        for (int h=1; h <= M; h++){
            System.out.println("\nHorario de la Materia:  " + h);
            Horario ho = new Horario();
            
            System.out.println("\nIngrese el Dia que le toca la materia " + h + ": ");
            String diamateria = sc.nextLine();
            ho.setDia(diamateria);

            System.out.println("\nIngrese la hora de inicio de la materia " + h + ": ");
            String horainicio = sc.nextLine();
            ho.setHorainicio(horainicio);

            System.out.println("\nIngrese la hora de fin de la materia: " + h + ": ");
            String horafin = sc.nextLine();
            ho.setHorafinal(horafin);

            System.out.println("\nMateria" + h + ": ");
            System.out.println("\nDia: " + diamateria + "\nHora de Inicio: " + 
                horainicio + "\nHora de Finalizacion: " + horafin);
        
        listahorarios.add(ho);
        }
      
       Horario horarioaux = new Horario();

        for (int u = 0; u < listahorarios.size(); u++) {
            horarioaux = (Horario) listahorarios.get(u);
            System.out.println(horarioaux.getDia());
        }

       LeerEscribirArchivos leerEsc2 = new LeerEscribirArchivos();
        leerEsc2.escribirarchivo(listahorarios, "listaHorarios");
        Lista lh = (Lista) leerEsc2.leerArchivo("listaHorarios");
        System.out.println("Total: " + lh.size());
        
        

    }

}


// http://172.31.19.81/Citrix/EPNVDIWeb/
//PRUEBA DESPUES DEL CONGRESO OSEA EL LUNES 21/11/2016