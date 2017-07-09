import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        if(x=='A'|| x=='a'|| x=='E'||x=='e'||x=='I'||x=='i'||x=='O'||x=='o'||x=='U'||x=='u')
            System.out.print("Vowel");
        else
            System.out.print("Consonant");
     }
}