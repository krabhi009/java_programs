package com.singleton_design;

public final class SingletonClass {
	/*
	 * private: so that this should not be used out of this class
	 * static:so that static method 'getInstance()' can use this..
	 * otherwise,Error: Cannot make a static reference to the non-static field INSTANCE
	 * final: to make the reference 'INSTANCE' non-changeable...means cannot be overridden
	 * SingletonClass: return type is the class type
	 */
	private static final SingletonClass INSTANCE = new SingletonClass();
	//make constructor private so that instantiation cannot be done from outside
	private SingletonClass() {
	}
	/*
	 * public: can be called from outside of class
	 * static: so that this method can be called without instantiating the class
	 */
	public static final SingletonClass getInstance() {
		return INSTANCE;
	}
	public void Log() {
		System.out.println("logging error");
	}
}
