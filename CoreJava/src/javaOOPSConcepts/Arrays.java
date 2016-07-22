package javaOOPSConcepts;

import java.util.Scanner;

public class Arrays {

	//static int arr[]={1,2,3,4};
	static int col,len;
	static int arr[];
	static int temp;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of columns: ");
		col = scan.nextInt();
		arr = new int[col];
		System.out.println("Enter the values: ");
		
		
	   for(int i=0;i<col;i++)
	   {
		   arr[i]=scan.nextInt();
	   }
	   
	   System.out.println("The Sorted Array is:  ");
	   for(int i=0;i<col;i++)
	   {
		   
		   if(arr[i]>arr[i+1])
		   {
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		   }
		   System.out.print(arr[i+1]+" ");
	   }
	  

		}
		
	}


