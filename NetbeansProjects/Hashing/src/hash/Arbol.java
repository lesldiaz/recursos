/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author PAVILLION
 */
public class Arbol {
    private Nodo raiz;
    
    public Arbol (int val){
        this.raiz = new Nodo(val);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Arbol() {
       
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    private void addNodo(Nodo nodo,Nodo raiz){
        if (raiz == null){
            this.setRaiz(nodo);
        }else {
            if(nodo.getElemento()<=raiz.getElemento()){
                if (raiz.getIzquierdo()== null) {
                    raiz.setIzquierdo(nodo);
                }
                else {
                    addNodo( nodo , raiz.getIzquierdo());
                }
            }else {
                if (raiz.getDerecho()== null) {
                    raiz.setDerecho(nodo);
                }
                else {
                    addNodo( nodo, raiz.getDerecho());
                }
            }
        }
    }
    
    public void addNodo(Nodo nodo){
        this.addNodo(nodo, this.raiz);
    }
}
