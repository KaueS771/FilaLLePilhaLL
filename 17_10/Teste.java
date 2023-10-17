public class Teste{
    public static void main( String []args){
        FilaLL f1 = new FilaLL();
        PilhaLL p1 = new PilhaLL();
        int i = 1;
        while(i <=5){
            f1.adiciona(i * 5);
            i = i + 1;
        }
        if(!f1.vazia())
            System.out.println("Elementos da Fila : " + f1.toString());
        else
           System.out.println("Fila Vazia");
        if(p1.vazia())
          System.out.println("Elementos da Pilha" + p1.toString());
        else 
          System.out.println("Pilha Vazia");

        while(!f1.vazia()){
            p1.empilhar(f1.remove());
        }
        if(!f1.vazia())
            System.out.println("Elementos da Fila : " + f1.toString());
        else
           System.out.println("Fila Vazia");
        if(p1.vazia())
          System.out.println("Elementos da Pilha" + p1.toString());
        else 
          System.out.println("Pilha Vazia");
    }
}