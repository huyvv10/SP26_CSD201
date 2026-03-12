
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Graph {

    int[][] adj;
    int size;

    public Graph(String fName) throws FileNotFoundException, IOException {
        try {
            RandomAccessFile raf = new RandomAccessFile(fName, "r");
            size = Integer.parseInt(raf.readLine());
            adj = new int[size][size];
            int i = 0;
            String line = "";
            while ((line = raf.readLine()) != null) {
                String[] S = line.split("\\s+");
                for (int j = 0; j < S.length; j++) {
                    adj[i][j] = Integer.parseInt(S[j].trim());
                }
                i++;
            }
            for (i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    adj[j][i] = adj[i][j];
                }

            }
            raf.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    char toChar(int n){
        return (char) (n+65);
    }
    
    int toInt(char v){
        return (int)(v-65);
    }
    
    public void visit(char v){
        System.out.print(v + " ");
    }
    public void BFS(char v){
        boolean[] visited = new boolean[size];
        Arrays.fill(visited,false);
        Queue myQ = new Queue();
        myQ.enqueue(toInt(v));
        while (!myQ.isEmpty()){
            int i = (int) myQ.front();
            myQ.dequeue();
            visit(toChar(i));
            visited[i]=true;
            for (int j = 0; j < size; j++) {
                if (adj[i][j]!=0 & !visited[j]){
                    visited[j]=true;
                    myQ.enqueue(j);
                }
            }
        }
        System.out.println("");
    }
    
}
