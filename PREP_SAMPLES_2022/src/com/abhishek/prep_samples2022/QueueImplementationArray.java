package com.abhishek.prep_samples2022;

public class QueueImplementationArray {
	int capacity = 16;
	QueueImplementationArray(int capacity){
		System.out.println("value of capacity: "+capacity);
		System.out.println("value of passed capacity is: "+this.capacity);
		System.out.println("value of this is: "+this.getClass());
		System.out.println("min value of integer: "+Integer.MIN_VALUE);
		System.out.println("max value of integer: "+Integer.MAX_VALUE);
	}
	public static void main(String args[]) {
		QueueImplementationArray qia = new QueueImplementationArray(10);
	}
}
