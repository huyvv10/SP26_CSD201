public class BSTree {
    Node root;

    public BSTree() {
        root=null;
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    
    public void addNode(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            root=newNode;
            return;
        } else {
            Node p = root;
            while (p!=null){
                if (p.info==newNode.info){
                    System.out.println(x+" already existed.");
                    return;
                }
                if (newNode.info<p.info){
                    if (p.left==null){
                        p.left=newNode;
                        return;
                    } else {
                        p=p.left;
                    }                    
                } else {
                    if (p.right==null){
                        p.right=newNode;
                        return;
                    } else {
                        p=p.right;
                    }
                }
            }
        }
    }
    
    public void visit(Node x){
        if (x==null) return;
        System.out.print(x.info+" ");
    }
    
    //Visit G_L_R
    public void preOrder(Node xRoot){
        if (xRoot==null) return;
        visit(xRoot);            //visit root
        if (xRoot.left!=null)
            preOrder(xRoot.left);    //visit left
        if (xRoot.right!=null)
            preOrder(xRoot.right);   //visit right
    }
    
    //Visit L_G_R
    public void inOrder(Node xRoot){
        if (xRoot==null) return;
        if (xRoot.left!=null)
            inOrder(xRoot.left);    //visit left
        visit(xRoot);            //visit root
        if (xRoot.right!=null)
            inOrder(xRoot.right);   //visit right        
    }
    //Visit L_R_G
    public void postOrder(Node xRoot){
        if (xRoot==null) return;
        if (xRoot.left!=null)
            postOrder(xRoot.left);    //visit left
        if (xRoot.right!=null)
            postOrder(xRoot.right);   //visit right 
        visit(xRoot);            //visit root        
    }
    
    public int countNode(Node xRoot){
        if (isEmpty()) return 0;
        int g=0,l=0,r=0;
        if (xRoot.left!=null)
            l = countNode(xRoot.left);    //visit left
        g++;
        if (xRoot.right!=null)
            r= countNode(xRoot.right);   //visit right         
        return l+g+r;
    }
    
    public void breadthFirstTraversal(Node xRoot){
        if (xRoot==null) return;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            visit(p);
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
    }
                
    public int countNodeBFS(Node xRoot){ 
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    } 
    
    //Return the number of leaf nodes
    public int countExternalNodes(Node xRoot){
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            if (p.left==null && p.right==null)
                count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    }

    //Return the number of internal nodes
    public int countInternalNodes(Node xRoot){
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            if (p.left!=null || p.right!=null)
                count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    }    
    
    //Return the number of nodes which have two children
    public int countNumberOfNodesHaveTwoChildren(Node xRoot){
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            if (p.left!=null && p.right!=null)
                count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    }
    
    //Return the number of nodes which only have a left subtree
    public int countNumberOfNodesOnlyHaveLeftChild(Node xRoot){
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            if (p.left!=null && p.right==null)
                count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    }   

    //Return the number of nodes which only have a right subtree
    public int countNumberOfNodesOnlyHaveRightChild(Node xRoot){
        int count=0;
        if (xRoot==null) return 0;
        Queue myQ = new Queue();
        myQ.enqueue(xRoot);
        while (!myQ.isEmpty()){
            Node p = (Node)myQ.front();
            myQ.dequeue();
            if (p.left==null && p.right!=null)
                count++;
            if (p.left!=null)
                myQ.enqueue(p.left);
            if (p.right!=null)
                myQ.enqueue(p.right);
        }
        return count;
    }   
    
    //Find the maximum node
    public Node findTheRightMostNode(Node xRoot){
        if (xRoot==null) return null;
        Node p = xRoot;
        while (p.right!=null){
            p=p.right;
        }
        return p;
    }

    //Find the minimum node
    public Node findTheLeftMostNode(Node xRoot){
        if (xRoot==null) return null;
        Node p = xRoot;
        while (p.left!=null){
            p=p.left;
        }
        return p;
    }
    
    //Delete by Copying default
    public Node deleteByCopyingLeft(Node xRoot, int x){
        if (xRoot==null) return null;
        if (x < xRoot.info)
            xRoot.left=deleteByCopyingLeft(xRoot.left, x);
        else if (x > xRoot.info){
            xRoot.right=deleteByCopyingLeft(xRoot.right, x);
        } else {
            if (xRoot.left==null)
                return xRoot.right;
            if (xRoot.right==null)
                return xRoot.left;
            Node copyNode = findTheRightMostNode(xRoot.left);
            xRoot.info = copyNode.info;
            xRoot.left = deleteByCopyingLeft(xRoot.left, copyNode.info);
        }
        return xRoot;
    }

    //Delete by Copying
    public Node deleteByCopyingRight(Node xRoot, int x){
        if (xRoot==null) return null;
        if (x < xRoot.info)
            xRoot.left=deleteByCopyingRight(xRoot.left, x);
        else if (x > xRoot.info){
            xRoot.right=deleteByCopyingRight(xRoot.right, x);
        } else {
            if (xRoot.left==null)
                return xRoot.right;
            if (xRoot.right==null)
                return xRoot.left;
            Node copyNode = findTheLeftMostNode(xRoot.right);
            xRoot.info = copyNode.info;
            xRoot.right = deleteByCopyingRight(xRoot.right, copyNode.info);
        }
        return xRoot;
    }  

//    Delete by merging a node with value as x in the tree
    public Node deleteByMering(Node xRoot, int x){
        if (xRoot==null) {
            System.out.println("Find not found "+ x+ " in the tree");
            return null;
        }            
        if (x < xRoot.info)
            xRoot.left = deleteByMering(xRoot.left, x);
        else if (x > xRoot.info){
            xRoot.right = deleteByMering(xRoot.right, x);
        } else {
            if (xRoot.left==null) 
                return xRoot.right;
            if (xRoot.right==null)
                return xRoot.left;
            Node mergeNode = findTheRightMostNode(xRoot.left);
            mergeNode.right=xRoot.right;
            return xRoot.left;            
        }                    
        return xRoot;
    }
    
    public Node searchNode(Node xRoot, int x){
        if (xRoot==null) return null;
        if (x == xRoot.info) return xRoot;
        if (x < xRoot.info)
            return searchNode(xRoot.left, x);
        else
            return searchNode(xRoot.right, x);
    }
    
    public int countPre=0;
    public Node p=null;
    //Return node theK by travesaling in PreOrder
    public Node findNodePreOrder(Node xRoot, int theK){
        if (xRoot==null) return null;
        countPre++;
        if (countPre==theK){
            p=xRoot; 
        }
        xRoot.left=findNodePreOrder(xRoot.left, theK);
        xRoot.right=findNodePreOrder(xRoot.right, theK);
        return p;
    }

    public int countInOrder=0;
    public Node nodeInOrder=null;
    //Return node theK by travesaling in InOrder    
    public Node findNodeInOrder(Node xRoot, int theK){
        if (xRoot==null) return null;
        xRoot.left=findNodeInOrder(xRoot.left, theK);
        countInOrder++;
        if (countInOrder==theK)
            nodeInOrder=xRoot;
        xRoot.right=findNodeInOrder(xRoot.right, theK);
        return nodeInOrder;
    }
    
}
