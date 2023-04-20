package WindowHandlingDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		
		WebElement searchBox = d.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("iphone");
		WebElement click = d.findElement(By.xpath("//input[@type='submit']"));
		click.click();
		
		WebElement linkIphone = d.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (128 GB) - Space Black']"));
		linkIphone.click();
		
		String parentWindow = d.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windowHandles = d.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> li = new ArrayList<String>();
		
		li.addAll(windowHandles);
		System.out.println(li);
		
		String x = li.get(1);
		d.switchTo().window(x);
		
	    WebElement btnCart = d.findElement(By.xpath("//input[@value='Add to Cart']"));
		btnCart.click();	
				
}
}
