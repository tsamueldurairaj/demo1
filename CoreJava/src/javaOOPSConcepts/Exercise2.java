package javaOOPSConcepts;
import java.util.Scanner;



// CHECK ODD OR EVEN

public class Exercise2 {

	public static void main(String[] args) {

            int n;
            System.out.print("Enter the value:  ");
            @SuppressWarnings("resource")
			Scanner val = new Scanner(System.in);
            n=val.nextInt();
            
            
            if(n%2==0)
            {
            	System.out.println("Even Number");
            }
            
            else
            {
            	System.out.println("Odd Number");
            }
	}

}
