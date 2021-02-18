package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> languages = new HashMap<>();
		languages.put(1,"Java");
		languages.put(1,"Phython");
		languages.put(1,"JavaScript");
		System.out.println("HashMap:"+ languages);
		
		//get() method to get value
		String value = languages.get(1);
		System.out.println("Value at index 1 :"+ value);
		System.out.println("Value at index 1 :"+ languages.get(3));
		
		//return set view of keys
		System.out.println("keys:" +languages.keySet());
		// return set view of values
		System.out.println("Values:" + languages.values());

       //return set view of key/value pairs
		System.out.println("key/Value mappings:" + languages.entrySet());
		
		languages.replace(2, "C++");
		
		//iterate through keys only
		System.out.println("keys: ");
		for(Integer key : languages.keySet()) {
			System.out.print(key +" - "+ languages.get(key));
			System.out.println(", ");
		}
		
		 // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }

		
	}

}
