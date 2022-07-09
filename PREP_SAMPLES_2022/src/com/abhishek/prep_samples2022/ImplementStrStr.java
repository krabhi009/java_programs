package com.abhishek.prep_samples2022;

import java.util.Scanner;

public class ImplementStrStr {
   public static void main(String srgs[]) {
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   String x = sc.nextLine();
	   System.out.println(RetMinIndex(s,x));
   }
   
   private static int RetMinIndex(String s, String x) {
	   char[] sArr = s.toCharArray();
	    char[] xArr = x.toCharArray();
	    char fdx = xArr[0];
	    for(int i=0;i<sArr.length;i++){
	        if(sArr[i] == fdx){
	        	int previndex = i;
	            for(int j=0;j<xArr.length;j++){
	                if(xArr[j] == sArr[i]){
	                    if(j==xArr.length-1){
	                        return i-xArr.length+1;
	                    }
	                    i++;
	                }
	            }
	            i = previndex;
	        }
	    }
	    return -1;
   }
}
