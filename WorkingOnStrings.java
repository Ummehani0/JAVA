package com.string.demo;

public class WorkingOnStrings {


	public static void main(String[] args) {
		
		String Str1 = "UmmeHani";
		System.out.println(Str1);

		String Str2 = "mobile laptop";
		System.out.println(Str2);

		Str2 = Str2.toUpperCase();
		System.out.println(Str2);
	
		Str1 = Str1.toLowerCase();
		System.out.println(Str1);

		Str1 = Str1.concat(" Rafeeq Ahmed");
		System.out.println(Str1);

		Str1 += " Mysore";
		
		System.out.println(Str1);
		System.out.println(Str1.substring(7));

		System.out.println(Str1.substring(7, 12));

		String []values = Str2.split(" ");
		
		System.out.println("Splitted strings are :");
		
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println(Str2.charAt(3));
		
	}

}
