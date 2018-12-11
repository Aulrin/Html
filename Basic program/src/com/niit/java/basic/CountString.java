package com.niit.java.basic;

import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		String s;
		System.out.println("Enter The String:");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++)
		{							
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
		 	}
		}
		System.out.println("Number of words in a string = " + count);
	
	}
}
