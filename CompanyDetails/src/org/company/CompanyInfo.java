package org.company;

public class CompanyInfo {
	
	private void companyName(String companyname) {
		companyName("apple info", "anna nagar");
		System.out.println("company name is:" +companyname);

	}
	private void companyName(String companyname,String address) {
	System.out.println("company name is:" +companyname +" \n "+ "company address is:" +address);

	}
	public static void main(String[] args) {
		CompanyInfo  ci = new CompanyInfo();
		ci.companyName("abc pvt company");
	}
}
