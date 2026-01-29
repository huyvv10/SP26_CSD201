
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        DoubleLinkedListMan myList = new DoubleLinkedListMan();
        myList.addFirst(5);
        myList.addFirst(9);
        myList.addFirst(2);
        myList.addFirst(6);
        myList.addFirst(7);
        myList.display();   
        myList.addLast(4);
        myList.addLast(3);
        myList.addLast(8);
        myList.display();
        System.out.println("Number of nodes: " + 
                myList.countNodes());
        int x, pos;
        Scanner sn = new Scanner(System.in);
//        System.out.print("Input x = ");
//        x = sn.nextInt();
//        System.out.print("Input position to add: ");
//        pos = sn.nextInt();
//        myList.addAtPos(x, pos);
//        myList.display();
        System.out.println("Remove first");
        myList.removeFirst();
        myList.display();
        myList.removeLast();
        System.out.println("Remove last");
        myList.display();
        System.out.print("Input position to remove: ");
        pos = sn.nextInt();    
        myList.removeAtPos(pos);
        myList.display();
                
    }
}
