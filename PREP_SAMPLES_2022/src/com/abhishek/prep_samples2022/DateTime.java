package com.abhishek.prep_samples2022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTime {
	/*
	 * public static void main(String srgs[]) { LocalDate today = LocalDate.now();
	 * System.out.println(today); LocalDateTime time = LocalDateTime.now();
	 * System.out.println(time); DateTimeFormatter format1 =
	 * DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 * System.out.println(today.format(format1));
	 * 
	 * 
	 * }
	 */
	public static void removeFirstElement(int[] arr) {
        //int newArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        //return newArr;
    }
 
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
         
        removeFirstElement(arr);
 
        System.out.println("Original  : " + Arrays.toString(arr));
        //System.out.println("New Array : " + Arrays.toString(newArr));
    }
}
