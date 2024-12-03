public class Node <T>{
    T data;
    Node <T> next = null;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return
                "data=" + data
                ;
    }
}
