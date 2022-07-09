package com.abhishek.prep_samples2022;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(35);
		al.add(54);
		al.add(51);
		al.add(75);
		System.out.println(al);
		al.remove(2);
		System.out.println("after removing second element: "+al);
		Iterator<Integer> itr = al.iterator();
		for(int i=0;itr.hasNext();i++) {
			System.out.println(itr.next());
		}
		
	}

}
