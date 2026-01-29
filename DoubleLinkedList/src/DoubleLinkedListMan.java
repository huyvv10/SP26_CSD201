public class DoubleLinkedListMan {
    private Node head, tail;
    
    public DoubleLinkedListMan(){
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addFirst(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    
    public void addLast(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {     
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }   
    }
    //Count number of nodes are existing in the list
    int countNodes(){
        int count=0;
        Node cur=head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //Insert x into the position pos
    public void addAtPos(int x, int pos){
        int size = countNodes();
        if (pos<0 || pos>size) return;
        if (pos==0){
            addFirst(x); return;
        }
        if (pos==size){
            addLast(x); return;
        }
        int i=0;
        Node cur=head;
        while (i!=pos){
            cur=cur.next;
            i++;
        }
        Node newNode = new Node(x);
        cur.prev.next=newNode;
        newNode.prev=cur.prev;
        newNode.next=cur;
        cur.prev=newNode;
    }
    
    public void removeFirst(){
        if (isEmpty()) return;
        if (head.next==null){
            head=tail=null; 
        } else {
            head=head.next;
        }
    }
    
    public void removeLast(){
        if (isEmpty()) return;
        if (head.next==null){
            head=tail=null; 
        } else {
            tail=tail.prev;
            tail.next=null;
        }        
    }
    
    public void removeAtPos(int pos){
        int size=countNodes();
        if (pos<0 || pos>=size) return;
        if (pos==0){
            removeFirst(); return;
        }
        if (pos==size-1) {
            removeLast(); return;
        }
        int i=0;
        Node cur=head;
        while (i!=pos){
            cur=cur.next;
            i++;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;
    }
    
    //Remove x first found from the left
    public void remove(int x){
        
    }
    
    //Remove all value equal to x
    public void removeAll(int x){
        
    }
    //Traversal
    public void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.info+" ");
            cur=cur.next;
        }
        System.out.println("");
    }
    
}
