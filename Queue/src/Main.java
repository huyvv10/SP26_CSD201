
public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        myQ.enqueue(9);
        myQ.enqueue(2);
        myQ.enqueue(7);
        myQ.enqueue(5);
        System.out.println("The first element: "+ 
                myQ.front());
        
        while (!myQ.isEmpty()){
            System.out.print(myQ.front()+" ");
            myQ.dequeue();
        }
        System.out.println("");
    }
}
