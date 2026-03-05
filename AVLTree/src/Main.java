
public class Main {

    public static void main(String[] args) {
        AVLTree myAVL = new AVLTree();
        myAVL.root = myAVL.addAVLNode(myAVL.root, 15);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 8);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 22);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 13);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 10);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 12);
        myAVL.root = myAVL.addAVLNode(myAVL.root, 11);
        System.out.println("Breadth first traversal");
        myAVL.breadthFirstTraversal(myAVL.root);
        System.out.println("\nDelete by copy");
        myAVL.root = myAVL.deleteByCopyingLeft(myAVL.root, 8);
        myAVL.breadthFirstTraversal(myAVL.root);

        System.out.println("");
    }

}
