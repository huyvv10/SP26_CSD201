
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Graph myG = new Graph("Input.txt");
        myG.display(myG.adj);
        System.out.println(myG.toChar(2));
        System.out.println("B = " +myG.toInt('B'));  
        System.out.println("---- BFS From 'A'---");
        myG.BFS('A');
        System.out.println("");
        for (int i = 0; i < myG.size; i++) {
            System.out.println("The degree of vertex "+ 
                    myG.toChar(i)+": "+
                    myG.degree(myG.toChar(i)));
        }
        
        System.out.println("DFS");
        myG.DFSGraph('B');  //DFS start from vertex B
        System.out.println("");
                
    }

}
