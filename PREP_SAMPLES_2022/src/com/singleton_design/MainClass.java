package com.singleton_design;

public class MainClass {
	public static void main(String srags[]) {
		//try to create an object of singleton class
		//SingletonLazyLoadSingThread obj = new SingletonLazyLoadSingThread();
		//above statement throws error as class constructor is private
		//so there is just one way to create object of that class
		SingletonLazyLoadSingThread obj = SingletonLazyLoadSingThread.getInstance();
		obj.Log();
	}
}
