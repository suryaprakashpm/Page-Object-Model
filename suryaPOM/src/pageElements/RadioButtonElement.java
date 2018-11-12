package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonElement {
	public static WebElement element=null;
	public static WebElement selectEnjoyClass(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='yes']"));
		return element;
		}
	public static WebElement selectUnchecked(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[1]"));
		return element;
	}
	public static WebElement selectAbove40(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[3]"));
		return element;
	}
}
