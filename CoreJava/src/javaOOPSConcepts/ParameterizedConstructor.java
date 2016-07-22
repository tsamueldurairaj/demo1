package javaOOPSConcepts;

public class ParameterizedConstructor {

int len;
int breadth;
	
	ParameterizedConstructor(int l,int b){
		len = l;
		breadth = b;
		
	}
	
	void display(){
		
		System.out.println("Area= " + len*breadth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ParameterizedConstructor a = new ParameterizedConstructor(10,5);
	a.display();	
	}

}
