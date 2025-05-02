package BasicConcepts;

public class NonStatic {
    int a=100;
    float b=22.47f;
    char ch='h';
    String add="Hyd";
	public static void main(String[] args)
	{
			  NonStatic ns=new NonStatic();//non static variables can be accessed by the object
			  System.out.println("a:"+ns.a);
			  System.out.println("b:"+ns.b);
			  System.out.println("char:"+ns.ch);
			  System.out.println("add:"+ns.add);
	}
}
