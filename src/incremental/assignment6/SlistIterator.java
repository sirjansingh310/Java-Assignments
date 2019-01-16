package incremental.assignment6;

public class SlistIterator<T> {
    private Node<T> current = null; // for inserting into the list
    private Node<T> head = null; // store first node
    private Node<T> temp = null; // for traversal

    public Node<T> next(){ // return temp node and increment temp to point to next node
        Node<T> returnNode = temp;
        temp = temp.next;
        return returnNode;
    }

    public boolean hasNext(){
        if(temp != null) {// check if more nodes are present or not
            return true;
        }
        temp = head; // reset temp for next traversal
        return false;
    }

    public void add(T data){ // add at the end
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            current = newNode;
            temp = head;
        }
        else {
            current.next = newNode;
            current = newNode;
        }
    }
    public void remove(T key){
        Node<T> traverse = head;
        Node<T> previous = null;
        if(traverse != null && traverse.data.equals(key)){ // using .equals as it is generic
            head = traverse.next;
            return;
        }
        while (!traverse.data.equals(key)) {
            previous = traverse;
            traverse = traverse.next;
        }
        if(traverse == null) // not found
            return;
        previous.next = traverse.next;
        return;

    }

}
