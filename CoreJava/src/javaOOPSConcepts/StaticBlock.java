package javaOOPSConcepts;

public class StaticBlock {
	
	//static blocks are used to assign values to the static variables
	
	static int number;
	
	static{number=200;}
	static void display()
	{
		System.out.print(StaticBlock.number);
	}
	
	static
	{		
		System.out.println("Static Block-1");
	}


	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
    
   StaticBlock.display();
     
		
	}

}
