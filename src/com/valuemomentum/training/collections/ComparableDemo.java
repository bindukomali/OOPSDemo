package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"John",29));
		al.add(new Student(222,"Mike",21));
		al.add(new Student(555,"Mary",26));
		
		for(Student st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age); 
		System.out.println("After Sorting");	
			Collections.sort(al);
		for(Student st:al) 
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}


