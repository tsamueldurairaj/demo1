package javaOOPSConcepts;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UsingSubstringMethod {
    
	public static void alphabets(){
		//Print Alphabets A to Z
		char ch;
		for(ch = 'a'; ch<='z'; ch++)
		
			System.out.println(ch);
		
	}
	
	public static void main(String[] args) throws UnknownHostException {
		
		//UsingSubstringMethod obj= new UsingSubstringMethod();
	    //UsingSubstringMethod.alphabets();
	    alphabets();
	    
	    subject.subject1();
		
		/*String str1 = "ABCDEFG";
		String str2 = str1.substring(0,2);
		String str3 = str1.substring(2);
		System.out.println(str2);
		
		String str4 = str2 + str3;
		System.out.println(str4);
		
		//Reverse String
		String reverse =" ";
		
		int len = str1.length();
		System.out.println(len);
		for(int length=len-1; length>=0; length--){
			reverse = reverse+str1.charAt(length);
		}
		System.out.println("Reverse String:" +reverse);
*/
	}



}

class subject{
	
	public static void subject1() throws UnknownHostException{
		System.out.println(InetAddress.getLocalHost());
	}
	
}
