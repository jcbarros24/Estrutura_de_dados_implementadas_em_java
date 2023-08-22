public class PilhaEstatica {
    public int[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){
        this.tamanho = tamanho;
        this.elementos = new int [tamanho];
        topo = -1;
    }

    public void push(int valor){
        if(topo == (tamanho - 1)){ 
            System.out.println("Pilha cheia!");
        } 
        topo++;
        elementos[topo] = valor;
    }  
 
    public int pop(){
        if (isEmpty() == true){ 
            System.out.println("Pilha vazia!");
        }
        int valor = elementos[topo];
        topo--;
        return valor;
    }

    public boolean isEmpty(){
        if (topo == -1){ 
            return true;
        }
        else{
             return false;
        }
    }

    public int peek(){
        if(isEmpty() == true){
            System.out.println("Pilha vazia!");
        }
        return elementos[topo];
    }
    
}
