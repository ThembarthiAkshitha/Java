package Oops;

class Vehicle
{
	String name;
	int price;
	public void display(String name)
	{
		this.name=name;
		System.out.println("Name of the Vehicle:"+name);
	}
}
class Car extends Vehicle
{
	String name;
	int price;
	public void display1(String carname,int carprice)
	{
		name=carname;
		price=carprice;
		System.out.println("The price of a car "+name+" is:"+price);
	}
}
class SportsCar extends Car
{
	String name;
	int price;
	public void display2(String sportcarname,int sportcarprice)
	{
		name=sportcarname;
		price=sportcarprice;
		System.out.println("The price of sport car "+name+" is:"+price);
	}
}

public class MultilevelInheritance {
    //this is the example for multilevel inheritance in this one child will be the parent for another class
	public static void main(String[] args) {
	//here we are creating the object for the SportsCar as it has all the propeties of Car as well as Vehicle classes
	    SportsCar sc=new SportsCar();
	    sc.display("CAR");
	    sc.display1("MarutiSuzukiEeco",530000);
	    sc.display2("Mini Cooper S",4495000);
	    
	}

}
