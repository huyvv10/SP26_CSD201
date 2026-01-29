
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        SinglyLinkedListObjMng myList = new SinglyLinkedListObjMng();
        myList.addFirst(new Car("V09", "Vinfast VF9", 5, 55000.5));
        myList.addFirst(new Car("M01", "Mazdar CX8", 2, 65000.5));
        myList.addFirst(new Car("X01", "Xpander", 7, 45000));
        myList.addFirst(new Car("V07", "Vinfast VF7", 2, 35000.8));
        myList.addFirst(new Car("V09", "Vinfast VF3", 4, 21000.2));
        myList.display();
        myList.addLast(new Car("F01", "Maybach", 3, 150000));
        myList.addLast(new Car("F02", "Fantom ghost", 6, 2000000));
        myList.display();
        System.out.println("Number of cars: "+ myList
        .countCars());
        System.out.print("Input color to count: ");
        Scanner sn = new Scanner(System.in);
        int xColor = sn.nextInt();
        System.out.println("Number of cars with color as "+ 
                xColor+ " is: " +myList.countCarsByColor(xColor));
        sn.nextLine();  //Clear buffer
        System.out.print("Input car name to search: ");
        String xName = sn.nextLine();
        myList.searchCarsByName(xName);
        System.out.print("Input car Id to modify its info: ");
        String xId;
        xId = sn.nextLine();
        myList.editCarById(xId);
        myList.display();
        System.out.print("Input car Id to remove: ");
        xId = sn.nextLine();  
        myList.removeCarById(xId);
        myList.display();
        
    }
}
