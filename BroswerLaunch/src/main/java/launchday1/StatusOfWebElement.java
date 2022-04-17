package launchday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		//writing webelement xpath
		WebElement searchbox = driver.findElement(By.name("firstname"));
		searchbox.sendKeys("siva");
		WebElement searchbox2 = driver.findElement(By.name("lastname"));
		searchbox2.sendKeys("ranjani");
		
		System.out.println("displaystatus:"  + searchbox.isDisplayed());
		System.out.println("Enablestatus:"   + searchbox.isEnabled());
		WebElement male = driver.findElement(By.xpath( "//label[normalize-space()='Male']"));
		WebElement female = driver.findElement(By.xpath( "(//span[@class='_5k_2 _5dba'])[1]"));
		male.click();
		System.out.println("male selected:" +male.isSelected());
		System.out.println("female selected:"  +female.isSelected());
		//female.click();
		female.isSelected();
		male.isSelected();
		
	}

}
