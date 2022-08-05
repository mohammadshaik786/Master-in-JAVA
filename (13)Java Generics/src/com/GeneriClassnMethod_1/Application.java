package com.GeneriClassnMethod_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Container<Integer,String> container = new Container<Integer, String>(1, "Mohammad");
		int n = container.getItem1();
		String str = container.getItem2();
		container.printItem(n,str);
		
		//Container<String,String> container1= new Container<String, String>("Mo", "Mohammad");
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("Mohammad");
		set1.add("Surayj");
		set1.add("Yaseen");
		
		HashSet<String> set2 = new HashSet<>();
		set2.add("Sulaiman");
		set2.add("shaik");
		set2.add("Yaseen");
		
		Set<String> set = union(set1,set2);
		//System.out.println(set);
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String str1 = iter.next();
			System.out.println(str1);
		}
		
	}

	public static <E> Set<E> union(Set<E> set1,Set<E> set2){
		Set<E> resultSet = new HashSet<E>(set1);
		resultSet.addAll(set2);
		return resultSet;
		
	}

	

}


/*
 * Generic class can be defined using angle brackets<>. Generic replace these placeholders with some specific type at compile time
 	public class Container<i1,i2>
 * In Generic methods ,we define Generic before Collections
	public static <E> Set<E> union(Set<E> set1,Set<E> set2)
*/