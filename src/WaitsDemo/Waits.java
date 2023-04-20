package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    //To implicitly wait - its for all locators
	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    d.get("https://www.facebook.com/");
	    d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
	    
	
	}

}
