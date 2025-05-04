package Oops;

abstract class Stationary
{
	abstract void books();//abstract method
	abstract void pencil();
	void pen()//concrete method
	{
		System.out.println("This is the example for abstraction");
	}
}
 class BookStationary extends Stationary
{
	void pencil()
	{
		pen();//calling the concrete method
		System.out.println("In abstraction we will have both the abstraction methods as well as concrete methods");
	}
	void books()
	{
		System.out.println("This is implemtation of abstract method");
	}
}

public class Abstraction {

	public static void main(String[] args) {
    BookStationary b=new BookStationary();
    b.pencil();
    b.books();
	}

}
