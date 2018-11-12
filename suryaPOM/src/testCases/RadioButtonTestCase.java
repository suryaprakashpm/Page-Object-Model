package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageElements.RadioButtonElement;

public class RadioButtonTestCase {
	WebDriver driver;
	@Test
	public void radioButton(){
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		RadioButtonElement.selectEnjoyClass(driver).click();
		RadioButtonElement.selectAbove40(driver).click();
		RadioButtonElement.selectUnchecked(driver).click();
	}
	
}
