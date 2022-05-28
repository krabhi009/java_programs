package com.factorydesign.parsesourcecode;

public class ParserFactory {
	public Parser creatObject(String type) {
		switch (type) {
		case "DDLS":
			return new DDLSParser();
		case "DCLS":
			return new DCLSParser();
		case "DDLX":
			return new DDLXParser();
		default:
			return null;
		}
	}
}
