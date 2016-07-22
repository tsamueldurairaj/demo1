package javaOOPSConcepts;

public class this_keyword {
	String x,y;
	
	public this_keyword(String x, String y){
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		this_keyword t1=new this_keyword("samuel", "raj");
		
		System.out.print(t1.x);
		System.out.println(t1.y);
	}
	
		
}
