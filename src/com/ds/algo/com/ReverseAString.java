package com.ds.algo.com;

public class ReverseAString {
	
	
	public static void main(String[] args) {
		
		String reversedString = reversedString("alexa");
		System.out.println(reversedString);
		
	}
	
	public static String reversedString(String source) {
		
		String reverse = "" ;
		
		for(int i = source.length()-1; i>-1; i--) {
			reverse = reverse+ source.charAt(i);
		}
		
		return reverse;
		
	}

}
