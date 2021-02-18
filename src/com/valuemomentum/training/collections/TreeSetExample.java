package com.valuemomentum.training.collections;
import java.util.TreeSet;

class TreeSetExample
{
    public static void main(String arg[])
    {
        TreeSet<Integer> input = new TreeSet<Integer>(); // LINE A
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(7);
        input.add(8);
        input.add(10);
       // input.add(4);
        System.out.println(input); // LINE B
        System.out.println("First Element in Set : " + input.first()); // LINE C
        System.out.println("Last Element in Set : " + input.last()); // LINE D
        System.out.println("Element higher to 4 : " + input.higher(4)); // LINE E
        //higher returns the next higher number to the given number
        System.out.println("Element lower to 3 : " + input.lower(3));
        //lower returns the next lower number to the given number    

         System.out.println("Using ceiling: " + input.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + input.floor(4));
    }
}
	
	
		