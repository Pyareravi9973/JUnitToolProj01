package com.raj.service;

public class StringUtil {

	public boolean isPalindrome(String str) {
		
		String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equalsIgnoreCase(revStr);
	}
	
	public int getLength(String str) {
		int length = str.length();//Gives the length of the String
		return length;
	}
	
}