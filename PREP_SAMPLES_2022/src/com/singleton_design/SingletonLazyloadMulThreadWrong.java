package com.singleton_design;

public final class SingletonLazyloadMulThreadWrong {
	/*
	 * private: so that this should not be used out of this class
	 * static:so that static method 'getInstance()' can use this..
	 * otherwise,Error: Cannot make a static reference to the non-static field INSTANCE
	 * final: to make the reference 'INSTANCE' non-changeable...means cannot be overridden
	 * SingletonClass: return type is the class type
	 */
	private static SingletonLazyloadMulThreadWrong INSTANCE = null;
	//make constructor private so that instantiation cannot be done from outside
	private SingletonLazyloadMulThreadWrong() {
		
	}
	/*
	 * public: can be called from outside of class
	 * static: so that this method can be called without instantiating the class
	 */
	public static synchronized SingletonLazyloadMulThreadWrong getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonLazyloadMulThreadWrong();
		}
		return INSTANCE;
	}
	public void Log() {
		System.out.println("logging error");
	}
}
