package com.valuemomentum.training.inputoutput;

import java.io.Serializable;

public class Employee implements Serializable
{
	public String name;
	public String address;
	public int SSN;
	public int number;
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name +" "+address);
	}
	

}
