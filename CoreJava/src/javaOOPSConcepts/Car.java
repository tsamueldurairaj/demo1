package javaOOPSConcepts;

public class Car {

	
	String model;
	int price = 1222;
	static int wheels=5;
	
	//Constructor - overloading
	public Car(String model,int price)
	{
		this.model = model;
		//price = price;
	}
	
	public Car()
	{
		System.out.println("constructor without arguement");
	}

	public static void main(String[] args) {
		
		
		Static_NonStatic c1= new Static_NonStatic();
        c1.model="audi";
        c1.price=543222;
        c1.start();
        accelarate();
        
        Static_NonStatic c2= new Static_NonStatic();
        c2.model="benz";
        c2.price=98772;
        c2.start();
        
        
        System.out.println("ModelName:" +Static_NonStatic.wheels);
        Static_NonStatic.wheels = 10;
        System.out.println("ModelName:" +Static_NonStatic.wheels);
       
        
		
	}

	private static void accelarate() {
		
		
	}
}
