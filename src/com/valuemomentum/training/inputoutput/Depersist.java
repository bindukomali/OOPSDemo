package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/abc/txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+" "+s.name);
		
		in.close();

	}

}
