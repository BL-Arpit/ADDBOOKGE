import java.util.Stack;

public class LinkedList <T> {
    //Node<T>[]  a1 = (Node<T>[]) new Object();
    Node<T> head =null;
    Node<T> current = null;

    Stack<Integer> l1 = new Stack<>();

    public void add(T a){
        Node<T> a1 = new Node<>(a);
        if (head == null){
            head = a1;

        }
        else{
            current = head;
            while (current.next != null) {
                current = current .next;
            }
            current.next = a1;

        }

    }
    public void display(){
        if(head == null)
        {
            System.out.println("Linked List is empty");
        }
        else{
            current = head;
            while (current !=null){
                System.out.println(current);
                current =current.next;
            }
        }
    }
}
//Today Assignment - Learn about double linked list - Circular linked list and Maps
