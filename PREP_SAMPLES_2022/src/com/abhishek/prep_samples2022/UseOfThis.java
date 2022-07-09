package com.abhishek.prep_samples2022;

public class UseOfThis {
	int a;
	int b;
	UseOfThis(){
		a = 10;
		b = 20;
	}
	void displayValues(UseOfThis obj){
		System.out.printf("value of a is %d and b is %d",a,b);
		System.out.printf("value of a is %d and b is %d",obj.a,obj.b);
	}
	void get() {
		displayValues(this);
	}
	public static void main(String args[]) {
		UseOfThis uot = new UseOfThis();
		uot.get();
	}
}
