package Oops;

public class MethodOverloading {
	public void average(int a,int b)
	{
		int c=(a+b)/2;
		System.out.println(""+c);
	}
	public void average(int a,int b,int c)
	{
		int d=(a+b+c)/3;
		System.out.println(""+d);
	}
	public void average(int a,float b)
	{
		float c=(a+b)/2;
		System.out.println(""+c);
	}

	public static void main(String[] args) {
    MethodOverloading m=new MethodOverloading();
    m.average(101,607);
    m.average(3,6,12);
    m.average(2, 2.2f);
	}

}
