package com.valuemomentum.training.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		String languages[]  = {"C", " C++", "Java", "Perl" , "Phython"};
		try {
			for(int c = 1; c <=5 ; c++) {
				System.out.println(languages[c]);
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		    System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
