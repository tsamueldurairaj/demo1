package javaOOPSConcepts;

//Class have multiple methods by same name but different parameters is called method overloading.

public class MethodOverloading {
	
	public static void calculation1(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void calculation1(int a,int b)
	{
		System.out.println(a+b);
	}
	MethodOverloading(int a, int b)
	{
		System.out.println(a-b);
	}
	

	static public void main(String args[]) {
		
		MethodOverloading m1=new MethodOverloading(23, 10);		
		MethodOverloading.calculation1(10, 11, 12);
		m1.calculation1(22, 33);
      
	}
	
}
