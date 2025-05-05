package Oops;
//This is the example for multiple inheritance 
//Java does not support multiple inheritance
//It can be achieved by interface
interface ForMlutipleParent1
{
	abstract void parent1();
}
interface ForMlutipleParent2
{
	abstract void parent2();
}
//This is the child class acquiring the properties form both the parent classes
class Child implements ForMlutipleParent1, ForMlutipleParent2
{
	public void parent1()
	{
		System.out.println("this is the child class");
		System.out.println("This class acquiring the properties from the parent1");
	}
	public void parent2()
	{
		System.out.println("This class acquiring the properties from the parent2");
	}
}

public class MultipleInhertance {

	public static void main(String[] args) {
       Child ch=new Child();
       ch.parent1();
       ch.parent2();
	}


}
