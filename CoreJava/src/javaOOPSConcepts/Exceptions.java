package javaOOPSConcepts;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exceptions {

	@SuppressWarnings("resource")
	public void process(int i) {
		
		try
		{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:" );
		i=input.nextInt();
		throw new InputMismatchException();
		}
		
		catch (InputMismatchException e)
		{
			System.out.println("Please enter an integer value");
		}
		
		
		System.out.print("You Entered:"+i);
		

	}

}
