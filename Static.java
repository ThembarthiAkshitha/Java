package BasicConcepts;

public class Static {
	static int a=10;
	static float b=100.99f;
	static char c='h';
	static String name="Akshitha";
	static boolean h=true;
	public static void main(String[] args) 
	{   
	    	//once we changed the value of a static variable we cannot get the previous value
	    	name="hey!";//trying to change the value of the string name
	    	System.out.println("hello world!");
	    	System.out.println("a:"+a);
	    	System.out.println("b:"+b);
	    	System.out.println("char:"+c);
	    	System.out.println("string:"+name);
	    	System.out.println("boolean:"+h);
	 }
}
