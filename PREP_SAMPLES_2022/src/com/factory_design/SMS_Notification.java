package com.factory_design;

public class SMS_Notification implements Notification{

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS notification...");
		
	}
	
}
