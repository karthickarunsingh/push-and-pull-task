package AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.getCurrentUrl();
		d.getTitle();
		WebElement usrName = d.findElement(By.id("email"));
		usrName.sendKeys("karthickarun87@gmail.com");
		WebElement usrPass = d.findElement(By.id("pass"));
		usrPass.sendKeys("Arunssingh@1988");
	}
	

}
