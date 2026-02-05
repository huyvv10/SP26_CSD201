
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(8);
        myStack.push(6);
        myStack.push(9);
        myStack.push(2);
        
        System.out.print("The top element: "+ 
                myStack.top());
        
        System.out.println("");
        while (!myStack.isEmpty()){
            System.out.print(myStack.top()+ " ");
            myStack.pop();
        }
        System.out.println("");
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        System.out.print("The binary of "+ n+": ");
        decToBin(n);
        System.out.println("");
    }
    //Convert n from decimal to binary
    public static void decToBin(int n){
        if(n==0) {
            System.out.println("0");
            return;
        }
        Stack myS = new Stack();
        while (n!=0){
            myS.push(n%2);
            n=n/2;
        }
        while (!myS.isEmpty()){
            System.out.print(myS.top());
            myS.pop();
        }
    }
}
