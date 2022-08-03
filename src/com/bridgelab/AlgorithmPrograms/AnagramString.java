package com.bridgelab.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {		
	      String my_string_1, my_string_2;
	      Scanner sc = new Scanner(System.in);	     
	      System.out.print("Enter the first string : ");
	      my_string_1 = sc.nextLine();
	      System.out.print("Enter the second string : ");
	      my_string_2 = sc.nextLine();
	      my_string_1 = my_string_1.toLowerCase();  //converting both strings to lower case function
	      my_string_2 = my_string_2.toLowerCase();  
	      if(my_string_1.length() == my_string_2.length()) {  // checking length of two strings
	         char[] my_array_1 = my_string_1.toCharArray();  // char array used to sort strings
	         char[] my_array_2 = my_string_2.toCharArray();
	         Arrays.sort(my_array_1);   
	         Arrays.sort(my_array_2);
	         boolean my_result = Arrays.equals(my_array_1, my_array_2);  //using equal function checking that strings are equal or not
	         if(my_result) {
	            System.out.println("The Strings "+my_string_1 + " And " + my_string_2 + " Are Anagram.");  // result display
	         } else {
	            System.out.println("The Strings "+my_string_1 + " And " + my_string_2 + " Are Not Anagram.");  
	         }
	      } 
	}

}
