import java.util.Scanner;

public class solution4 {
    static boolean chekLeapYear(int year){
        return year%4==0||(year%400==0&&year%100!=0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year to check whether it is leap year or not");
        int year=sc.nextInt();
        if(chekLeapYear(year)) System.out.println(year+" is leap year");
        else System.out.println(year+" is  not leap year");

    }
}
