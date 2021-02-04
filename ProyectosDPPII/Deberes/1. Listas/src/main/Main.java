/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.*;
import controlador.LeerEscribirArchivos;
import java.util.*;

/**
 *
 * @author Lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista listaalumnos = new Lista();
        ListaD listadocentes = new ListaD();
        ListaM listamaterias = new ListaM();
        ListaH listahorarios = new ListaH();
        String numero;
//        ListaG listaalumnos=new ListaG();
//        ListaG listadocentes = new ListaG();
//        ListaG listamaterias = new ListaG();
//        ListaG listahorarios = new ListaG();
        String opcionmenu_aux, submenu_aux;
        LeerEscribirArchivos crear = new LeerEscribirArchivos();
        int aux;
        int opcionmenu1 = 0;
        int submenu = 0;
        boolean error = true;
        boolean error_submenu = true;
        boolean error_lectura = true;
        Alumno alumno_aux;
        Docente docente_aux;
        do {
            System.out.println("\t\tMENU" + "\n1. Lista de Alumnos" + "\n2. Lista de Docentes" + "\n3. Crear Archivo de Materias" + "\n4. Crear Archivo de Horarios" + "\n5.Agregar Materias" + "\n6.Agregar horario" + "\n0. Salir" + "\nIngrese una opcion: ");
            do {
                error = true;
                error_submenu = true;
                opcionmenu1 = 0;
                submenu = 0;
                try {
                    opcionmenu_aux = sc.nextLine();
                    opcionmenu1 = Integer.parseInt(opcionmenu_aux);
                    error = false;
                } catch (Exception e) {
                    System.out.println("Opcion Incorrecta");
                    System.out.println("Ingrese una opcion valida: ");
                }
            } while (error == true);
            switch (opcionmenu1) {
                case (1):
                    do {
                        System.out.println("\n\t\tSUBMENU" + "\n1. Agregar Alumno (Se crea el archivo de Lista)" + "\n2. Imprimir Lista de Alumnos"
                                + "\n0. Salir del Submenu" + "\nIngrese una opcion: ");
                        do {
                            try {
                                submenu_aux = sc.nextLine();
                                submenu = Integer.parseInt(submenu_aux);
                                error_submenu = false;
                            } catch (Exception e) {
                                System.out.println("Opcion Incorrecta");
                                System.out.println("Ingrese una opcion valida: ");
                            }
                        } while (error_submenu == true);
                        switch (submenu) {
                            case (1): {
                                Alumno alumno = new Alumno();
                                System.out.println("\nDatos del Alumno");
                                System.out.println("\nNombres: ");
                                String nombres = sc.nextLine();
                                alumno.setNombres(nombres);
                                System.out.println("\nApellidos: ");
                                String apellidos = sc.nextLine();
                                alumno.setApellidos(apellidos);
                                System.out.println("\nID: ");
                                String id = sc.nextLine();
                                alumno.setId(id);
                                System.out.println("\nFecha de Nacimiento(yyyy/mm/dd): ");
                                String fechanacimiento = sc.nextLine();
                                alumno.setFechanacimiento(fechanacimiento);
//                                System.out.println(alumno.toString()); //me devuelve el metodo modificado de la clase persona
//                                fechanacimiento = fechanacimiento.concat(" holi boli boli FK FK FK"); //junta strings
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.replace("holi","wacamoli"); //remplaza todos los strings
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.replace("i","e"); //remplaza una letra
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.replaceAll("FK","HS"); //todas las strings
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.replaceFirst("bole", "FY FK"); //remplaza el primero
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.substring(5); //toma desde ese hasta el final
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.substring(3,20); //toma en ese intervalo
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.toLowerCase(); //minusculas
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.toUpperCase(); //mayusculas
//                                System.out.println(fechanacimiento);
//                                fechanacimiento = fechanacimiento.trim();
//                                System.out.println(fechanacimiento);

//                                alumno.calcularEdad(fechanacimiento);
                                System.out.println("\nNumero de matricula: ");
                                do {
                                    try {
                                        String nummatricula1 = sc.nextLine();
                                        int nummatricula = Integer.parseInt(nummatricula1);
                                        error_lectura = false;
                                        alumno.setNummatricula(nummatricula);
                                    } catch (Exception e) {
                                        System.out.println("Dato no valido por favor vuelva a ingresarlo.");
                                        System.out.println("Ingrese el dato: ");
                                    }
                                } while (error_lectura == true);
                                error_lectura = true;

                                System.out.println("\nSemestre (En numeros): ");
                                do {
                                    try {
                                        String semestres = sc.nextLine();
                                        int semestre = Integer.parseInt(semestres);
                                        error_lectura = false;
                                        alumno.setSemestre(semestre);
                                    } catch (Exception e) {
                                        System.out.println("Dato no valido por favor vuelva a ingresarlo.");
                                        System.out.println("Ingrese el dato: ");
                                    }
                                } while (error_lectura == true);
                                error_lectura = true;

                                System.out.println("\nNumero de materia: ");
                                do {
                                    try {
                                        String nummaterias = sc.nextLine();
                                        int nummateria = Integer.parseInt(nummaterias);
                                        error_lectura = false;
                                        alumno.setNummateria(nummateria);
                                    } catch (Exception e) {
                                        System.out.println("Dato no valido por favor vuelva a ingresarlo.");
                                        System.out.println("Ingrese el dato: ");
                                    }
                                } while (error_lectura == true);
                                error_lectura = true;

                                listaalumnos.add(alumno);
                                LeerEscribirArchivos Escribir = new LeerEscribirArchivos();
                                Escribir.escribirArchivo(listaalumnos, "listaAlumno");
                                System.out.println("Alumno agregado exitosamente.");
                            }
                            break;
                            case (2):
                                LeerEscribirArchivos leer = new LeerEscribirArchivos();
                                Lista la = (Lista) leer.leerArchivo("listaAlumno");
                                for (int i = 0; i < la.size(); i++) {
                                    aux = i + 1;
                                    alumno_aux = la.get(i);
                                    System.out.println("\n\t\tAlumno " + aux + '\n' + "Nombre: " + alumno_aux.getNombres() + '\n' + "Apellido: " + alumno_aux.getApellidos() + '\n' + "ID: " + alumno_aux.getId() + '\n' + "Fecha de Nacimiento: " + alumno_aux.getFechanacimiento() + '\n' + "Numero de matricula: " + alumno_aux.getNummatricula() + '\n' + "Semestre: " + alumno_aux.getSemestre() + "\nNumero de materia: " + alumno_aux.getNummateria());
                                }
                                break;
                            case (0):
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                                break;
                        }

                    } while (submenu != 0);
                    break;
                case (2):
                    do {
                        System.out.println("\n\t\tSUBMENU" + "\n1. Agregar Docente (Se crea el arhivo de Lista)" + "\n2. Imprimir Lista de Docentes"
                                + "\n0. Salir del Submenu" + "\nIngrese una opcion: ");
                        do {
                            try {
                                submenu_aux = sc.nextLine();
                                submenu = Integer.parseInt(submenu_aux);
                                error_submenu = false;
                            } catch (Exception e) {
                                System.out.println("Opcion Incorrecta");
                                System.out.println("Ingrese una opcion valida: ");
                            }
                        } while (error == true);
                        switch (submenu) {
                            case (1): {
                                Docente docente = new Docente();
                                System.out.println("\nDatos del Docente");
                                System.out.println("\nNombres: ");
                                String nombres = sc.nextLine();
                                docente.setNombres(nombres);
                                System.out.println("\nApellidos: ");
                                String apellidos = sc.nextLine();
                                docente.setApellidos(apellidos);
                                System.out.println("\nID: ");
                                String id = sc.nextLine();
                                docente.setId(id);
                                System.out.println("\nFecha de Nacimiento: ");
                                String fechanacimiento = sc.nextLine();
                                docente.setFechanacimiento(fechanacimiento);

                                System.out.println("\nNumero de alumnos: ");
                                do {
                                    try {
                                        String numalumnos_aux = sc.nextLine();
                                        int numalumnos = Integer.parseInt(numalumnos_aux);
                                        error_lectura = false;
                                        docente.setNumalumnos(numalumnos);
                                    } catch (Exception e) {
                                        System.out.println("Opcion Incorrecta");
                                        System.out.println("Ingrese una opcion valida: ");
                                    }
                                } while (error_lectura == true);
                                error_lectura = true;

                                System.out.println("\nSueldo: ");
                                do {
                                    try {
                                        String sueldo_aux = sc.nextLine();
                                        double sueldo = Double.parseDouble(sueldo_aux);
                                        error_lectura = false;
                                        docente.setSueldo(sueldo);
                                    } catch (Exception e) {
                                        System.out.println("Opcion Incorrecta");
                                        System.out.println("Ingrese una opcion valida: ");
                                    }
                                } while (error_lectura == true);
                                error_lectura = true;

                                listadocentes.add(docente);
                                LeerEscribirArchivos Escribir = new LeerEscribirArchivos();
                                Escribir.escribirArchivo(listadocentes, "listaDocentes");
                                System.out.println("Docente agregado exitosamente.");
                            }
                            break;
                            case (2):
                                LeerEscribirArchivos leer = new LeerEscribirArchivos();
                                ListaD ld = (ListaD) leer.leerArchivo("listaDocentes");
                                for (int i = 0; i < listadocentes.size(); i++) {
                                    aux = i + 1;
                                    docente_aux = ld.get(i);
                                    System.out.println("\n\t\tDocente " + aux + '\n' + "Nombres: " + docente_aux.getNombres() + '\n' + "Apellido: " + docente_aux.getApellidos() + '\n' + "ID: " + docente_aux.getId() + '\n' + "Fecha de Nacimiento: " + docente_aux.getFechanacimiento() + '\n' + "Numero de alumnos: " + docente_aux.getNumalumnos() + '\n' + "Sueldo: " + docente_aux.getSueldo());
                                }
                                break;
                            case (0):
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                                break;
                        }
                    } while (submenu != 0);
                    break;
                case (3):
                    crear.crearArchivo("listaMaterias");
                    System.out.println("Archivo creado correctamente.\n");
                    break;
                case (4):
                    crear.crearArchivo("listaHorarios");
                    System.out.println("Archivo creado correctamente.\n");
                    break;
                case (5):
                    System.out.println ("Ingrese el numero de materias a ingresar");
                    numero = sc.nextLine();
                    for (int i = 0; i < Integer.parseInt(numero); i++) {
                        Materia materia = new Materia();
                        System.out.println("\nDatos de la Materia");
                        System.out.println("\nNombre: ");
                        String nombre = sc.nextLine();
                        materia.setNombre(nombre);
                        System.out.println("\nCodigo: ");
                        String codigo = sc.nextLine();
                        materia.setCodigo(codigo);
                        System.out.println("\nAula: ");
                        String aula = sc.nextLine();
                        materia.setAula(aula);
                        System.out.println("\nGrupo: ");
                        String grupo = sc.nextLine();
                        materia.setGrupo(grupo);
                        System.out.println("\nNumero de Creditos: ");
                        String numcreditos = sc.nextLine();
                        materia.setNumerocreditos(Integer.parseInt(numcreditos));
                        listamaterias.add(materia);
                    }
                    crear.escribirArchivo(listamaterias, "listaMaterias");
                    break;
                case (6):
                    System.out.println ("Ingrese el numero de horarios a ingresar");
                    numero = sc.nextLine();
                    for (int i = 0; i < Integer.parseInt(numero); i++) {
                        Horario horario = new Horario();
                        System.out.println("\nDatos del Horario");
                        System.out.println("\nDia: ");
                        String dia = sc.nextLine();
                        horario.setDia(dia);
                        System.out.println("\nHora de inicio: ");
                        String inicio = sc.nextLine();
                        horario.setHorainicio(inicio);
                        System.out.println("\nHora de finalizacion: ");
                        String hfinal = sc.nextLine();
                        horario.setHorafinal(hfinal);
                        listahorarios.add(horario);
                    }
                    crear.escribirArchivo(listahorarios, "listaHorarios");
                        break;       
            case (0):
                    System.out.println("Gracias por usar este programa."
                            + "\nAdios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcionmenu1 != 0);
        }

    }
