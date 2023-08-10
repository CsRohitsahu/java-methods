import java.util.Scanner;

public class solution3{

 public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.println("enter string");

 String str = sc.nextLine();

 System.out.print(middle(str));

 }

 public static String middle(String str){

 if(str.length() % 2 == 0){

 return str.substring(str.length()/2, str.length()/2 + 2);

 }else{

 return str.substring(str.length()/2, str.length()/2 + 1);

 }

 }

}
