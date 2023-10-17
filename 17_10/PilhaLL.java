public class PilhaLL {
    private No topo;
    public PilhaLL(){
        topo=null;
    }
    public void empilhar(int e){
        No novo = new No(e);
        novo.prox=topo;
        topo = novo;
    }
    public boolean vazia(){
        return topo == null;
    }
    public int desempilhar() throws Exception{
        if (vazia())
            throws new Exception("EROO! Pilha Vazia!");
        else{
            int r = topo.dado;
            topo = topo.prox;
            return r;
        }

    }
    public String toString(){
        String r ="";
        No aux=topo;
        while (aux != null){
            r = r + "\t" + aux.dado;
            aux = aux.prox;
        }
        return r;
    }
}
