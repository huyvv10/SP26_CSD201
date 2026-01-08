import java.util.Scanner;
public class MyArray {
    public static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        System.out.print("Input number of elements: ");
        n = sn.nextInt();
        
        int[] arr = new int[n];
        inputArr(arr);
        display(arr);
        calcualte(arr);
        listPrime(arr);
        sortAsc(arr);
        display(arr);
        sortDesc(arr);
        display(arr);
    }
    //Bubble sort
    public static void sortAsc(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[j]<a[j-1]) {
                    int tg=a[j]; a[j]=a[j-1]; a[j-1]=tg;
                }
            }
        }
    }
    public static void sortDesc(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[j]>a[j-1]) {
                    int tg=a[j]; a[j]=a[j-1]; a[j-1]=tg;
                }
            }
        }
    }    
    public static boolean isPrime(int n){
        if (n<2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    
    public static void listPrime(int[] a){
        int S=0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                System.out.print(a[i]+" ");
                S+=a[i];
            }
        }
        System.out.println(S);
    }
    
    public static void calcualte(int[] a){
        int S=0, S1=0, S2=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            S+=a[i];
        }
        System.out.println(S);
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==1) {
                System.out.print(a[i]+" ");
                S1+=a[i];                
            }
        }
        System.out.println(S1);
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                System.out.print(a[i]+" ");
                S2+=a[i];                
            }
        }
        System.out.println(S2);        
    }
    
    public static void inputArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i]=sn.nextInt();
        }
    }
    
    public static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println("");
    }
    
}
