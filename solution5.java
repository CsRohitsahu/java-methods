import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        int a=sc.nextInt();
    
        System.out.println("enter second no.");
        int b=sc.nextInt();
    
        System.out.println("enter third no.");
        int c=sc.nextInt();
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("smalles no. is "+smallest);
    }
    
}
