
import java.util.Scanner;


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
        System.out.println("Number of nodes BFS: "
                +myTree.countNodeBFS(myTree.root));
        System.out.println("---BFS----");
        myTree.breadthFirstTraversal(myTree.root);
        System.out.println("");
        System.out.println("Number of leaf nodes: "+
                myTree.countExternalNodes(myTree.root));
        System.out.println("Number of internal nodes: "+
                myTree.countInternalNodes(myTree.root));
        System.out.println("Number of nodes have 2 children: "+
                myTree.countNumberOfNodesHaveTwoChildren(myTree.root));        
        System.out.println("Number of nodes only have a left child: "+
                myTree.countNumberOfNodesOnlyHaveLeftChild(myTree.root));        
        System.out.println("Number of nodes only have a right child: "+
                myTree.countNumberOfNodesOnlyHaveRightChild(myTree.root));        
    
        System.out.println("----Delete by Copying---");
//        myTree.root = myTree.deleteByCopyingLeft(myTree.root, 10);
//        myTree.root = myTree.deleteByCopyingRight(myTree.root, 10);
//        myTree.breadthFirstTraversal(myTree.root);
//        System.out.println("\nDelete by Merging");
//        myTree.root = myTree.deleteByMering(myTree.root, 150);
//        myTree.breadthFirstTraversal(myTree.root);
//        System.out.println("");
        System.out.println("\nSearching");
        int x;
        Scanner sn = new Scanner(System.in);
//        System.out.print("Input x = ");
//        x = sn.nextInt();
//        if (myTree.searchNode(myTree.root, x)!=null)
//            System.out.println(x+" is existing in the tree.");
//        else
//            System.out.println("Find not found "+x);
        int k;
        myTree.countPre=0;
        System.out.print("\nk = ");
        k=sn.nextInt();
        
        Node theKPre=null;
        theKPre=myTree.findNodePreOrder(myTree.root, k);
        if (theKPre!=null)
            System.out.println(theKPre.info+" ");
        else
            System.out.println("Find not found.");
        System.out.print("\nk2 = ");
        int k2 = sn.nextInt();
        
        myTree.countInOrder=0;
        Node thkIn=null;
        thkIn=myTree.findNodeInOrder(myTree.root, k2);
        if (thkIn!=null)
            System.out.println(thkIn.info+" ");
        else
            System.out.println("Find not found.");
        System.out.println("");        
    
    }
}
