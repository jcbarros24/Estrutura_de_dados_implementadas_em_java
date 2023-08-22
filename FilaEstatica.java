public class FilaEstatica {
    public Integer[] elementos;
    private Integer primeiro;
    private Integer ultimo;

    public FilaEstatica(int tamanho) {
        this.elementos = new Integer[tamanho];
        this.primeiro = null;
        this.ultimo = null;
    }

    public void enqueue(Integer valor) {
        if (isEmpty() == true) {
            primeiro = 0;
            ultimo = 0;
        } 
        if (isFull() == true) {
            System.out.println("Fila cheia!");
        } 
        ultimo = ultimo % elementos.length;
        elementos[ultimo] = valor;
        ultimo++;
    }

    public boolean isFull() {
        if(ultimo % elementos.length == primeiro) { 
            return true;
        }
        else{ 
            return false;
        }
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }
        Integer valor = elementos[primeiro];
        elementos[primeiro] = null; 
        primeiro = (primeiro + 1) % elementos.length;
        if (isEmpty()) { 
            primeiro = null;
            ultimo = null;
        }
        return valor;
    }

    public boolean isEmpty() {
       if (primeiro == ultimo && primeiro == null){ 
        return true;
       }
        return false;
    }
    public Integer getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Integer primeiro) {
        this.primeiro = primeiro;
    }
    public Integer getUltimo() {
        return ultimo;
    }
    public void setUltimo(Integer ultimo) {
        this.ultimo = ultimo;
    }
}
