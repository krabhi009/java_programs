package com.abhishek.prep_samples2022;

public class StackImplementationUsingArray {
	static final int Max = 10;
	int top = -1;
	int stack[] = new int[Max];
	
	public static void main(String args[]) {
		StackImplementationUsingArray si = new StackImplementationUsingArray();
		si.push(3);
		si.push(6);
		si.push(15);
		int pp = si.pop(si);
		System.out.println("popped out element is: "+pp);
		si.push(19);
		si.printArraybyPoppingOut();
	}
	boolean isEmpty() {
		return (top < 0);
	}
	int pop(StackImplementationUsingArray si) {
		if(si.isEmpty()) {
			System.out.println("Stack overflow");
			return 0;
		}else {
			return stack[top--];
		}
	}
	void push(int x) {
		if(top == Max-1) {
			System.out.println("Stack overflow");
		}else {
			stack[++top] = x;
		}
	}
	int size() {
		return top;
	}
	void printArraybyPoppingOut() {
		for(int i=top;i>=0;i--) {
			System.out.println("element at pos: "+i+" is "+stack[i]);
		}
	}
}
