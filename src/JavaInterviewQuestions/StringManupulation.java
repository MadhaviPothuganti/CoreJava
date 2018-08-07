package JavaInterviewQuestions;

public class StringManupulation {

	public static void main(String[] args) {
		String str = "The rains have started here selenium";
		String str1= "The rains Have started here selenium";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));//1st occurrence of s at 8th 
		//2nd occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//('s',9th position)
		//System.out.println(str.indexOf('s', 1 + str.indexOf('s', 1 + str.indexOf('s'))));﻿
		System.out.println(str.indexOf("have"));
		//String doesn't exist, it will return -1. No Error
		System.out.println(str.indexOf("hello"));
		
		//String Comparison
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//Substring
		System.out.println(str.substring(0, 9));
		
		//trim: it will remove white spaces from begning and end of string not between
		String s = "  Hello World";
		System.out.println(s.trim());
		
		//remove space between Hello and World
		System.out.println(s.replace(" ", ""));
		String date = "01-01-2017"; //01/01/2017
		System.out.println(date.replace("-", "/"));
		
		//split:
		String test = "Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for(int i =0;i<testval.length;i++) {
			System.out.println(testval[i]);
			
		//concatenation	(string can concatenated with any value(double, float)
			String s2 ="cares";
			System.out.println(s2.concat("s"));//caress
			
			String x = "Hello";
			String y = "World";
			int a = 100;
			int b = 200;
			
			System.out.println(x+y);
			System.out.println(a+b); //300
			System.out.println(x+y+a+b);//HelloWorld100200
			System.out.println(a+b+x+y);//300HelloWorld	
			System.out.println(x+y+(a+b));//HelloWorld300	
		}
			
	}

}
