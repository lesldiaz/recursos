public class Nodo {
    Nodo[] nodos = new Nodo[4];
    puzzle p;

    public Nodo(puzzle p){
        this.p = p;
        for(int i=0; i<4; i++)
            nodos[i]=null;
    }

    public void insert(puzzle p){
        if (!this.p.validar()) {
            for(int i=0; i<4; i++)
                if (this.p != p.move(i+1)) {
                    nodos[i] = new Nodo(p.move(i+1));
                    nodos[i].insert(nodos[i].p);
                    System.out.println(nodos[i].p.toString());
                }
        }
    }
}
