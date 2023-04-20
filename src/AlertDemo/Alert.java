package AlertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://demo.automationtesting.in/Alerts.html");
		WebElement alertBtn = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertBtn.click();
		
		org.openqa.selenium.Alert al = d.switchTo().alert();
		
		al.accept();
		
		d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		
		d.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		al.dismiss();
		
		d.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		d.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		String text = al.getText();
		System.out.println(text);
		
		al.sendKeys("arun singh");
		Thread.sleep(2000);
		al.accept();
		
		
		 

}}
