package com.abhishek.prep_samples2022;

public class A {
  public static void main(String args[]) {
	  A1();
	  A3();
	  A5();
	 //static methods can also be accessed using class name..but if it is part of the
	 //same class, we can skip classname
	  A.A1();
	  A.A3();
	  A.A5();
	//  A2(); //cannot access a non static method from a static method
	  A refA = new A();
	  refA.A2();
	  refA.A4();
	  refA.A6();
	  B refB = new B();  //using reference, can only access public instance methods)
	  refB.B2();
	  refB.B4();
	 //Class B's public static method can be called directly using class name
	 // without creating a reference
	  B.B1();
	  B.B3();
  }
  
  public static void A1(){
	  System.out.println("I am class A-public static method");
	  A a1 = new A();
	  a1.A2();
  }
  
  public void A2() {
	  System.out.println("I am class A-public instance method");
  }
  
  protected static void A3() {
	  System.out.println("I am class A-protected static method");
  }
  
 protected void A4() {
	 System.out.println("I am class A-protected instance method");
  }
 
 private static void A5() {
	 System.out.println("I am class A-private static method");
 }
 
 private void A6() {
	 System.out.println("I am class A-private instance method");
 }
}


