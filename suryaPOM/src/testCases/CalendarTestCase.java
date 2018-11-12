package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageElements.CalendarElements;

public class CalendarTestCase {
	WebDriver driver;
	@Test
	public void calendar(){
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		CalendarElements.selectCalendarBox(driver).click();
		CalendarElements.selectMonth(driver).click();
		CalendarElements.selectDate(driver).click();
	}
}
