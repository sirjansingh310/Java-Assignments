package incremental.assignment6;

public class Node<T> {
    public T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    }
    @Override
    public String toString(){
        return data.toString();
    }

}
