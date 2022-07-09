package com.abhishek.prep_samples2022;

public class WrapperClass {
	public static void main(String args[]) {
		int i = 10;
		Integer I1 = Integer.valueOf(i);  //this line is not required
		Integer I = i;  // this assignment will do the same as above  ******** AUTOBOXING
		System.out.println("value of a is "+i);
		System.out.println("value of i is "+I);
		System.out.println("class of i is "+I.getClass());	
		System.out.println("value of i is "+I1);
		System.out.println("class of i is "+I1.getClass());	
		
		Character C1 = new Character('c'); //this can be directly written as below statement		
		Character C2 = 'z';
		char c1 = C1;  //***************** UNBOXING
		Integer i2 = new Integer(2); //this can be directly written as below statement
		Integer I3 = 100;
		int i3 = I3;
		
		
	}
}
