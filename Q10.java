import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n,c=0,d;
       
        System.out.print("Enter no.:");
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            c++;
            n=n/10;
            
        }
        System.out.print(c);
     }
}