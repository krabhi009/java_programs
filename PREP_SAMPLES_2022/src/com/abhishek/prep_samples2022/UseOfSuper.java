package com.abhishek.prep_samples2022;

public class UseOfSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsPerson sp = new Cricketer();
		sp.ability();
    	System.out.println(sp.team);	
		sp.jersey();
		Footballer fb = new Footballer();
		fb.skill();
		System.out.println(fb.team);
		fb.ability();
		fb.jersey();
	}

}
class SportsPerson{
	String team = "indian";
	void ability() {
		System.out.println("strength");
	}
	void jersey() {
		System.out.println("white");
	}
}
class Cricketer extends SportsPerson{
	void skill() {
		System.out.println("hit and run");
	}
	void jersey() {
		System.out.println("blue");
	}
}
class Footballer extends SportsPerson{
	void skill() {
		System.out.println("pass and kick");
	}
	void jersey() {
		System.out.println("RED");
		System.out.println("i belong to : "+super.team);
	}
}
