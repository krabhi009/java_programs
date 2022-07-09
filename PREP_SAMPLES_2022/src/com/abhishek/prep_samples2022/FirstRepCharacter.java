package com.abhishek.prep_samples2022;
// checks for the first repeated character in the string
//return the first repeated char otherwise return -1

import java.util.Scanner;
import java.util.Scanner;

public class FirstRepCharacter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkRepChar(s));	
	}
	
	public static String checkRepChar(String s) {
		String[] sArr = s.split("");
		int len = sArr.length,
		      x = 0,
		      pos = len;
		String sResult = "";
		for(int i=x;i<len;i++) {
			for(int j=x+1;j<len;j++) {
				if(sArr[i].equals(sArr[j])) {
					if(j<pos) {
					 sResult = sArr[i];
				     pos = j;
					}
				}
			}
			x++;
		}
		if(sResult.isEmpty())
		 return "-1";
		else
	     return sResult;
	}

}
