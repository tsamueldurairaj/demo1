package javaOOPSConcepts;

public class SuperKeyword {

	public static void main(String[] args) {
	
	student obj1 = new student();
	obj1.print();	
		
		//System.out.println(weight);
	}	
}
class person{
	
	String name = "samuel";
	
	public void print(){
		System.out.println(name);
	}
    public void print1(){
    	System.out.println("sachin");
    }

}


class student extends person{
	
	int marks = 88;
	
	public void print(){
		
		System.out.println(marks);
		super.print1();
		super.print();
	}
	
}