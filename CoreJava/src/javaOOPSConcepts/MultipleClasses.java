package javaOOPSConcepts;

import java.util.Scanner;

public class MultipleClasses {
    
	public static String x, y, temp; 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MultipleClasses obj1 = new MultipleClasses();
		
		
        System.out.println("Enter the value of X: ");
        System.out.println("Enter the value of y: ");
		Scanner sca = new Scanner(System.in);
		x = sca.nextLine();
		y = sca.nextLine();
		
	   MultipleClasses.swapping();
		
		System.out.println("Value of X: " +x);
		System.out.println("Value of Y: " +y);
	}
	
	public static void swapping(){
		temp = x;
		x = y;
		y = temp;
	}

}

class newclass{
	static String x, y, temp;
	public static void swapping(){
		
		//Swapping
				temp = x;
				x = y;
				y = temp;
	}
	
	
}
