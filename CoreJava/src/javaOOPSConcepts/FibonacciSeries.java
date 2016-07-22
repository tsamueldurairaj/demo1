package javaOOPSConcepts;
import java.util.Scanner;


public class FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		int first = 0;
		int second = 1;
		int numberofterms;
		int next;
		
		
		Scanner val = new Scanner(System.in);
		System.out.print("Number of terms: ");
		numberofterms =val.nextInt();
		
		System.out.print(first+" "+second);		
		for(int count=3; count<=numberofterms; count++){
			
			next = first+second;
			System.out.print("," +next);
			
			first = second;
			second = next;
			
		}
		

	}

}
