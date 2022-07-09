package com.abhishek.prep_samples2022;

public class LinkedListOperations {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void insertBeginning(Node newNode) {
		newNode.next = head;
		head = newNode;
	}
	void insertEnd(Node newNode) {
		Node n = head;
		if(n==null) {
			head = newNode;
		}else {
			while(n.next!=null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}
	void insertMid(Node newNode, int data) {
		Node n = head;
		while(n.data!=data && n.next!=null) {
			n= n.next;
		}
		if(n.next==null) {
			System.out.println("node not found");
		}
		Node temp = n.next;
		n.next = newNode;
		newNode.next = temp;
	}
	void printLinkedListData() {
		Node n = head;
		while(n!=null) {
			System.out.println("data is:"+n.data);
			n = n.next;
		}
	}
	public static void main(String args[]) {
		LinkedListOperations llist = new LinkedListOperations();
		llist.head = new Node(1);
		llist.head.next = new Node(2);
		llist.printLinkedListData();
		System.out.println("after insertion");
		llist.insertBeginning(new Node(17));
		System.out.println("after insertion in the beginnning: ");
	    llist.printLinkedListData();
	    llist.insertEnd(new Node(115));
	    System.out.println("after insertion in the end: ");
	    llist.printLinkedListData();
	    llist.insertMid(new Node(55), 2);
	    System.out.println("after insertion in the Mid: ");
	    llist.printLinkedListData();
	    
	}
}
