package com.abhishek.prep_samples2022;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node ref;
		Node(int d){
			data = d;
			ref = null;
		}
	}
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		llist.head.ref = node2;
		node2.ref = node3;
//		System.out.println(llist.head.data);
//		System.out.println(llist.head.ref);
//		System.out.println(llist.head.ref.data);
		Node currNode = llist.head;
		while(currNode.ref!=null) {
			System.out.println("data is: "+currNode.data);
			System.out.println("ref is: "+currNode.ref);
			currNode = currNode.ref;
		}
		
	}
}
