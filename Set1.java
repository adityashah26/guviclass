import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>0)
			System.out.print("Positive number");
		else
		if(x<0)
			System.out.print("Negative number");
		else
			System.out.print("Zer0");
	}
}