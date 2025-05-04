package Oops;

interface Book//interface
{
	//abstract method
	abstract void read();//method prototype
	abstract void write();//method prototype
}
class Diary implements Book//child class
{
	public void read()//method implementation
	{
		System.out.println("This is the example for the interface");
		System.out.println("In the interfaces we have only the abstract methods");
	}
	public void write() //method implementation
	{
		System.out.println("Abstraction method means we will have only method protoype & we will use the abstract keyword");
		System.out.println("Method implemtation will be in the child class");
	}
}
public class Interfaces //this is the main class
{
     public static void main(String[] args) {
    	 Diary d=new Diary();
    	 d.read();
    	 d.write();
     }
}
