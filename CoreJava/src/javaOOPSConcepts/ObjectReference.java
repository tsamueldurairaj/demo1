package javaOOPSConcepts;

public class ObjectReference {
	
	//Swapping values using PASS BY VALUE and PASS BY REFERENCE  

	
	int x,y;
	public static void main(String[] args) 
	{
	
	ObjectReference p = new ObjectReference();
	p.x=10;
	p.y=20;
	
	System.out.println("Values:" + p.x +"--"+p.y);
	
	swap(p.x, p.y);
	
	System.out.println("Values:" + p.x +"--"+p.y);
    
	swapVals(p);
	
	System.out.println("Values:" + p.x +"--"+p.y);
	
	}
	
	public static void swap(int a, int b) ///Pass by value
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static void swapVals(ObjectReference t)  //Pass by reference
	{
		int temp = t.x;
		t.x = t.y;
		t.y = temp;
	}
	

}
