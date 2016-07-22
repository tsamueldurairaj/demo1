package javaOOPSConcepts;

public class Practise2 {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//declaration and instantiation of an array
		//1st Type
		//int a[] = new int[5];
		//2nd Type
		int a[][]={{1,2,3},{4,5,6}};
		
		
		
		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[i].length; j++)
			System.out.println(a[i][j]);
		}
		
	}

}
