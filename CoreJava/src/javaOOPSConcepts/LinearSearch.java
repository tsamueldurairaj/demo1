package javaOOPSConcepts;

import java.util.Scanner;

public class LinearSearch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
	int c, n, search, array[];
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number of Integers: ");
	n=scan.nextInt();
	array = new int[n];
	System.out.println("Enter "+n+" Integers");
	
			for(c=0;c<n;c++)
				array[c] = scan.nextInt();
			
  System.out.println("Enter the value to find: ");
  search = scan.nextInt();
  
  for(c=0; c<=n; c++)
  {
	  if(array[c]==search)
	  {
		  System.out.println(search +" is present in the location "+(c+1));
		  break;
	  }

  }
  if(c==n){
	
		  System.out.println(search + " is not present in array.");
  }
	}

}
