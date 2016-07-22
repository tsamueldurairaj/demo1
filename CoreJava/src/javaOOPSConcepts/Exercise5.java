package javaOOPSConcepts;

public class Exercise5 {

	public static void main(String[] args) {
		
		int lowerbound = 1;
		int upperbound = 110;
		
		for (int number=lowerbound; number<=upperbound; number++)
		{
			if(number%3==0)
			{
				System.out.print("Coza");
			}
			if(number%5==0)
			{
				System.out.print("Loza");
			}
			if(number%7==0)
			{
				System.out.print("Woza");
			}
			if(number%3%5%7>=1)
			{
				System.out.print(number);
			}
			if(number%11==0)
			{
				System.out.println();
			}
			
		}
	}

}
