public class Solucao {

    PilhaEstatica p;

    public Solucao(){ 

    }
    
    public String removerDuplicatas(){ 
       
            StringBuilder sb = new StringBuilder(); //Ele recebe um 's' como parametro 
            int i = 0;
            while (i < sb.length() - 1) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    i = Math.max(0, i - 1);
                } else {
                    i++;
                }
            }
            return sb.toString();
        }

    }





    

