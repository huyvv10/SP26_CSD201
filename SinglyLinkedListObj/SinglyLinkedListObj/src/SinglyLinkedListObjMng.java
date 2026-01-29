
import java.util.Scanner;


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
    //If name is containing "fan" then do nothing,
    //add to last of the list otherwise, ignore case sensitivity
    public void addLast(Car x){
        Node newNode = new Node(x);
        if (x.getName().toLowerCase().contains("fan")) return;
        if (isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    //Count the number of cars in the list
    public int countCars(){
        int count=0;
        Node cur = head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    
    //Count number of cars by their color
    public int countCarsByColor(int xColor){
        int count=0;
        Node cur = head;
        while (cur!=null){
            if (cur.info.getColor()==xColor) {
                count++;
            }
            cur=cur.next;
        }
        return count;
    }
    
    //Search cars by their name
    public void searchCarsByName(String xName){
        boolean flag=false;
        Node cur = head;
        while (cur!=null){
            if (cur.info.getName().toLowerCase()
                    .contains(xName.toLowerCase())){
                flag=true;
                System.out.println(cur.info.toString());
            }
            cur=cur.next;
        }
        if (!flag) {
            System.out.println("Find not fount any cars.");
        }
    }
    
    //Update car info by its ID
    public void editCarById(String xId){
        Scanner sn = new Scanner(System.in);
        boolean found = false;
        Node cur = head;
        while (cur!=null){
            if (cur.info.getId().equals(xId)){
                System.out.print("Input new name: ");
                cur.info.setName(sn.nextLine());
                System.out.print("Input new color: ");
                cur.info.setColor(sn.nextInt());
                System.out.print("Input new price: ");
                cur.info.setPrice(sn.nextDouble());
                found=true;
                break;
            }
            cur=cur.next;
        }
        if (!found) {
            System.out.println("Find not fount any cars.");
        }        
    }

    //Remove the first element of the list
    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    //Remove the last element of the list
    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node cur = head;
        while (cur.next != tail) {
            cur = cur.next;
        }
        tail = cur;
        cur.next = null;
    }

    //Remove the element at position pos
    public void removeAtPos(int pos) {
        int size = countCars();
        if (pos < 0 || pos >= size) {
            return;
        }
        if (pos == 0) {
            removeFirst();
            return;
        }
        if (pos == size - 1) {
            removeLast();
            return;
        }
        Node cur = head;
        int i = 0;
        while (i + 1 != pos) {
            cur = cur.next;
            i++;
        }
        cur.next = cur.next.next;
    }
    
    //Remove car by its Id
    public void removeCarById(String xId){
        int i=0, pos=-1;
        Node cur = head;
        while (cur!=null){
            if (cur.info.getId().equals(xId)){
                pos=i; break;
            }
            i++; 
            cur=cur.next;
        }
        if (pos!=-1)
            removeAtPos(pos);
        else
            System.out.println("Find not found the cars with id as "+xId);
    }
    
    //Search cars with their price in range [firstPrice, secondPrice]
    public void searchCarsWithPriceInRange(double firstPrice, double secondPrice){
        
    }
    
    //Calculate the total price of all cars
    public double totalPrice(){
        
        return 0;
    }
    
    //Calculate the total price of all cars with color as xColor
    public double totalPriceByColor(int xColor){
        
        return 0;
    }    
    
    //Sort the car list by price in descending order
    public void sortCarsByPriceDesc(){
        
    }
    
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.info.toString());
            cur=cur.next;
        }
        System.out.println("");
    }
}
