
public class SinglyLinkedListObjMng {

    Node head, tail;

    public SinglyLinkedListObjMng() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //If color = 4 or Car name begin with 'X' the do nothing
    //othewise insert new car at the beginning.
    public void addFirst(Car x) {
        Node newNode = new Node(x);
        if (x.getColor()==4 || x.getName().startsWith("X")) return;
        if (isEmpty()){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.info.toString());
            cur=cur.next;
        }
    }
}
