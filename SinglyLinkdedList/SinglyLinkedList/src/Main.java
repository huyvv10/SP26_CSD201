
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListMng myList = new SinglyLinkedListMng();
        myList.addFirst(8);
        myList.addFirst(8);
        myList.addFirst(8);
        myList.addFirst(5);
//        myList.addFirst(2);
//        myList.addFirst(9);
//        myList.addFirst(6);
//        myList.addFirst(4);
//        myList.display();
//        myList.addLast(3);
        myList.addLast(8);
        myList.addLast(7);
//        myList.addLast(1);
        myList.display();
//        System.out.println("Number of nodes: "
//                + myList.countNodes());
//        System.out.println("Number of nodes size: "
//                + myList.size());
//        System.out.println("Max value: " + myList.getMax());
//        System.out.println("Min value: " + myList.getMin());
        int x, pos;
        Scanner sn = new Scanner(System.in);
//        System.out.print("Input searching number: ");
//        x = sn.nextInt();
//        pos = myList.getFirstPosOfNode(x);
//        if (pos != -1) {
//            System.out.println("The postion first found " + x + " is: " + pos);
//        } else {
//            System.out.println("Find not found " + x + " in the list.");
//        }
//        System.out.print("Input x to get value before: ");
//        x = sn.nextInt();
//        int rs = myList.getValuePre(x);
//        if (rs != -999) {
//            System.out.println("The value before " + x + " is: " + rs);
//        } else {
//            System.out.println("Find not found value befor " + x);
//        }
//        System.out.print("Input x to get value after it: ");
//        x = sn.nextInt();
//        rs = myList.getValuePost(x);
//        if (rs != -999) {
//            System.out.println("The value after " + x + " is: " + rs);
//        } else {
//            System.out.println("Find not found a value after" + x);
//        }   
//        System.out.println("The begining value: " + myList.getFirst());
//        System.out.println("The last value: "+ myList.getLast());
//        System.out.print("Input pos to get value: ");
//        pos = sn.nextInt();
//        rs = myList.getValueAtPos(pos);
//        if (rs!=-999){
//            System.out.println("The value at position "+pos+" is: "+rs);
//        } else {
//            System.out.println("The position "+pos+" is out of range.");
//        }   
//          System.out.print("Input adding value: ");
//          x = sn.nextInt();
//          System.out.print("Input position to add: ");
//          pos = sn.nextInt();
//          myList.addAtPos(x, pos);
//          myList.display();
//        System.out.println("13. Remove the first element");
//        myList.removeFirst();
//        myList.display();
//        System.out.println("14. Remove the last element");
//        myList.removeLast();
//        myList.display();
//        System.out.println("15. Remove at position pos");
//        System.out.print("Input the postion to remove: ");
//        pos = sn.nextInt();
//        myList.removeAtPos(pos);
//        myList.display();
//        System.out.println("16. Remove x");
//        System.out.print("Input a value to remove: ");
//        x = sn.nextInt();
//        myList.remove(x);
//        myList.display();
        System.out.println("17. Remove all elements with value as x");
        System.out.print("Input a value to remove all: ");
        x = sn.nextInt();
        myList.removeAll(x);
        myList.display();
        

    }
}
