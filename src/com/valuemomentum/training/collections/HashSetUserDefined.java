package com.valuemomentum.training.collections;
import java.util.HashSet;


import java.util.Set;

public class HashSetUserDefined 
{

 

    public static void main(String[] args) 
    {
        Set<Employee> empset= new HashSet<Employee>();//employee - user defined object/type
        Employee e1 = new Employee(100,"John",5000);
        Employee e2 = new Employee(101,"Mike",7000);
        Employee e3 = new Employee(102,"Ral",7000);
        Employee e4 = new Employee(103,"John",5000);
        
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
        
        for(Employee e:empset)
        {
            System.out.println(e.id+" "+e.name+" "+e.sal);
        }
        

 

    }

 

}
 

		 

		
		 
