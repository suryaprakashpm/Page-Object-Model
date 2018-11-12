package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class CheckBoxElement {
	
	public static WebElement element;
	
	public static WebElement selectJava(WebDriver driver){
		
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]"));
		return element;
	}
	
	public static WebElement selectVB(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[2]"));
		return element;
	}
	
	public static WebElement selectSQL(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[3]"));
		return element;
	}
	public static WebElement selectC(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[4]"));
		return element;
	}
	public static WebElement selectCPluc(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[5]"));
		return element;
	}
}
