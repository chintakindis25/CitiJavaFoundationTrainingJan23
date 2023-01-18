package com.citibank.main.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Start");
		System.out.println("1. ArrayList ------------------------------------------------");
		
		List<String> nameList = new ArrayList<String>();
//		List<Integer> nameList = new ArrayList<Integer>();
		System.out.println("nameList Size in beginning: " +nameList.size());
		System.out.println("nameList                  : " +nameList);
		
		nameList.add("Shweta");
		nameList.add("Pravin");
		nameList.add("Renu");
		nameList.add("Aniket");
		nameList.add("Renu");
		nameList.add(null);
		
//		nameList.add(4);
//		nameList.add(4);
//		nameList.add(4);
//		nameList.add(4);
//		nameList.add(4);
//		
		System.out.println("nameList Size             : " +nameList.size());
		System.out.println("nameList                  : " +nameList);
		System.out.println("Name at index 2           : " +nameList.get(2));

		nameList.remove("Renu");
		System.out.println("nameList Size after removing 3rd element: " +nameList.size());
		System.out.println("nameList                  : " +nameList);
		
		System.out.println("2. Hashset -----------------------------------------------------");
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("numberSet Size in beginning: " +numberSet.size());
		System.out.println("numberSet                  : " +numberSet);
		

		System.out.println(numberSet.isEmpty());
		numberSet.add(10);
		numberSet.add(9);
		numberSet.add(8);
		numberSet.add(100);
		numberSet.add(3);
		numberSet.add(6);
		numberSet.add(null);
		System.out.println(numberSet.getClass());
		System.out.println(numberSet.isEmpty());
		

		System.out.println("numberSet Size             : " +numberSet.size());
		System.out.println("numberSet                  : " +numberSet);
	
		System.out.println("2. TreeSet -----------------------------------------------------");
		Set<String> nameTreeSet = new TreeSet<String>();
		System.out.println("nameTreeSet Size in beginning: " +nameTreeSet.size());
		System.out.println("nameTreeSet                  : " +nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("C");
		nameTreeSet.add("A");
		nameTreeSet.add("D");
		nameTreeSet.add("R");
		nameTreeSet.add("U");
				
		System.out.println("numberSet Size             : " +nameTreeSet.size());
		System.out.println("numberSet                  : " +nameTreeSet);
	

		System.out.println("Main End");
	}

}
