package javaOOPSConcepts;

import java.util.Scanner;

// Create Matrix
public class MatricsAddition {

	static int matrix[][], sum;
	int row, column;
	
	
	@SuppressWarnings("resource")
	void create(){
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Number of Rows: ");
		row = scan.nextInt();
		
		System.out.println("Enter Number of Columns: ");
		column = scan.nextInt();
		
		matrix = new int[row][column];
		System.out.println("Enter the Values: ");
		
		for(int i=0; i<row; i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=scan.nextInt();
			}
			
		}
		
	}
	
	void display(){
		System.out.println("Matrix is: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.println(matrix[i][j]+" ");
			}
		System.out.println();
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		MatricsAddition obj1=new MatricsAddition();
		obj1.create();
		obj1.display();
		sum = matrix[0][0]+matrix[0][1]+matrix[0][2]+matrix[1][0]+matrix[1][1]+matrix[2][0];
		System.out.println(sum);
		
	}
}
