package javaOOPSConcepts;

public class Static_NonStatic {
	
	/*String name;
	static int a;*/
	
	String model;
	int price = 1222;
	static int wheels=5;

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
        //System.out.println("ModelName:" +c2.model);
        
        
		/*sum();
		a = 100;*/
        
		
	}
	/*public static void sum()//static function
	{
		int i=100;     // local variable (this variable has life only within this function)
		
	}
    public void SendMail()  //non static
    {
    	int y=200;    
    	a=100;
    	sum();
    	name="samuel";
    }*/
	
	public void start()
	{
		//System.out.println(model +"starting");
		
	}
	public static void accelarate()
	{
		System.out.println(wheels +"starting");
	}
	
}
