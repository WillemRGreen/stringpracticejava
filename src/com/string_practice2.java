package com;

public class string_practice2 {

	public static String str1 = "this is my example string";

	public static void main(String[] args) {

		System.out.println(countWords(str1));
		
		//verticalString(str1);
		
		//reverseVerticalString(str1);
		
		

	}

	public static int countWords(String str) {

		int wordCount = 0;

		for (int i = 0; i < str.length(); i++) {
				wordCount += str.substring(i, i+1).equals("\s") ? 1 : 0 ;
			
		}
		wordCount += wordCount > 0 ? 1 : 0; 
		
		return wordCount;
	}
	
	public static void verticalString(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public static void reverseVerticalString(String str) {
		
		for(int i = str.length()-1; i > -1; i--) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public static void findString(String str) {
		
		
		
	}
		
	}
