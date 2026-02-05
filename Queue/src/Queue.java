public class Queue {
    private Node head, tail;

    public Queue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(Object x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }    
    
    public void dequeue(){
        if (isEmpty()) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;        
    }
    
    Object front(){
        return isEmpty() ? null : head.info;
    }
    
}
