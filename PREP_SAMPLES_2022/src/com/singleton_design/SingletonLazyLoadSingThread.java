package com.singleton_design;

public final class SingletonLazyLoadSingThread {
	/*
	 * private: so that this should not be used out of this class
	 * static:so that static method 'getInstance()' can use this..
	 * otherwise,Error: Cannot make a static reference to the non-static field INSTANCE
	 * final: to make the reference 'INSTANCE' non-changeable...means cannot be overridden
	 * SingletonClass: return type is the class type
	 */
	private static SingletonLazyLoadSingThread INSTANCE = null;
	//make constructor private so that instantiation cannot be done from outside
	private SingletonLazyLoadSingThread() {
		
	}
	/*
	 * public: can be called from outside of class
	 * static: so that this method can be called without instantiating the class
	 */
	public static SingletonLazyLoadSingThread getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonLazyLoadSingThread();
		}
		return INSTANCE;
	}
	public void Log() {
		System.out.println("logging error");
	}
}
