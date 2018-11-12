package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageElements.CheckBoxElement;

public class CheckBoxTestCase {
	WebDriver driver;
	@Test
	public void checkBox(){
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		CheckBoxElement.selectJava(driver).click();
		CheckBoxElement.selectCPluc(driver).click();
	}
}
