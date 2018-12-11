package com.niit.java.basic;

import java.util.HashMap;
import java.util.Set;

public class overload { public static void main(String arg[])
{
	HashMap<Integer,String> mapObj=new HashMap<Integer,String>();
	
	mapObj.put(1001, "Vinod");
	mapObj.put(1002, "Sunil");
	mapObj.put(1003, "Suresh");
	mapObj.put(1004, "Fareed");
	
	//keySet() is a method which returns all the key values of map
	Set<Integer> allKeys=mapObj.keySet();
	
	for(Integer element:allKeys)
	{
		System.out.println(element+":::"+mapObj.get(element));
	}
	
	
}

}
