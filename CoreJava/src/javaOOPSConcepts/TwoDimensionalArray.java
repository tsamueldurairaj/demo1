package javaOOPSConcepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Two Dimensional Arrays
		String x[][] = new String[3][4];
		//First Row
		x[0][0] = "sachin";
		x[0][1] = "sourav";
		x[0][2] = "dravid";
		x[0][3] = "kumble";
		
		//second row
		x[1][0] = "dhoni";
		x[1][1] = "raina";
		x[1][2] = "yuvraj";
		x[1][3] = "dhawan";
		
		//third row
		x[2][0] = "a";
		x[2][1] = "b";
		x[2][2] = "c";
		x[2][3] = "d";
	
		System.out.println("Number of rows:" +x.length);
		System.out.println("Number of cols:" +x[0].length);
		
		int rows=x.length;
		int cols=x[0].length;
		
		for(int rowNum=0; rowNum<rows; rowNum++)
		{
			for(int colNum=0; colNum<cols; colNum++)
			{
				System.out.print(x[rowNum][colNum] + "--");
			}
			System.out.println();
		}
		//Printing the values of first 50 even numbers
		/*for(int i=2; i<=100; i+=2)
		{
			System.out.println("Even Numbers:"+i);
		}*/
	}

}
