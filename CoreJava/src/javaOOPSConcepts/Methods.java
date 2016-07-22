package javaOOPSConcepts;

public class Methods {
	
	void m1()
	{
		Methods.m2();
		System.out.println("Instance Method");
	}
	static void m2()
	{
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods obj=new Methods();
		obj.m1();
		
		

	}

}
