import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n,s=0;
       
        System.out.print("Enter no. of natural numbers:");
        n=sc.nextInt();
         int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        System.out.println(s);
     }
}