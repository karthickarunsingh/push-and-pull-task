package WindowHandlingDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	d.get("https://www.amazon.in/");
	
	WebElement searchBox = d.findElement(By.xpath("//input[@type='text']"));
	searchBox.sendKeys("iphone");
	WebElement click = d.findElement(By.xpath("//input[@type='submit']"));
	click.click();
	
	WebElement linkIphone = d.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Blue']"));
	linkIphone.click();
	
	String parentWindow = d.getWindowHandle();
	System.out.println(parentWindow);
	
	Set<String> allWindows = d.getWindowHandles();
	System.out.println(allWindows);
	
	Thread.sleep(3000);
	
	for (String eachWindow: allWindows) {
		if (!parentWindow.equals(eachWindow)) {
			d.switchTo().window(eachWindow);
			
			
		}
	}
	    WebElement btnCart = d.findElement(By.xpath("//input[@value='Add to Cart']"));
		btnCart.click();	
	}
	}
	


