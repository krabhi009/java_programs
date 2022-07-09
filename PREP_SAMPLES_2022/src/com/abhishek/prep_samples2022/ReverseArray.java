package com.abhishek.prep_samples2022;

import java.util.Arrays;

public class ReverseArray {
	/*
	 * reverse array using new array reverse array using swapping
	 * reverseArrUsingSwap reverse array using String builder reverse array using
	 * Collection.reverse();
	 */
	private static int[] reverseArrUsingSwap(int a1[], int n) {
		int c;
		for (int i = 0; i < a1.length / 2; i++) {
			c = a1[i];
			a1[i] = a1[a1.length - 1 - i];
			a1[a1.length - 1 - i] = c;
		}
		return a1;
	}

	private static int[] reverseArrUsingNewArr(int a[], int n) {
		int b[] = new int[n];
		
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];
		}
		return b;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5, 8 };
		int revSwap[] = new int[a.length];
		int revNewArr[] = new int[a.length];
		System.out.println("Original array is: ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		revSwap = reverseArrUsingSwap(a, a.length);
		System.out.println("Reversed array using swap is: ");
		for (int j = 0; j < revSwap.length; j++) {
			System.out.println(revSwap[j]);
		}

		System.out.println("Original array is: ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		System.out.println("Reversed array using new array is: ");
		revNewArr = reverseArrUsingNewArr(a, a.length);
		for (int j = 0; j < revSwap.length; j++) {
			System.out.println(revNewArr[j]);
		}
		System.out.println("Original array is: ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
