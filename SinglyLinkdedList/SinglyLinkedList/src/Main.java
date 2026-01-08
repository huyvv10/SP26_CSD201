
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        SinglyLinkedListMng myList = new SinglyLinkedListMng();
        myList.addFirst(8);
        myList.addFirst(5);
        myList.addFirst(2);
        myList.addFirst(9);
        myList.addFirst(6);
        myList.addFirst(4);
        myList.display();
        myList.addLast(3);
        myList.addLast(5);
        myList.addLast(1);
        myList.display();
        System.out.println("Number of nodes: "
                + myList.countNodes());
        System.out.println("Number of nodes size: "
                + myList.size());
        System.out.println("Max value: "+myList.getMax());
        System.out.println("Min value: "+myList.getMin());
        int x, pos;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input searching number: ");
        x = sn.nextInt();
        pos = myList.getFirstPosOfNode(x);
        if (pos!=-1)
            System.out.println("The postion first found "+x+" is: "+pos);
        else
            System.out.println("Find not found "+x+" in the list.");    
    }
}
