package com.niit.java.basic;

import java.util.Scanner;

public class Factorial {
	 public static void main(String[] args) {
	        System.out.println("enter the number:");
	    	int n;
	    	int fact = 1;
	        int i = 1;
	        Scanner scanner = new Scanner(System.in);
	        n = scanner.nextInt();
	        while(i<=n)
	        {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Factorial of "+n+" is: "+fact);
	    }

}
