package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String args[]) { 

		// Writing to a file using BufferedWriter in Java 

		try { 
			//creating Writer obj in Append mode-true
		FileWriter writer = new FileWriter("d:/abc/names.txt",true); 
		BufferedWriter bwr = new BufferedWriter(writer);  

		writer.write("James"); 
		writer.write("\n"); // bwr.newLine();
		writer.write("Hobert"); 
		writer.close(); 

		System.out.println("succesfully written to a file"); } 
		catch (IOException ioe) { 
		ioe.printStackTrace(); 

		}
		 } 
		}


