
public class Main {

    public static void main(String[] args) {
        BSTree myTree = new BSTree();
        myTree.addNode(15);
        myTree.addNode(10);
        myTree.addNode(20);
        myTree.addNode(6);
        myTree.addNode(14);
        myTree.addNode(17);
        myTree.addNode(25);
        myTree.addNode(3);
        myTree.addNode(7);
        myTree.addNode(11);
        myTree.addNode(8);
        myTree.addNode(28);
        myTree.addNode(12);
        myTree.addNode(21);
        myTree.addNode(13);
        myTree.preOrder(myTree.root);
        System.out.println("");   
        myTree.inOrder(myTree.root);
        System.out.println("");   
        myTree.postOrder(myTree.root);  
        System.out.println("");   
        System.out.println("Number of nodes: "
                +myTree.countNode(myTree.root));
    }
}
