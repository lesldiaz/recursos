import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    private static ArrayList<Nodo> listaNodos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("8 puzzle\nMENU\n1. User\n2. Algoritmo primero en anchura no informado\n0. Salir");
            switch (in.nextInt()){
                case 1:
                    user();
                    break;
                case 2:
                    Nodo respuesta = BNI();
                    respuesta.p.validar(12);
                    if(respuesta.p.validar()){
                        System.out.println("No se pudo resolver");
                    }else{
                        System.out.println("La respuesta es:\n" + respuesta.p.toString());
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void user() {
        puzzle p = new puzzle();
        System.out.println(p.toString());
        System.out.println();
        boolean r=true;
        int op;
        while(p.validar() && r){
            System.out.println("Movimiento: 1(arriba), 2 (abajo), 3 (izquierda), 4 (derecha), 0 (rendirse)");
            op=in.nextInt();
            if(op!=0)
                p.mover(op);
            else if(op==0)
                r=false;
            System.out.println(p.toString());
        }
        System.out.println("Fin");
    }

    private static Nodo BNI(){
        Tree arbol = new Tree();
        arbol.generarTree();
        Nodo nodoActual = null;
        boolean acabar = false;
        System.out.println(arbol.raiz.p.toString());
        pushLN(arbol.raiz);

        while (!listaNodos.isEmpty() && !acabar){
            nodoActual = popLN();
            pushLN(nodoActual);
            if(nodoActual.p.validar())
                acabar = true;
            else
                expandir(nodoActual);
        }

        return nodoActual;
    }

    private static void pushLN(Nodo p) {
        listaNodos.add(p);
    }

    private static void expandir(Nodo p) {
        for(int i=0; i<4; i++)
            if(p.nodos[i]!=null)
                listaNodos.add(p.nodos[i]);
    }

    private static Nodo popLN() {
        Nodo p = listaNodos.get(0);
        for (int i = 1; i<listaNodos.size(); i++)
            listaNodos.set(i-1, listaNodos.get(i));
        listaNodos.set(listaNodos.size()-1, null);
        return p;
    }
}
