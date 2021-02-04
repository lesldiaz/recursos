/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.edu.tresenraya;

/**
 *
 * @author jparedes
 */
public class Tree {

    private Node root;
    private Node nodoEncontrado;
    private Node nodoEncontradoMenorCosto;
    public int costoMayor = 99999;

    public Tree() {
    }

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getNodoEncontrado() {
        return nodoEncontrado;
    }

    public void setNodoEncontrado(Node nodoEncontrado) {
        this.nodoEncontrado = nodoEncontrado;
    }

    public Node buscar(Node nodoBuscado, Node node) {
        for (Node nodoHijo : node.getNodosHijos()) {
            if (nodoHijo.getInformacion().equals(nodoBuscado.getInformacion())) {
                setNodoEncontrado(nodoHijo);
            } else {
                buscar(nodoBuscado, nodoHijo);
            }
        }
        return getNodoEncontrado();
    }

    public Node getNodoEncontradoMenorCosto() {
        return nodoEncontradoMenorCosto;
    }

    public void setNodoEncontradoMenorCosto(Node nodoEncontradoMenorCosto) {
        this.nodoEncontradoMenorCosto = nodoEncontradoMenorCosto;
    }

    public void imprimirArbol(Node nodo) {
        if (nodo.getNodosHijos().size() > 0) {
            System.out.print(arrayToString(nodo.getInformacion()) + ":{");
        } else {
            System.out.print(arrayToString(nodo.getInformacion()));
        }
        for (Node nodoHijo : nodo.getNodosHijos()) {
            System.out.print("[");
            imprimirArbol(nodoHijo);
            System.out.print("],");
        }
        if (nodo.getNodosHijos().size() > 0) {
            System.out.print("}");
        }
    }

    private String arrayToString(Integer[][] array) {
        String arr = "";
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                arr += String.valueOf(array[j][k]);
            }
            if (j != array.length - 1) {
                arr += "\n";
            }
        }
        return arr;
    }

    int i = -1;

    public String sacarEspacios(int numeroEspacios) {
        String espacios = "";
        for (int j = 0; j < numeroEspacios; j++) {
            espacios += " ";
        }
        return espacios;
    }

    public void quitarNodo(Node nodoEliminar, Node node) {
        for (Node nodoHijo : node.getNodosHijos()) {
            if (nodoHijo.getInformacion().equals(nodoEliminar.getInformacion())) {
                node.getNodosHijos().remove(nodoHijo);
                break;
            } else {
                quitarNodo(nodoEliminar, nodoHijo);
            }
        }
    }

    public void obtenerNodoMenorCoste(Node node) {
//        for (Node nodoHijo : node.getNodosHijos()) {
//            System.out.println("heuristica: " + nodoHijo.getCosto() + " nono" + nodoHijo.getHeuristica());
////            System.out.println("costo: "+ (nodoHijo.getCosto() + nodoHijo.getHeuristica()) +" mayor: "+costoMayor);
//            if ((nodoHijo.getCosto() + nodoHijo.getHeuristica()) < costoMayor) {
//                costoMayor = nodoHijo.getCosto() + nodoHijo.getHeuristica();
//                setNodoEncontradoMenorCosto(nodoHijo);
//            }
//            obtenerNodoMenorCoste(nodoHijo);
//        }
////        return getNodoEncontradoMenorCosto();
    }

}
