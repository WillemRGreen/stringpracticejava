package com;

public class string_practice2 {

	public static String str1 = "this is my example string";

	public static void main(String[] args) {

		//System.out.println(countWords(str1));

		// verticalString(str1);

		// reverseVerticalString(str1);
		
		System.out.println(findString(str1, "example"));

	}

	public static int countWords(String str) {

		int wordCount = 0;

		for (int i = 0; i < str.length(); i++) {
			wordCount += str.substring(i, i + 1).equals("\s") ? 1 : 0;

		}
		wordCount += wordCount > 0 ? 1 : 0;

		return wordCount;
	}

	public static void verticalString(String str) {
		String words = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals("\s")) {
				words += "\n";
			} else {
				words += str.substring(i, i+1);
			}
		}
		
		System.out.println(words);

	}

	public static void reverseVerticalString(String str) {

		String words = "";
		
		for(int i = 0; i < str.length(); i++) {
			
		}

	}

	public static boolean findString(String str1, String searchTerm) {
		
		String startTrigger = searchTerm.substring(0, 1);
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.substring(i, i + 1).equals(startTrigger)) {
				if(str1.substring(i, i + searchTerm.length()).equals(searchTerm)) {
					return true;
				}
			}
		}
		
		return false;

	}

}
