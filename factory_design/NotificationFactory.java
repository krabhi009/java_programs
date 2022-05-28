package com.factory_design;

public class NotificationFactory {
	public Notification createObject(String type) {
		if(type.equals("SMS")) {
			return new SMS_Notification();
		}else if(type.equals("Email")){
			return new Email_Notification();
	    }else if(type.equals("Push")) {
	    	return new Push_Notification();
	    }else {
	    	return null;
	    }
	}
}
