public class Node {
    int info;
    int height;
    Node left, right;
    Node(){};
    Node(int _info){
        info=_info;
        height=1;
        left=null;
        right=null;
    }
}
