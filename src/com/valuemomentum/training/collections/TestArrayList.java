package com.valuemomentum.training.collections;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();//creating arraylist
		
		al.add("Jim");  //adding object in too arraylist
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		//transvering elements using Iterator
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(al.get(1));
				al.add(3,"Raj");   // adding element in specified index
				al.remove(0);    // delete the content
				al.set(1, "Java");    //replace existing content
				
    System.out.println("***** Display using fFor each Loop");
    for(String i:al)   // for each loop
{
	System.out.println(i);
}
	}

}
