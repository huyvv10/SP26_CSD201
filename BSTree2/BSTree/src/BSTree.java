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
}
