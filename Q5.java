import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z)
            System.out.print("1st no. is greatest");
        else
        if(y>x && y>z)
            System.out.print("2nd no. is greatest");
        else
            System.out.print("3rd no. is greatest");
     }
}