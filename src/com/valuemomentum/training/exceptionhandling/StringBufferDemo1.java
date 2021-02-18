package com.valuemomentum.training.exceptionhandling;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("JamesGosling");
		int l=str.length();
		System.out.println("The Length of String is : "+1);    //12
		System.out.println("The Capacity of string is :"+ str.capacity()); //28-12+16
		//allocate a space for 
        System.out.println("The reversed string:"+ str.reverse());
        System.out.println("The Substring :"+str.substring(0,5));//returns string from starting intex to length-1;
	    
        str.replace(5,10,"Java");
	    System.out.println(str);
	    
	    str.delete(2,5);
	    System.out.println(str);
	    
	    System.out.println("The reversed string:" +str.reverse());
	    
	    
	}

}
