public class ListaEncadeada {
    public No head;

    public void addFirst(Integer value) {
        No novoNo = new No(value);
        novoNo.next = head;
        head = novoNo;
    }

    public void addLast(Integer value) {
        No novoNo = new No(value);

        if (head == null) {
            head = novoNo;
        } else {
            No atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoNo;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void delete(Integer value) {
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }
        
        No anterior = head;
        No atual = head.next;

        while (atual != null && atual.value != value) {
            anterior = atual;
            atual = atual.next;
        }
        if (atual != null) {
            anterior.next = atual.next;
        }
    }
}