package com.valuemomentum.training.collections;
import java.util.*;

public class Student implements
//Comparable<Student>
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int i){
		this.rollno=rollno;
		this.name =name;
		this.age  = i;
	}
	
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}

}
