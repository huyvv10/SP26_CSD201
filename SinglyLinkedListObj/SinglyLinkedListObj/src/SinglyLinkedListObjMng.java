
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
        
    }
    
    //Count the number of cars in the list
    public int countCars(){
        return 0;
    }
    
    //Count number of cars by their color
    public int countCarsByColor(int xColor){
        return 0;
    }
    
    //Search cars by their name
    public void searchCarsByName(String xName){
        
    }
    
    //Update car info by its ID
    public void editCarById(String xId){
        
    }
    
    //Remove car by its Id
    public void removeCarById(String xId){
    
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
    }
}
