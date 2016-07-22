package javaOOPSConcepts;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays
		
		//Single Dimensional Arrays
		
		/*String str[] = new String[5];
		str[0] = "kumble";
		str[1] = "sachin";
		str[2] = "azhar";
		str[3] = "dravid";
		str[4] = "sourav";
			
		int i[] = new int[3];
		i[0] = 1233;
		i[1] = 321;
		i[2] = 123;
		
		System.out.println("Length of an integer array:"+i.length);
		for(int y=i.length-1; y>=0; y--)
		{
 			System.out.println("Reverse Values:" +i[y]);
		}
		System.out.println("Length of an array:" +str.length);
		//System.out.println("Arrays:" +str[]);
       for(int x=0; x<str.length-1; x++)
       {
    	   System.out.println("Array Value:" +str[x]);
       }*/
	
	//Two Dimensional Array
		
                            // [rows][columns]		
		String x[][] = new String[3][4];
		//First Row
		x[0][1] = "sachin";
		x[0][2] = "sourav";
		x[0][3] = "dravid";
		x[0][4] = "kumble";
		
		//second row
		x[1][1] = "dhoni";
		x[1][2] = "raina";
		x[1][3] = "yuvraj";
		x[1][4] = "dhawan";
		
		//third row
		x[2][1] = "a";
		x[2][2] = "b";
		x[2][3] = "c";
		x[2][4] = "d";
		
		System.out.println("Number of rows:" +x[0].length);
		
		
		
	}

}
