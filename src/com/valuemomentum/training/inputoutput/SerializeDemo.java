package com.valuemomentum.training.inputoutput;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Micheal Khan";
		e.address = "Castle Street,Banglore";
		e.SSN = 11122333;
		e.number = 101;
		try
		{
			FileOutputStream fileOut = new FileOutputStream("c:/abc/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in c:/abc/employee.ser");
					
		}
    catch(IOException i)
		{
	i.printStackTrace();
		}
	}

}
