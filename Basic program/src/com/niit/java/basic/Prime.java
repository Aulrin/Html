package com.niit.java.basic;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		int i;
		int n;
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		n=scan.nextInt();
		for(i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("this is prime");
		}
		else {
			System.out.println("this is not prime");
		}
	}
}

