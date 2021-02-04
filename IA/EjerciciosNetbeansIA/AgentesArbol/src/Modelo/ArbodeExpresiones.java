/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.*;

public class ArbodeExpresiones implements Serializable{

    Stack< Nodo> pOperandos = new Stack< Nodo>();
    Stack< String> pOperadores = new Stack< String>();

    final String blanco;           // Cadena de espacios en blanco
    final String operadores;       // Cadena con operadores para expresiones

    public ArbodeExpresiones() {
        blanco = " \t";
        operadores = ")+-*/%^(";  //acomodados por precedencia;
    }

    private Nodo raiz;

    public Nodo getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Nodo r) {
        this.raiz = r;
    }

    public boolean contruir(String con) {
        construirArbol(con);
        return true;
    }

    public Nodo construirArbol(String expresion) {
        StringTokenizer tokenizer;
        String token;

        tokenizer = new StringTokenizer(expresion, blanco + operadores, true);
        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            if (blanco.indexOf(token) >= 0) 
		; // Es un espacio en blanco, se ignora
            else if (operadores.indexOf(token) < 0) {
                // Es operando y lo guarda como nodo del arbol
                Nodo a;
                pOperandos.push(new Nodo(token));
            } else if (token.equals(")")) { // Saca elementos hasta encontrar (
                while (!pOperadores.empty() && !pOperadores.peek().equals("(")) {
                    guardarSubArbol();
                }
                pOperadores.pop();  // Saca el parentesis izquierdo
            } else {
                if (!token.equals("(") && !pOperadores.empty()) {
                    //operador diferente de cualquier parentesis
                    String op = (String) pOperadores.peek();
                    while (!op.equals("(") && !pOperadores.empty()
                            && operadores.indexOf(op) >= operadores.indexOf(token)) {
                        guardarSubArbol();
                        if (!pOperadores.empty()) {
                            op = (String) pOperadores.peek();
                        }
                    }
                }
                pOperadores.push(token);  //Guarda el operador
            }
        }
        //Sacar todo lo que queda
        raiz = (Nodo) pOperandos.peek();
        while (!pOperadores.empty()) {
            if (pOperadores.peek().equals("(")) {
                pOperadores.pop();
            } else {
                guardarSubArbol();
                raiz = (Nodo) pOperandos.peek();
            }
        }
        return raiz;
    }

    private void guardarSubArbol() {
        Nodo op2 = (Nodo) pOperandos.pop();
        Nodo op1 = (Nodo) pOperandos.pop();
        pOperandos.push(new Nodo(op2, pOperadores.pop(), op1));

    }

    public void imprime(Nodo n) {
        if (n != null) {
            
            imprime(n.getNodoDerecho());
            System.out.print(n.getInformacion() + " ");
            imprime(n.getNodoIzquierdo());
        }
    }

    public void imprimePos(Nodo n) {
        if (n != null) {
            imprimePos(n.getNodoIzquierdo());
            imprimePos(n.getNodoDerecho());
            System.out.print(n.getInformacion() + " ");
        }
    }

    public void imprimePre(Nodo n) {
        if (n != null) {
            System.out.print(n.getInformacion() + " ");

            imprimePre(n.getNodoDerecho());
            imprimePre(n.getNodoIzquierdo());
        }
    }
/*
     public void imprime(Nodo n) {
        if (n != null) {

            imprime(n.getNodoDerecho());
            System.out.print(n.getInformacion() + " ");
            imprime(n.getNodoIzquierdo());
        }
    }

    public void imprimePos(Nodo n) {
        if (n != null) {
            imprimePos(n.getNodoIzquierdo());
            imprimePos(n.getNodoDerecho());
            System.out.print(n.getInformacion() + " ");
        }
    }

    public void imprimePre(Nodo n) {
        if (n != null) {
            System.out.print(n.getInformacion() + " ");

            imprimePre(n.getNodoDerecho());
            imprimePre(n.getNodoIzquierdo());
        }
    }
*/
    public static boolean verfParentesis(String cadena) {
        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i < cadena.length()) {  // Recorremos la expresión carácter a carácter
            if (cadena.charAt(i) == '(') {
                pila.push("(");
            } // Si el paréntesis es de apertura apilamos siempre                               
            else if (cadena.charAt(i) == ')') {  // Si el paréntesis es de cierre actuamos según el caso
                if (!pila.empty()) {
                    pila.pop();
                } // Si la pila no está vacía desapilamos
                else {
                    pila.push(")");
                    break;
                } // La pila no puede empezar con un cierre, apilamos y salimos
            }
            i++;
        }
        if (pila.empty()) {
            return true;
        } else {
            return false;
        }

    }
/*
    public static void main(String[] pps) {
        ArbodeExpresiones expr = new ArbodeExpresiones();

        Scanner leer = new Scanner(System.in);
        System.out.print("Digite la expresion aritmetica: ");
        String expresion = leer.nextLine();
        char[] arrayChar = expresion.toCharArray();
        if (arrayChar[0] == ')' || arrayChar[0] == '%' || arrayChar[0] == '^'
                || arrayChar[0] == '*' || arrayChar[0] == '/' || 
                arrayChar[0] == '+'|| arrayChar[0] == '-') {
            System.err.println("Operacion no debe iniciar con un "
                    + arrayChar[0]);
            System.exit(0);
        }
        if (verfParentesis(String.copyValueOf(arrayChar))) {
            Nodo raiz = expr.construirArbol(expresion);
            System.out.println("Recorrido Posorden");
            expr.imprimePos(raiz);
            System.out.println("\n Recorrido Preorden");
            expr.imprimePre(raiz);
            System.out.println("\n Recorrido Inorden");
            expr.imprime(raiz);
            System.out.println("\n");
        } else {
            System.err.println("El numero de ( no coincide con los )");
        }

    }
*/
}
