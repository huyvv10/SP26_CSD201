
import java.util.Scanner;


public class Factorial {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
    
    public static int factorial(int n){
        if (n==0)
            return 1;
        else
            return n* factorial(n-1);
    }
}
