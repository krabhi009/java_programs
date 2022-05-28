package com.factorydesign.parsesourcecode;

public class MAIN {
	public static void main(String args[]) {
		//to create an object, we need to call 'createobject' method of class 'Parsefactory'
		//and for that we need instance of ParseFactory class
		ParserFactory pf = new ParserFactory();
		//now using instance 'pf' call 'createobject' method and store this into refernce of interface
		//which is implemented by sunclasses
		//also pass the type of object you want to create
		Parser parser = pf.creatObject("DCLS");
		parser.parseSourceCode();
	}
}
