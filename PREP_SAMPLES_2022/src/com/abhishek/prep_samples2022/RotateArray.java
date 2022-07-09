package com.abhishek.prep_samples2022;

import java.util.Arrays;

public class RotateArray {
	static void rotateArr(int arr[], int d, int n) {
//	        int j,a=0;
//	        for(int i=0;i<d;i++){
//	        	a = arr[0];
//	           for(j=0; j<n-1;j++){
//	               arr[j] = arr[j+1];
//	           }
//	           arr[j] = a;
//	        }
		int a[] = Arrays.copyOfRange(arr, 0, d);
		System.out.println("a: " + a.toString());
		int b[] = Arrays.copyOfRange(arr, d, n);
		System.out.println("b: " + b.toString());
		int a1 = a.length;
		int b1 = b.length;
		System.arraycopy(b, 0, arr, 0, b1);
		System.out.println("arr after first copy: " + arr.toString());
		System.arraycopy(a, 0, arr, b1, a1);
		System.out.println("arr after second copy: " + arr.toString());
	}

	static void rotateArrayUsingGCD(int arr[], int d, int n) {
		// find gcd of d and n
		d = d%n;
        int gcd = n%d;
        int j=0;
        for(int i=0;i<gcd;i++){
            j=i;
            while(i<n){
                int temp = arr[i];
                arr[i] = arr[i+d];
                arr[i+d] = temp;
                i=i+d;
            }
            i=j;
        }
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		//rotateArr(arr, 2, 5);
		rotateArrayUsingGCD(arr, 2, 5);
	}
	
}
