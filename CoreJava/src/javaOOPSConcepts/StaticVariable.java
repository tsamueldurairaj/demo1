package javaOOPSConcepts;

//Program for static variable


public class StaticVariable {
	
	String name;
	int employeeID;
	static String address="chennai"; 
	
	StaticVariable(String n,int eID){
		name = n;
		employeeID = eID;
	}
	
	void display(){
		System.out.println(name+" "+employeeID+" "+address);
	}
	

	public static void main(String[] args) {
		StaticVariable sv1 = new StaticVariable("samuel",4322);
        sv1.display();
	}

}
