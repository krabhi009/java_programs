package com.builder_design;

public class DDLX_SourceCodeBuilder implements IF_SourceCodeBuilder{
	private SourceCode srccode;
	@Override
	public void setViewAnnotation() {
		// TODO Auto-generated method stub
		this.srccode.viewannotation = "DDLX view anno";
	}

	@Override
	public void setViewParam() {
		// TODO Auto-generated method stub
		this.srccode.viewparam = "DDLX view param";
	}

	@Override
	public void setFieldNames() {
		// TODO Auto-generated method stub
		this.srccode.fieldname = "DDLX field name";
	}

	@Override
	public void setFieldParams() {
		// TODO Auto-generated method stub
		this.srccode.fieldparam = "DDLX field param";
	}
	
	public SourceCode getSourceCode() {
		return this.srccode;
	}


}
