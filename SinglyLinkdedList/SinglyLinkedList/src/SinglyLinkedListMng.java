public class SinglyLinkedListMng {
    private Node head, tail;

    public SinglyLinkedListMng() {
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    //Add an element into the list at the beginning
    public void addFirst(int x){
        Node newNode = new Node(x);
        if (isEmpty()) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add an element into the list at the last
    public void addLast(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
        
    //Insert x into the position pos
    public void addAtPos(int x, int pos){
        int size=countNodes();
        if (pos<0 || pos > size) return;
        if (pos==0) {addFirst(x); return;}
        if (pos==size) {addLast(x); return;}
        int i=0;
        Node cur=head;
        Node newNode = new Node(x);
        while (cur!=null){
            if (i+1==pos) {
                newNode.next=cur.next;
                cur.next=newNode;
                break;
            }
            i++;
            cur=cur.next;
        }
    }
    //Count number of nodes existing in the list
    public int countNodes(){
        int count=0;
        Node cur=head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //Count number of nodes existing in the list using for loop    
    public int size(){
        int count=0;
        for (Node cur = head; cur!=null; cur=cur.next) {
            count++;
        }
        return count;
    }
    
    //Return the maximum value in the list
    public int getMax(){
        int max=head.info;
        Node cur=head.next;
        while (cur!=null){
            if(cur.info>max) max = cur.info;
            cur=cur.next;
        }
        return max;
    }
    
    //Return the minimum value in the list
    public int getMin(){
        int min=head.info;
        Node cur=head.next;
        while (cur!=null){
            if(cur.info<min) min = cur.info;
            cur=cur.next;
        }
        return min;        
    }
    
    //Return the position first found x.
    //Return -1 if find not found.
    public int getFirstPosOfNode(int x){
        int pos=-1, i=0;
        Node cur=head;
        while(cur!=null){
            if (cur.info==x) {
                pos=i;
                break;
            }
            i++;
            cur=cur.next;
        }
        return pos;
    }
    
    //Return the value of an element before x.
    //Return -999 in case find not found
    public int getValuePre(int x){
        int rs=-999;
        Node cur=head;
        if(isEmpty()) return rs;
        while (cur.next!=null){
            if(cur.next.info==x){
                rs=cur.info; break;
            }   
            cur=cur.next;
        }
        return rs;
    }
    //Return the value of an element after x.
    //Return -999 in case find not found
    public int getValuePost(int x){
        int rs=-999;
        Node cur = head;
        if (isEmpty()) return rs;
        while (cur.next!=null){
            if (cur.info==x) {
                rs=cur.next.info; break;
            }
            cur=cur.next;
        }
        return rs;
    }
    
    public int getFirst(){
        if (isEmpty()) return -999;
        return head.info;
    }
    
    public int getLast(){
        if (isEmpty()) return -999;
        return tail.info;
    }
    
    //Return the value at position pos
    //Return -999 if pos is out of range.
    public int getValueAtPos(int pos){
        int i=0, rs=-999;
        int size=countNodes();
        if (pos<0 || pos>=size) return rs;
        Node cur=head;
        while (cur!=null){
            if (i==pos) {
                rs=cur.info; break;
            }
            i++;
            cur=cur.next;
        }
        return rs;
    }
    //Display the info of the list
    public void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.info +" ");
            cur=cur.next;
        }
        System.out.println("");
    }
        
}
