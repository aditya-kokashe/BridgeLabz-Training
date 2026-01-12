package com.day2.CallCenter;

public class CallCenterMain {

	public static void main(String[] args) {

		CallCenter cc = new CallCenter();
		
		cc.incomingCall("Ved", false);
		cc.incomingCall("Rakhi", false);
		cc.incomingCall("Praneet", false);
		cc.incomingCall("Muskan", false);
		cc.incomingCall("Prshad", true);
		cc.incomingCall("Anil", true);
		cc.incomingCall("Aamin", true);

		cc.serveCall();
		cc.serveCall();
		cc.serveCall();

		cc.showDetails();
	}

}
