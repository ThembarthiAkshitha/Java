package Oops;

class Author
{
	void print() {
		System.out.println("This are the list of Authors with their book names:");
	}
}
class OHenry extends Author
{
	String authorName="OHenry";
	String bookName="The Gifg of Magi";
	void print1() 
	{
		System.out.println(bookName+" is written by "+authorName);
	}
}
class APJKalam extends Author
{
	String authorName="APJKalam";
	String bookName="The Wings of Fire";
	void print2() 
	{
		System.out.println(bookName+" is written by "+authorName);
	}
}
class RabindranathTagore extends Author
{
	String authorName="Rabindranath Tagore";
	String bookName="Gitanjali";
	void print3() 
	{
		System.out.println(bookName+" is written by "+authorName);
	}
}

public class HierarchicalInheritance {
	//this is the example program for hierarchical inheritance in this we have one parent and multiple childs
	public static void main(String[] args) {
    OHenry oh=new OHenry();
    oh.print();
    oh.print1();
    //each and every class extending the parent class so we need to create separate object for each and every child
    APJKalam apj=new APJKalam();
    apj.print2();
    RabindranathTagore rt=new RabindranathTagore();
    rt.print3();
	}

}
