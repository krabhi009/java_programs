package com.factory_design;

public class MAIN {
	public static void main(String a[]) {
		//we want to call sendNotification method of Email_Notification class
		//Notification notify = new Notification();
		NotificationFactory notifyFactory = new NotificationFactory();
		Notification notify = notifyFactory.createObject("Push");
		notify.sendNotification();
		
		Email_Notification em = (Email_Notification) notifyFactory.createObject("Email");
		em.sendNotification();
	}
}
