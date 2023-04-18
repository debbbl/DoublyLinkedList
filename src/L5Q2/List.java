package L5Q2;

import SList.SNode;

public class List <E>{
    private Node<E> head, tail;
    private int size;

    public List(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void add(E e){
        System.out.printf("Adding %s to the list\n",e);
        if(head==null)
            tail=head=new Node<>(e);
        else{
            tail.next=new Node<>(e);
            tail=tail.next;
        }
        size++;
    }

    public void removeElement(E e){
        System.out.printf("Removing %s from the list\n",e);
        if(head!=null && head.element.equals(e)) {
            head = head.next;
            size--;
        }else{
            Node<E> prev=head;
            Node<E> current=head.next;
            while(current!=null && !current.element.equals(e)){
                prev=current;
                current=current.next;
            }
            if(current!=null){
                prev.next=current.next;
                size--;
            }
        }
    }

    public void printList(){
        Node<E> current=head;
        for(int i=0;i<size;i++){
            System.out.print(current.element+" ");
            current=current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e){
        Node<E> current=head;
        for(int i=0;i<size;i++){
            if(current.element.equals(e))
                return true;
            current=current.next;
        }
        return false;
    }

    public void replace(E e, E newE){
        Node<E> current=head;
        while(true){
            if(current.element.equals(e)) {
                current.element = newE;
                break;
            }
            current=current.next;
        }
    }
}
