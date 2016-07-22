package javaOOPSConcepts;

//Creating multiple objects by one type only

class Exercise6
{
	int length;
	int width;
	
	void insert(int l,int w){
		length=l;
		width=w;
	}
	void calculation(){
	System.out.println(length*width);
	}
	
	public static void main(String args[]){
		Exercise6 r1= new Exercise6();
		Exercise6 r2= new Exercise6();
		
		r1.insert(11, 5);
		r2.insert(12, 6);
		
		r1.calculation();
		r2.calculation();
		
	}
	}
