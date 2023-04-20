package NavigationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.get("https://www.amazon.com/");
		d.get("https://www.facebook.com/");
		
		d.navigate().back();
		d.navigate().back();
		d.navigate().forward();
		d.navigate().forward();
		d.navigate().refresh();
		
		//to pass the value for my ref
		WebElement uN = d.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','karthickarun87@gmail.com')",uN);
		WebElement uP = d.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Arunsingh@1988')",uP);
		WebElement btn = d.findElement(By.xpath("//button[@name='login']"));
		btn.click();
		
		
		

}}
