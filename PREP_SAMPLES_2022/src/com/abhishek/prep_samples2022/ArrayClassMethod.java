package com.abhishek.prep_samples2022;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayClassMethod {
	
	public static void main(String args[]) {
		/*
		 * int[] intArray = {1,4,2,24,17,8}; long[] longArray =
		 * {6256252,652424,978968757,45161890}; char[] charArray =
		 * {'a','u','o','d','k'}; String str = "abhishek"; char[] strArray =
		 * str.toCharArray(); Arrays.sort(strArray); Arrays.sort(intArray);
		 * Arrays.sort(longArray); Arrays.sort(charArray); for(int i : intArray) {
		 * System.out.println(i); }
		 * 
		 * System.out.println(longArray); System.out.println(charArray);
		 * System.out.println(strArray); ArrayList<String> als = new
		 * ArrayList<String>(); als.add("anvi"); als.add("is"); als.add("my");
		 * als.add("sweet"); als.add("little"); als.add("daughter");
		 * System.out.println(als.toString()); als.sort(null);
		 * System.out.println(als.toString());
		 */
		
		
		String s1 = "124";
		String s2 = "29";
		char[] i1 = s1.toCharArray();
		char[] i2 = s1.toCharArray();
		int sum=0;
		for(char i : i1) {
			int k = (int)i;
			System.out.println(k);
			sum+=k;
		}
		System.out.println(sum);
	}

}
