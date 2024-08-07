package day5;

public class String_Manipulation {
	public static void main(String[] args) {
		String s = "Welcome";//string literal
		String x = new String("Welcome2");//through string object class
		
		
		//learn most important methods of string class
		
		//length method()-counts all characters in string and returns int data type	 
		int length = x.length();
		System.out.println("The string length is: " + length);
		System.out.println("String length is: " + s.length());
		
		
		//concat() method- join multiple strings
		String s1 = "Welcome";
		String s2 = " to Java";
		String s3 = " programming.";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim() - trims any leading and trailing spaces from a string
		s = "   welcome to Java   ";
		System.out.println(s.length());
		x=s.trim();//s.trim or store into variable
		System.out.println(x.length());
		
		
		//charAt() - returns single character out of string from specific index
		s = "Java Selenium";
		System.out.println("5th character in 'Java Selenium is: " + (s.charAt(5)));

		
		//contains() - reutruns boolean (true/false)
		//check a string is part of the main string or not
		
		System.out.println(s.contains("jav"));//false
		System.out.println(s.contains("Sel"));//true
		System.out.println(s.contains("a S"));//true
		
		//equals(), equalsIgnoreCase()- compares 2 strings and returns true/false
		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals(s2));//or can do (s1.equals("welcome")); 
		System.out.print(s1.equalsIgnoreCase(s2));
		
		
		//replace()- it replaces single character or character sequence of given string
		s = "welcome to Java Selenium automation";
		System.out.println(s);
		System.out.println("Replaced version: " + s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));
		
		
		//substring() - extracts substring from main string
		System.out.println(s.substring(11));//java selenium automation
		System.out.println(s.substring(11, 15));//java
		
		
		//toUpperCase() / toLowerCase() - converts cases
		
		s = "hello";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//split() - split or divide original string into multiple parts based on delimiter
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[0]);//will print first part of split- abc
		s = "welcome to Java Selenium automation";
		String b[]= s.split(" ");//splits where there is space
		System.out.println(b[0]);//prints welcome
		
		s = "welcome to Java Selenium automation";
		System.out.println(s.replace(" " , "_"));
		
		
		s="abc,123@m.com";
		String c[] = s.split(",");
		System.out.println(c[0]);
		
		
		
	}

}
