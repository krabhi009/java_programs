package com.builder_design;

public class DCLS_SourceCodeBuilder implements IF_SourceCodeBuilder{

	private SourceCode srccode;
	@Override
	public void setViewAnnotation() {
		// TODO Auto-generated method stub
		this.srccode.viewannotation = "DCLS view anno";
	}

	@Override
	public void setViewParam() {
		// TODO Auto-generated method stub
		this.srccode.viewparam = "DCLS view param";
	}

	@Override
	public void setFieldNames() {
		// TODO Auto-generated method stub
		this.srccode.fieldname = "DCLS field name";
	}

	@Override
	public void setFieldParams() {
		// TODO Auto-generated method stub
		this.srccode.fieldparam = "DCLS field param";
	}
	
	public SourceCode getSourceCode() {
		return this.srccode;
	}


}
