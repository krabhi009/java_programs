package com.abhishek.prep_samples2022;

public class CheckStaticKeyword {
	public static void main(String a[]) {
	//showFirstName(); //Cannot make a static reference to the non-static method showFirstName() from the type CheckStaticKeyword
		CheckStaticKeyword ref = new CheckStaticKeyword();
		ref.showFirstName();
		showLastName();
	}
	
	void showFirstName() {
		System.out.print("Abhishek");
	}
	
	static void showLastName() {
		System.out.println("Kumar");
	}

}
