package ScrollDownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		WebElement down = d.findElement(By.xpath("//a[text()='Watch']"));
		
		js.executeScript("arguments[0].ScrollInToView(true)",down);
		
		//Actions ac = new Actions(d);
		//ac.moveToElement(down).perform();
		
		
		
		//WebElement up = d.findElement(By.id("email"));
		
		//ac.moveToElement(up).perform();
		
		//up.sendKeys("karthickarun87@gmail.com");

}}
