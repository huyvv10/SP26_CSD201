
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Graph myG = new Graph("Input.txt");
        myG.display(myG.adj);
        System.out.println(myG.toChar(2));
        System.out.println("B = " +myG.toInt('B'));  
        System.out.println("---- BFS From 'A'---");
        myG.BFS('A');
                
    }

}
