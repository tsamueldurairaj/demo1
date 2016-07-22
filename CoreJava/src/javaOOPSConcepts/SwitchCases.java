package javaOOPSConcepts;
import java.util.Scanner;


public class SwitchCases {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int i =18;
		System.out.print("Whats ur age?");
		i = scan.nextInt();
		
		switch (i)
		{
		case 18:
			System.out.println("You are an Adult");
			break;
			
		case 10:
			System.out.println("Chinna payalae");
			break;
		
		default:
			System.out.println("Please Tell ur age");
			break;
		
		}
		
	}

}
