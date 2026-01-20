
public class Main {

    public static void main(String[] args) {
        SinglyLinkedListObjMng myList = new SinglyLinkedListObjMng();
        myList.addFirst(new Car("V09", "Vinfast VF9", 5, 55000.5));
        myList.addFirst(new Car("M01", "Mazdar CX8", 2, 65000.5));
        myList.addFirst(new Car("X01", "Xpander", 7, 45000));
        myList.addFirst(new Car("V07", "Vinfast VF7", 2, 35000.8));
        myList.addFirst(new Car("V09", "Vinfast VF3", 4, 21000.2));
        myList.display();
    }
}
