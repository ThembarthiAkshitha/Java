package Oops;

public class Constructors {
	
    Constructors()
    {
    	System.out.println("This is the default constructor");
    }
    Constructors(String name)
    {
    	System.out.println("welcome "+name);
    }
    Constructors(String vlg,int pincode)
    {
    	System.out.println("you are from "+vlg+" zip code "+pincode+" Right?");
    }
	public static void main(String[] args)
	{
		Constructors c=new Constructors();
		Constructors d=new Constructors("akshaya");
		Constructors e=new Constructors("thippapur",503101);
	}
}