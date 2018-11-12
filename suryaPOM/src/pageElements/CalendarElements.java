package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarElements {
	public static WebElement element=null;
	public static WebElement selectCalendarBox(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='datepicker']"));
		return element;
	}
	public static WebElement selectMonth(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		return element;
	}
	public static WebElement selectDate(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[3]/a"));
		return element;
	}
}
