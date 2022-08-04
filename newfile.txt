package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL
{

	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("mango");
		list1.add("apple");
		list1.add("banana");
		list1.add("grapes");
		
		Collections.sort(list1);
		
		for(String fruit : list1)
		{
			System.out.println(fruit);
		}
		
		System.out.println("Sorting numbers");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(24);
		list2.add(16);
		list2.add(37);
		list2.add(84);
		
		Collections.sort(list2);
		
		for(Integer number: list2)
		{
			
			System.out.println(number);
			
			}
		

	}

}
