public class ArrayRotacaoEsquerda {
    
    int[] elementos;
    int rotacaoEsquerda;

    public ArrayRotacaoEsquerda(int[] elementos, int rotacaoEsquerda) {
        this.elementos = elementos;
        this.rotacaoEsquerda = rotacaoEsquerda;

    for (int i = 0; i< rotacaoEsquerda; i++){ 
            for(int j = 0; j < elementos.length; j++){ 
                while((j - 1) != 0){ 
                    elementos[j] = elementos[j-1];
                    j--;
                    elementos[(elementos.length - 1)] = elementos[0];
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int[] elementos = new int[5];
        int rotacaoEsquerda = 2;
        elementos[0] = 5;
        elementos[1] = 10;
        elementos[2] = 15;
        elementos[3] = 20;
        elementos[4] = 25;
        
        ArrayRotacaoEsquerda arrayRotacao = new ArrayRotacaoEsquerda(elementos, rotacaoEsquerda);
        for (int elemento : arrayRotacao.elementos) {
            System.out.print(elemento + " ");
        }
    }
}

