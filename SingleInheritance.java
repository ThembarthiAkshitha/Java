package Oops;

class Faculty{
	float salary=50000f;
}
class Science extends Faculty
{
	float bonus=20000f;
}

public class SingleInheritance {
    //this is the example for single inheritance in this we have only one parent class and one child class
	public static void main(String[] args) {
	//the Science(child)class extends the Faculty(parent)class so by creating the object for the child class we can also acess the member variables and methods in the parent(Faculty)class too
    Science s=new Science();
    System.out.println("Faculty salary is:"+s.salary);
    System.out.println("Science faculty bonus is:"+s.bonus);
	}

}