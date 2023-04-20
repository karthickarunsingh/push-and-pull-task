package MouseOverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://www.greenstechnologys.com/");
		WebElement optCourse = d.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac = new Actions(d);
		ac.moveToElement(optCourse).perform();
		WebElement optOracle = d.findElement(By.xpath("//span[text()='Oracle Training']"));
		ac.moveToElement(optOracle).perform();
		WebElement optSql = d.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));
		optSql.click();
		
	}
}
