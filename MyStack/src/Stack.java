
public class Stack {

    private Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Object x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    Object top() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return null;
        }
        return head.info;
    }
}
