package L5Q2;

public class Node <E>{
    E element;
    Node<E> next;
    public Node(){
        this(null,null);
    }
    public Node(E element){
        this(element,null);
    }
    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }
}
