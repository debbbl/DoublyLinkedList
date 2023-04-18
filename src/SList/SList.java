package SList;

public class SList <E>{
     SNode<E> head, tail;
    int size=0;

    public void appendEnd(E e){
        System.out.printf("Appending %s to the end of list\n",e);
        SNode<E> newNode=new SNode<>(e);
        if(tail==null){
            head=tail=newNode;
        }else{
            SNode<E> temp=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    public E removeInitial(){
        if(head==null)
            return null;
        else {
            SNode<E> temp=head;
            head=head.next;
            size--;
            return temp.element;
        }
    }

    public boolean contains(E e){
        SNode<E> current=head;
        for(int i=0;i<size;i++){
            if(current.element.equals(e))
                return true;
            current=current.next;
        }
        return false;
    }

    public void clear(){
        head=tail=null;
        size=0;
    }

    public void display(){
        System.out.print("Displaying all the elements in the list: [");
        SNode<E> current=head;
        for(int i=0;i<size;i++){
            System.out.print(current.element+" ");
            current=current.next;
        }
        System.out.println("]\n");
    }
}
