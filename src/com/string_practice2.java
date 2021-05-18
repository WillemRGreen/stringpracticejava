package com;

public class string_practice2 {

	public static String str1 = "this is my example string";

	public static void main(String[] args) {

		//countWords(str1);
		
		//verticalString(str1);
		
		reverseVerticalString(str1);

	}

	public static void countWords(String s) {

		int wordCount = 0;

		boolean word = false;
		int endOfLine = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
				word = true;
			} else if (!Character.isLetter(s.charAt(i)) && word) {
				wordCount++;
				word = false;
			} else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
				wordCount++;
			}
		}
		System.out.println(wordCount);
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

}
