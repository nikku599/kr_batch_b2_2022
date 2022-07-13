package com.b.collections.set;
import java.util.*;
public class A_HelloSet {

	public static void main(String[] args) {
		//read a file and print all "unique" words from that file
		
		//Set: HashSet, LinkedHashSet, TreeSet
		
		Set<String> set=new LinkedHashSet<>();
		//HashSet: neighter sorted and ordered 
		//LinkedHashSet: not sorted but ordered
		//TreeSet: is sorted
		
		set.add("foo");
		set.add("bar");
		set.add("foo");
		set.add("uma");
		set.add("ravi");
		System.out.println(set);
		
	}
}
