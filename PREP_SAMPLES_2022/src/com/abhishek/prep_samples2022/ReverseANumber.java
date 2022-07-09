package com.abhishek.prep_samples2022;

import java.util.Collection;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145;
		int num1 = 812;
		//expected output : 541
	
		String s = Integer.toString(num); 
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		String s1 = Integer.toString(num1);
		StringBuilder sb1 = new StringBuilder(s1);		
		System.out.println(sb1.reverse());
		
		
	}

}
