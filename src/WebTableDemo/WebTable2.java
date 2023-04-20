package WebTableDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	d.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement tableRows = d.findElement(By.id("customers"));
	List<WebElement> tableRow = tableRows.findElements(By.tagName("tr"));
	for(int i=0;i<tableRow.size();i++) {
		//to print even number rows
		if(i%2!=1) {
			WebElement element = tableRow.get(i);
			String text = element.getText();
			System.out.println(text);
		

}}}}
