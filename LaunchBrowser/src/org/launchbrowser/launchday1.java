package org.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class launchday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/intl/en-GB/gmail/about/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
