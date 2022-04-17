package org.phone;


public class Phone {
	private void phoneInfo(String phonename) {
		System.out.println("phone name is:" +phonename);

	}
	private void phoneInfo(String model,float imei) {
	System.out.println("phone model:" +model + "\n "+ "imei :" +imei);
	}
	
	
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo("vivo ");
		ph.phoneInfo("v5", 6765656565665f);
	}
}
