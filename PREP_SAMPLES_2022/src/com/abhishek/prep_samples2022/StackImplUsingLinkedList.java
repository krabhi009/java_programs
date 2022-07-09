package com.abhishek.prep_samples2022;

public class StackImplUsingLinkedList {
	static Node head;
	static Node top;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static void pushNode(int d) {
		Node newNode = new Node(d);
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}

	static int popNode() {
		int poppedElement = top.data;
		top = top.next;
		return poppedElement;
	}
	static void printStackElements() {
		Node n = top;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String a[]) {
		StackImplUsingLinkedList si = new StackImplUsingLinkedList();
		// Node head = new Node(1);
		pushNode(1);
		pushNode(8);
		pushNode(13);
		pushNode(9);
		System.out.println("print data before pop");
		printStackElements();
		popNode();
		System.out.println("print data after pop");
		printStackElements();
		pushNode(81);
		System.out.println("print data after push");
		printStackElements();
	}
}
