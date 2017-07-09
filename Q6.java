import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%400==0 || x%4==0)
            System.out.print("Leap year");
        else
            System.out.print("Not a leap year");
     }
}