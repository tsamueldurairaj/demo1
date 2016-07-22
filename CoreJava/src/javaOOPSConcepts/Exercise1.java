package javaOOPSConcepts;

//Check Pass or Fail


import java.util.Scanner;

public class Exercise1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int mark;		
		Scanner val= new Scanner(System.in);
		System.out.print("Enter your mark:");
		mark = val.nextInt();
		
		if(mark>=50)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
