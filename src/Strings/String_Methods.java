package Strings;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {

		//String s="welcome";
		//String s= new String("welcome");
		//System.out.println("s");
		
		
	//Methods of Strings
		
		//1)length() - returns length of a String(No of characters)
		String s="welcome";
		//s.length();
		System.out.println(s.length()); //7
		System.out.println("welcome".length());
		
		
		//2)concat() - used for jointing Strings
		String s1="welcome";
		String s2="to java";
		String s3="Automation";
		
		System.out.println(s1+s2); //welcometo java
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1+s2+s3); //welcometo javaAutomation
		System.out.println(s1.concat(s2.concat(s3))); //welcometo javaAutomation
		System.out.println(s1.concat(s2+s3)); ////welcometo javaAutomation
		
		System.out.println("welcome"+"to java"); //welcometo java
		System.out.println("welcome".concat("to java"));
		
		//3)trim() - It will remove the spaces from left and right side of string
		s="   welcome   ";
		System.out.println(s.trim()); //welcome
		System.out.println("Before trimming:"+s.length()); //Before trimming:13
		System.out.println(s.trim()); //welcome
		System.out.println("After trimming:"+s.trim().length()); //After trimming:7
		
		//4)charAt() - returns a character from a string based on index(starts from 0  =n-1)
		//index starts from 0
		s="welcome";
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //w
		
		//5)contains() - check particular string is a part of main string or not
		//returns true/false
		s="welcome";
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("Wel")); //false bcoz W is uppercase and in main string its lowercase
		System.out.println(s.contains("COME")); //false
		System.out.println(s.contains("welme")); //false bcoz sequence is not matching
		
		//6)equals() and equalIgnoreCase() - Used for comparing Strings
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("Welcome")); //false
		System.out.println(s1.equalsIgnoreCase("WelCOME")); //equalIgoreCase will not consider case sensitivity
		
		//7)replace() - replace single/multiple(sequence) of character in a string
		s="welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X')); //wXlcomX to sXlXnium java sXlXnium python sXlXnium c#
		System.out.println(s.replace("selenium", "playwright")); //welcome to playwright java playwright python playwright c#
		
		//8)substring() - extract substring from the main string based on index we passed
		//starting index - 0
		//ending index - 1
		s="Selenium";
		System.out.println(s.substring(1,5)); //elen
		System.out.println(s.substring(0,3)); //sel
		
		//9)toUpperCase() and toLowerCase()
		s="welcome";
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
		
		//10)split() - split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		System.out.println(Arrays.toString(a)); //[abc, gmail.com]
		
		//ex1
	    String amount="$15,20,55";    //exp  152055
	    
	    System.out.println(amount.replace("$","")); //15,20,55
	    System.out.println(amount.replace("$", "").replace(",", "")); //152055
	    
	    //ex2
	    s="abc,123@xyz";
	    String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1));
		
		//String arr2=arr1[1].split("@");
		
		
		
		
		
		
	
		
	}

}
