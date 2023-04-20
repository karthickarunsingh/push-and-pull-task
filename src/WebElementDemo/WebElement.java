package WebElementDemo;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		org.openqa.selenium.WebElement uN = d.findElement(By.id("email"));
		boolean displayed = uN.isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = uN.isEnabled();
		System.out.println(enabled);
		
		boolean selected = uN.isSelected();
		System.out.println(selected);
		
		if (displayed&&selected) {
			uN.sendKeys("arunsingh");
			
			
		}else {
			uN.sendKeys("karthickarun87");
		}
			org.openqa.selenium.WebElement cN = d.findElement(By.xpath("//a[text()='Create New Account']"));	
		    cN.click();
		    
		    org.openqa.selenium.WebElement rB = d.findElement(By.xpath("(//input[@type='radio'])[2]"));
		    
		    System.out.println("before click "+rB.isSelected());
		    
		    rB.click();
		    
		    System.out.println("after click "+rB.isSelected());
		    
	
	}
		}
