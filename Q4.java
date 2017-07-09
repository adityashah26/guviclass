import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        if((x>='a' && x<='z')||(x>='A' && x<='Z'))
            System.out.print("Character");
        else
            System.out.print("Special Character");
     }
}