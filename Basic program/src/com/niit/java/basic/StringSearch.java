package com.niit.java.basic;

import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) {
	/*Inputting the sentence*/
    Scanner scn = new Scanner(System.in);

    System.out.println("Input the sentence");
    String s = scn.nextLine();
    String[] lstarr = s.split(" ");

    /*Inputting the string*/
    Scanner scn2 = new Scanner(System.in);

    System.out.println("Input the word to be searched");
    String s2 = scn.nextLine();
    String[] explst = s2.split(" ");

    /*searching the input word */
    if(s.contains(s2)){    
       
        System.out.println("Input word is present : " + s2);
    }

    else{

        System.out.println("String " + s2 + "is not present");
    }

	}
}
