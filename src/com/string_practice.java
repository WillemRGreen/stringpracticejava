package com;

public class string_practice {
	
	public static String firstString = "yesterday it was raining";
	public static String secondString = "today it is sunny";
	
	public static void main(String[] args) {
		// System.out.println(secondString.toUpperCase()+", "+firstString.toUpperCase());
		
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";

		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);
		
		
	}

}
