package javaOOPSConcepts;

import java.util.Scanner;

public class ReverseString {

	static String str;
	static int len;
	static String reverse;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Scanner sca = new Scanner(System.in);
     System.out.print("Enter the Value:");
     str=sca.nextLine();
     System.out.println("Value Entered:" +str);
     
	 /*String buff = new StringBuffer(str).reverse().toString();	
	 System.out.println("Reverse Value: " +buff);*/
          
    len = str.length();
     
     for(int length = len; length>= 0; length--){
    	 reverse = reverse+str.charAt(len);
     }
     System.out.println(reverse);
	}
	
    
}
