package com.Collections_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList data = new ArrayList<>();
		data.add("Mohammad");
		data.add(10);
		data.add(10.00);
		
		Object n = (int) data.get(1);
		System.out.println(n +"and"+ data.get(2));

		int n1 = (int) data.get(1);
		double n2 = (double) data.get(2);
		int n3 = (int) n2;
		int res = n1+n3;
		System.out.println(res);
		
		System.out.println("\nArrayList.....\n");
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("mohammad");
		words.add("surayj");
		words.add("yaseen");
		words.add("Sulaiman");
		System.out.println(words.get(1));
		for(String wrd : words){
			System.out.println(wrd);
		}
		
		System.out.println("\nLinkedList.....\n");
		
		LinkedList<Integer> no = new LinkedList<>();
		no.add(10);
		no.add(50);
		no.add(30);
		no.add(50);
		//no.remove(1);
		for(int num : no){
			System.out.println(num);
		}
		
		System.out.println("\nHashSet.....\n");
		
		HashSet<Integer> no1 = new HashSet<>();
		no1.add(10);
		no1.add(30);
		no1.add(50);
		no1.add(30);
		no1.add(30);
		for(int num : no1){
			System.out.println(num);
		}
		
		System.out.println("\nLinkedHashSet.....\n");
		
		LinkedHashSet<Integer> no11 = new LinkedHashSet<>();
		no11.add(10);
		no11.add(30);
		no11.add(20);
		no11.add(30);
		no11.add(30);
		for(int num : no11){
			System.out.println(num);
		}
		
		System.out.println("\nMerging Lists.....\n");
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ArrayList<Integer> newlist = new ArrayList<>();
		newlist.add(10);
		newlist.add(20);
		newlist.add(30);
		newlist.add(60);
		newlist.add(70);
		
		list.addAll(newlist);
		System.out.println(list);
		list.removeAll(newlist);
		System.out.println(list);
		
		System.out.println("Collection Methods.........\n");
		
		HashSet<Integer> list1 = new HashSet<>();
		list1.add(10);
		list1.add(60);
		list1.add(70);
		list1.add(20);
		list1.add(50);
		list1.add(30);
		list1.add(40);
		
		ArrayList<Integer> lists = new ArrayList<>(list1) ;
		Collections.sort(lists);
		System.out.println(lists);
		
		System.out.println("HashMap.......\n");
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("mohammad",24);
		map.put("Surayj",23);
		map.put("Yaseen",22);
		map.put("Sulaiman",25);
		
		System.out.println(map);
		for(String num : map.keySet()){
			System.out.println(num);
		}
		for(Integer word : map.values()){
			System.out.println(word);
		}
		
		HashMap<String,String> maps = new HashMap<>();
		maps.put("m", "mohammad");
		maps.put("s", "Surayj");
		maps.put("y", "Yaseen");
		maps.put("su", "Sulaiman");
		for(String word : maps.keySet()){
			System.out.println(maps.get(word));
		}
		
		System.out.println("\n LinkedHashMap.............\n");
		
		LinkedHashMap<String,String> map1 = new LinkedHashMap<>();
		map1.put("m", "mohammad");
		map1.put("s", "Surayj");
		map1.put("y", "Yaseen");
		map1.put("su", "Sulaiman");
		map1.put("m", "mohammad shaik");
		for(String word : map1.keySet()){
			System.out.println(map1.get(word));
		}
		for(Map.Entry<String,String> words1 : map1.entrySet()){
			System.out.println(words1.getKey());
			System.out.println(words1.getValue());
		}
		
		
		System.out.println("\n TreeMap.........\n");
		
		TreeMap<String,String> tree = new TreeMap<>();
		tree.put("m", "mohammad");
		tree.put("s", "Surayj");
		tree.put("y", "Yaseen");
		tree.put("su", "Sulaiman");
		tree.put("k", "Khadar");
		tree.put("m", "mohammad shaik");
		
		for(String word : tree.keySet()){
			System.out.println(tree.get(word));
		}
	}

}

/*
 	*ArrayList is a collection of elements not having fixed size and 
 	is a combination of different data types.
 	*ArrayList<> : Here the specific data type can be used inside brackets.
 	*Whatever the elements obtained through the index are only object types and here we need to type cast to a particular data type
 	
 	*linkedList is similar to ArrayList but uses linking concept i.e links the next node
 	*LinkedList is slower in retrieval and faster in manipulation where as ArrayList is vice-versa
 	
 	*HashSet is a collection of unique elements
 	But it retrieves elements not in particular sequence.So overcome we use LinkedHashSet
 	
 	*LinkedHashSet is a collection of unique elements but retrieve elements in a serial insert order
 
 	*We can merge 2 lists using methods like addAll,removeAll,empty,clear,retainAll etc..
 
 	Note:The method sort(List<T>) in the type Collections is not applicable for the arguments (HashSet<Integer>)
 	Converting one collection into another collection
 	
 	*HashMap is like collection of key,value pairs.But there is no ordering in keys or values
 	
 	*LinkedHashMap is similar to HashMap but generates orders in sequential manner 
 
 	*TreeMap is similar to HashMap, but it is ordered by key.
 
 */	 
