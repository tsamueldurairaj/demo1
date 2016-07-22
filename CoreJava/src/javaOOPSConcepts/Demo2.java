package javaOOPSConcepts;

public class Demo2 {
	int a =10;
	static int b = 20;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo2 obj= new Demo2();
        //Demo2 obj1=new Demo2();
        System.out.println(obj.a);
		obj.sum();
	}
 void sum()
	{ 
	    Demo2 d = new Demo2();
		System.out.println(d.a);
		System.out.println(Demo2.b);
	}

}
