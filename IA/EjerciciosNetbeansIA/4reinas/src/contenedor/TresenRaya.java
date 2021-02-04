/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.edu.tresenraya;

import java.util.Objects;

/**
 *
 * @author jefferson
 */
public class TresenRaya {

    static Tree arbolGeneral;
    static Node nodoInicial;
    static Node nodoSolucion;
    static Integer[][] inicioDeJuego = {{1, 0, 0}, {2, 2, 0}, {0, 0, 0}};// 1 representa al primer jugador, 2 al segundo, 0 que esta vacio 
    static Integer[][] finDeJuego = {{1, 1, 2}, {2, 2, 1}, {2, 1, 2}};// 1 representa al primer jugador, 2 al segundo, 0 que esta vacio 

    public static void main(String[] args) {
        nodoInicial = new Node(inicioDeJuego);
        arbolGeneral = new Tree(nodoInicial);
        generarHijos(nodoInicial);
        System.out.println("fin");
        System.exit(0);
    }

    private static void generarHijos(Node nodo) {
        Integer contPrimerJugador = 0;
        Integer contSegundoJugador = 0;
        Integer contEspaciosVacios = 0;
        for (Integer[] informacion : nodo.getInformacion()) {
            for (Integer informacion1 : informacion) {
                if (null != informacion1) {
                    switch (informacion1) {
                        case 0:
                            contEspaciosVacios++;
                            break;
                        case 1:
                            contPrimerJugador++;
                            break;
                        case 2:
                            contSegundoJugador++;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if(!comprobarEstadoFinal(nodo)) {
            if (contPrimerJugador < contSegundoJugador) {
                generarPosiblesHijos(nodo, 1);
                System.out.println("Hijos:" + nodo.getNodosHijos().size());
            } else {
                generarPosiblesHijos(nodo, 2);
            }
            for (Node nodosHijo : nodo.getNodosHijos()) {
                generarHijos(nodosHijo);
            }
        }
    }

    private static void generarPosiblesHijos(Node nodo, Integer jugador) {
        for (int i = 0; i < nodo.getInformacion().length; i++) {
            for (int j = 0; j < nodo.getInformacion()[i].length; j++) {
                if (nodo.getInformacion()[i][j] == 0) {
                    Node nodoHijo = new Node();
                    Integer[][] infoNodoHijo = copiarNodo(nodo.getInformacion());
                    infoNodoHijo[i][j] = jugador;
                    nodoHijo.setInformacion(infoNodoHijo);
                    nodo.aniadirHijo(nodoHijo);
                }
            }
        }

    }

    private static Integer[][] copiarNodo(Integer[][] nodoCopiar) {
        Integer[][] copiado;
        copiado = new Integer[][]{{nodoCopiar[0][0], nodoCopiar[0][1], nodoCopiar[0][2]}, {nodoCopiar[1][0], nodoCopiar[1][1], nodoCopiar[1][2]}, {nodoCopiar[2][0], nodoCopiar[2][1], nodoCopiar[2][2]}};
        return copiado;
    }

    private static boolean comprobarEstadoFinal(Node node) {
        Integer contadorCoincidencias = 0;
        for (int i = 0; i < node.getInformacion().length; i++) {
            for (int j = 0; j < node.getInformacion()[i].length; j++) {
                if (Objects.equals(node.getInformacion()[i][j], finDeJuego[i][j])) {
                    contadorCoincidencias++;
                }
            }
        }
        return contadorCoincidencias == 9;
    }

    private static void imprimirNodo(Node nodo) {
        for (Integer[] informacion : nodo.getInformacion()) {
            for (Integer informacion1 : informacion) {
                System.out.print(" " + informacion1);
            }
            System.out.println("\n");
        }
    }

}
