package Oops;
import java.util.*;

public class Exception {

	public static void main(String[] args) {
		int a;
		int b;
	    int c=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the firstnumber:");
	    a=sc.nextInt();
	    System.out.println("Enter the secondnumber:");
	    b=sc.nextInt();
        if(b==0)
        {
            try
            {
            	c=a/b;
            }
            catch(ArithmeticException ae)
            {
            	System.out.println(" "+ae);
            }
            finally
            {
            	System.out.println("Execution is completed");
            }
        }
        else
        {
             System.out.println(" "+(a/b));
        }
	}
}
