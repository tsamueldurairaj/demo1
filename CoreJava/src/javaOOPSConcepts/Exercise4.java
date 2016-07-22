package javaOOPSConcepts;

public class Exercise4 {

	public static void main(String[] args) {
		
		Exercise4 a = new Exercise4();
		
           int sum =0;
           double average;
           int lowerbound =1;
           int upperbound =100;
	
	for(int number = lowerbound; number <= upperbound; number++)
	{
		sum = sum+number;
	}
	System.out.println("Summation: "+sum);
	
	average = sum/upperbound;
	
	System.out.println("Average Value: "+average);
	
	a.demo();
	
	}

	void demo()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("sum" +i);
		}
	}

}


