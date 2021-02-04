public class Tree {
    public Nodo raiz;

    public Tree() {
        raiz = new Nodo(new puzzle());
    }

    public void generarTree(){
        insertar(raiz);
    }

    public void insertar(Nodo nodo){
        raiz.insert(nodo.p);
    }
}
