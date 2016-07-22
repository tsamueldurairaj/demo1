package javaOOPSConcepts;
import java.util.Scanner;

// Print Number in Words

public class Exercise3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int n;
		System.out.print("Enter The Number:  ");
		Scanner val = new Scanner(System.in);
		n = val.nextInt();
		
		switch(n)
		{
		case 1: 
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
		    break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.print("Greater than Three");
			
		}

	}

}
