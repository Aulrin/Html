package com.niit.java.basic;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet {
	public static void main(String arg[])
	{
		HashSet hs=new HashSet();  //Display no order
		
		hs.add("Vinod");
		hs.add("Harish");
		hs.add("Avinash");
		hs.add("Saket");
		hs.add("Fareed");
		
		System.out.println(hs);
		
		LinkedHashSet lhs=new LinkedHashSet(); //Display in Order how it has added
		 
		lhs.add("Vinod");
		lhs.add("Harish");
		lhs.add("Avinash");
		lhs.add("Fareed");
		
		System.out.println(lhs);
		
		TreeSet ts=new TreeSet(); //Display in order in sorting
		
		ts.add("Vinod");
		ts.add("Harish");
		ts.add("Avinash");
		ts.add("Saket");
		ts.add("Fareed");
		
		System.out.println(ts);
	}

	
}
