package com.abhishek.prep_samples2022;

import java.util.Arrays;
import java.util.Scanner;

public class StringClassMethodsTest {
	public static void main(String args[]) {
		String s1 = "    I love my cute little daughter";
		int lenOfS1 = s1.length();
		System.out.println("Length of string s1 is "+lenOfS1);
		s1 = s1.trim(); // removes all leading and trailing spaces
		int lenOfS1AfterTrim = s1.length();
		System.out.println("Length of string s1 after trim is "+lenOfS1AfterTrim);
		//please note s1.trim() is not enough as you need to assign this
		//variable to s1 after trimming as this generated a new string
		System.out.println("S1 after trim: "+s1.toUpperCase());
		System.out.println("Length of string s1 after trim is "+s1.length());
		String s2 = s1.concat(", Her name is Anvika");
		System.out.println("String s2: "+s2);
		s1 = s1.replace("cute", "sweet");
		System.out.println("String s1: "+s1);
		System.out.println("using toLowerCase on S1: "+s1.toLowerCase()); //result not assigned to s1
		System.out.println("using toUpperCase on S1: "+s1.toUpperCase()); //result not assigned to s1
		String[] s3 = s1.split(" ");
		System.out.println("First word of array s3 is: "+s3[0]); 
		System.out.println("Let's print string array s3 using for each loop");
		for(String str: s3) {
			System.out.println(str);
		}
		String ss = "abhishek";
		String[] ssp = ss.split("");
		int d = ssp.length;
		System.out.println("value of ssp[1] is: "+ssp[1]);
		System.out.println("value of d is"+d);
		System.out.println(s3); //you cannot print a array of strings this way, 
		                        //it prints some arbitrary characters
		System.out.println(Arrays.toString(s3)); //correct way to print a array of strings
		char s4 = s1.charAt(3);
		System.out.println("Character value at position 2 is: "+s4);
		String s5 = s1.substring(7, lenOfS1AfterTrim+1);
		System.out.println("Substring s5 is: "+s5);
		Boolean isStrPresent = s1.contains("sweet");
		System.out.println("is string 'sweet' present in s1: "+isStrPresent);
		Boolean b1 = "Java is my new love".endsWith("love");
		System.out.println("is s1 ends with 'love': "+b1);
		Boolean b2 = "Java is my new love".startsWith("love");
		System.out.println("is s1 starts with 'love': "+b2);
		int indexOfM = s1.indexOf('l');
		System.out.println("index of char 'l' is: "+indexOfM);
		int lastIndexOfL = s1.lastIndexOf('m');
		System.out.println("last index of char 'm' is: "+lastIndexOfL);
		System.out.println("abhishek kumar".equals("abhishek kumar"));
		System.out.println("Abhishek kUMAr".equals("abhISHEK KumaR"));
		System.out.println("Abhishek kUMAr".equalsIgnoreCase("abhISHEK KumaR"));
		System.out.println("addw".isEmpty());
		System.out.println("".isEmpty());
		System.out.println("aa".compareTo("ac"));
		System.out.println("a".compareToIgnoreCase("A"));
		String s6 = "ads".valueOf(false);
		System.out.println("S6 is: "+s6);
		Scanner sc = new Scanner(System.in);
		String s7 = sc.nextLine();
		System.out.println(s7.length());
	}
}
