package javaOOPSConcepts;

public class Functions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int s = sumAll(2, 3, 0);
		System.out.println("Value:"+s);
		//sumAll(12, 22, 21);
		
		

	}
   public static int sumAll(int a,int b,int c)
   {
	   int sum = a+b+c;
	   System.out.println("summation:" +sum);
	   return sum;
   }
  
}
