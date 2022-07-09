package com.builder_design;

public class DDLS_SourceCodeBuilder implements IF_SourceCodeBuilder{
	
	private SourceCode srccode = new SourceCode();

	@Override
	public void setViewAnnotation() {
		// TODO Auto-generated method stub
		this.srccode.viewannotation = "DDLS view anno";
	}

	@Override
	public void setViewParam() {
		// TODO Auto-generated method stub
		this.srccode.viewparam = "DDLS view param";
	}

	@Override
	public void setFieldNames() {
		// TODO Auto-generated method stub
		this.srccode.fieldname = "DDLS field name";
	}

	@Override
	public void setFieldParams() {
		// TODO Auto-generated method stub
		this.srccode.fieldparam = "DDLS field param";
	}
	
	public SourceCode getSourceCode() {
		return this.srccode;
	}

}
