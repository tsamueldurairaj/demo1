package javaOOPSConcepts;

public class Demo {
	
	int b=20;
	
     static String name="samuel";
     {
 		System.out.println("Instance Block");
 	}
     static void sample1()
     {
    	 for(int i=0;i<=5;i++)
    	 {
    		 System.out.println(i);
    	 }
     }
     
     Demo(){
    	int a[][]={{1,2,3},{4,5,6}};
    	for(int i=0; i<a.length;i++)
    		for(int j=0; j<a[i].length;j++)
    	System.out.println(a[i][j]);
     }
	void sample()
	{
		int a=10;
		if(a>b)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");
		System.out.println(Demo.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
	
		obj.sample();
		System.out.println(obj.b);
		System.out.println(Demo.name);
		Demo.sample1();
		
	}
	

}
