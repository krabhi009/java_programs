package com.builder_design;

public class Director {
	private IF_SourceCodeBuilder sourcecodebuilder;
	public Director(IF_SourceCodeBuilder sourcecodebuildertype) {
		this.sourcecodebuilder = sourcecodebuildertype;
	}
	public void buildSourceCode() {
		this.sourcecodebuilder.setViewAnnotation();
		this.sourcecodebuilder.setViewParam();
		this.sourcecodebuilder.setFieldNames();
		this.sourcecodebuilder.setFieldParams();
	}
	
	public SourceCode getSourceCode() {
		return this.sourcecodebuilder.getSourceCode();
	}
	
}
