import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
     }
}