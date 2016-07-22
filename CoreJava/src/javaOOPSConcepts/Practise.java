package javaOOPSConcepts;

public class Practise {
	
	 int a[]={1,2,3,4,5,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	loops();

	}
	public static void maths()
	{
		int a =20;
		 int b =10;
		 int sum;
		 int sub;
		 int mul;
		 int div;
		sum = a+b;	
		System.out.println("Sum of A and B=" +sum);
		
		sub = a-b;	
		System.out.println("Subraction of A and B=" +sub);	
		
		mul = a*b;	
		System.out.println("Multiplication of A and B=" +mul);
		
		div = a/b;	
		System.out.println("Division of A and B=" +div);
	}

	public static void loops(){
		
		for(int i2=0; i2<=3; i2++)
		{
			for (int i1=0; i1<=2; i1++)
			{
			System.out.println(i2+" "+i1);
		    }
		}		
	}
}
