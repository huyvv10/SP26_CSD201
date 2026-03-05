public class AVLTree {
    Node root;

    public AVLTree() {
        root=null;
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    
    public int getHeight(Node xRoot){
        if (xRoot==null) return 0;
        return xRoot.height;
    }
    
    public int getBalance(Node xRoot){
        if (xRoot==null) return 0;
        return getHeight(xRoot.left)-getHeight(xRoot.right);
    }
    
    public Node rightRotate(Node xRoot){
        if (xRoot==null) return null;
        Node k = xRoot.left;
        xRoot.left=k.right;
        k.right=xRoot;
        
        xRoot.height = Math.max(getHeight(xRoot.left), getHeight(xRoot.right))+1;
        k.height = Math.max(getHeight(k.left), getHeight(k.right))+1;
        return k;
    }
    
    public Node leftRotate(Node xRoot){
        if (xRoot==null) return null;
        Node k = xRoot.right;
        xRoot.right=k.left;
        k.left=xRoot;
        
        xRoot.height = Math.max(getHeight(xRoot.left), getHeight(xRoot.right))+1;
        k.height = Math.max(getHeight(k.left), getHeight(k.right))+1;
        return k;
    }    
    
    public Node addAVLNode(Node xRoot, int x){
        if (xRoot==null) return new Node(x);
        if (x < xRoot.info){
            xRoot.left = addAVLNode(xRoot.left, x);
        } else if (x > xRoot.info){
            xRoot.right = addAVLNode(xRoot.right, x);
        } else return xRoot;
        
        xRoot.height = Math.max(getHeight(xRoot.left), getHeight(xRoot.right))+1;
        int balanceFactor = getBalance(xRoot);
        if (balanceFactor > 1){
            //Case 1:
            if (x < xRoot.left.info)
                return rightRotate(xRoot);
            //Case 3:
            if (x > xRoot.left.info){
                xRoot.left=leftRotate(xRoot.left);
                return rightRotate(xRoot);
            }
        } else if (balanceFactor<-1){
            //Case 2: 
            if (x > xRoot.right.info)
                return leftRotate(xRoot);
            //Case 4:
            if (x < xRoot.right.info){
                xRoot.right=rightRotate(xRoot.right);
                return leftRotate(xRoot);
            }
        }
        return xRoot;            
    }

    public void visit(Node x){
        if (x==null) return;
        System.out.print(x.info+" ");
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
        //Balance the tree
        xRoot.height = Math.max(getHeight(xRoot.left), getHeight(xRoot.right))+1;
        int balanceFactor = getBalance(xRoot);
        if (balanceFactor > 1){
            //Case 1:
            if (x < xRoot.left.info)
                return rightRotate(xRoot);
            //Case 3:
            if (x > xRoot.left.info){
                xRoot.left=leftRotate(xRoot.left);
                return rightRotate(xRoot);
            }
        } else if (balanceFactor<-1){
            //Case 2: 
            if (x > xRoot.right.info)
                return leftRotate(xRoot);
            //Case 4:
            if (x < xRoot.right.info){
                xRoot.right=rightRotate(xRoot.right);
                return leftRotate(xRoot);
            }
        }       
        return xRoot;
    }    
}
