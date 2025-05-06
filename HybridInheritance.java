package Oops;

class Human//this is the super class 
{
	String name;
	public void display(String name)
	{
		this.name=name;
		System.out.println(""+name);
	}
}
//this is the derived class of Human class and will be the super class for Animal class 
class Female extends Human{
	String name;
    public void display1(String name)
    {
    	this.name=name;
    	System.out.println(""+name);
    }
}
interface Cat//this is an interface
{
	abstract void show();
}
//it is acquiring the properties from both the Female and cat 
class Animal extends Female implements Cat
{
	public void show()
	{
		String name=super.name;
		System.out.println(name+" and cat both are the Animals");
	}
}
//This is the example for hybrid inheritance(i.e combination of two or more inheritances)
public class HybridInheritance {

	public static void main(String[] args) 
	{
        Animal a=new Animal();
        a.display("Female");
        a.display1("Akshitha");
        a.show();
	}

}
