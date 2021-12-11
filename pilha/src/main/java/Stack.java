public class Stack {
    private Node top;
    private int size; // tamanho da pilha

    public void push(String element) { // adicione um elemento ao topo da pilha
        if (top == null) {
            top = new Node(element);
        }
        else {
            Node newNode = new Node(element);
            newNode.next = top;
            top = newNode;
        }
        size ++;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }
        Node p = top;
        top = top.next; // ponteiro superior move pra baixo
        p.next = null;
        size--;
        return p;
    }
    public int size() {
        return size;
    }
}
