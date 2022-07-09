package com.singleton_design;

public final class SingletonLazyloadMulThreadRight {
	/*
	 * private: so that this should not be used out of this class
	 * static:so that static method 'getInstance()' can use this..
	 * otherwise,Error: Cannot make a static reference to the non-static field INSTANCE
	 * final: to make the reference 'INSTANCE' non-changeable...means cannot be overridden
	 * SingletonClass: return type is the class type
	 */
	private static volatile SingletonLazyloadMulThreadRight INSTANCE = null;
	//make constructor private so that instantiation cannot be done from outside
	private SingletonLazyloadMulThreadRight() {
		
	}
	/*
	 * public: can be called from outside of class
	 * static: so that this method can be called without instantiating the class
	 */
	public static synchronized SingletonLazyloadMulThreadRight getInstance() {
		if(INSTANCE == null) {
			synchronized (SingletonLazyloadMulThreadRight.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonLazyloadMulThreadRight();
				}
			}
		}
		return INSTANCE;
	}
	public void Log() {
		System.out.println("logging error");
	}
}
