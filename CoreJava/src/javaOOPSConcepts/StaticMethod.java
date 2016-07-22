package javaOOPSConcepts;

public class StaticMethod {

	int rollno;
	String name = "Samuel";
	static String address="chennai";
	
	static void display1(){
		//address="tiruvallur";
		StaticMethod obj1 = new StaticMethod();
		System.out.println(obj1.name);
	}
	
	public static void main(String[] args) {
		//StaticMethod obj = new StaticMethod();
	StaticMethod.display1();	
	System.out.println(address);

	}
	
}






