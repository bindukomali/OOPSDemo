package com.valuemomentum.training.inputoutput;

import java.io.ObjectOutputStream;
import java.io.*;

public class Persist {

	public static void main(String[] args) throws Exception{
		Student s1 = new Student(101,"Raj");
		
		FileOutputStream fout=new FileOutputStream("c:/abc/txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");

	}

}
