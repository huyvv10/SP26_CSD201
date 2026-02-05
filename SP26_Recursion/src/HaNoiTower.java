import java.util.Scanner;

public class HaNoiTower {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input number of disks: ");
        int n = sn.nextInt();
        hanoiTower(n, 'A', 'C', 'B');        
    }
    
    public static void hanoiTower(int n, char s, char d, char m){
        if (n==1)
            System.out.println("Move disk "+n+" from "+s+" to "+ d );
        else{
            hanoiTower(n-1, s, m, d);
            System.out.println("Move disk "+n+" from "+s+" to "+ d );
            hanoiTower(n-1, m, d, s);
        }
    }
}
