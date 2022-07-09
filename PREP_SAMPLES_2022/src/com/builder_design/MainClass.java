package com.builder_design;

public class MainClass {
	public static void main(String args[]) {
		DDLS_SourceCodeBuilder ddlsobj = new DDLS_SourceCodeBuilder();
		Director director = new Director(ddlsobj);
		
		director.buildSourceCode();
		SourceCode src = director.getSourceCode();
		System.out.println(src);
		System.out.println(src.fieldname);
	}
}
