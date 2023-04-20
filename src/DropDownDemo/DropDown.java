package DropDownDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	d.get("https://www.facebook.com/");
	WebElement btnCreat = d.findElement(By.xpath("(//a[@role='button'])[2]"));
	btnCreat.click();
	
	WebElement dd = d.findElement(By.xpath("//select[@title='Day']"));
	
	Select s = new Select(dd);
	
	s.selectByIndex(26);
	
	WebElement month = d.findElement(By.id("month"));
	
	Select s1 = new Select(month);
	s1.selectByIndex(9);
	
	WebElement year = d.findElement(By.id("year"));
	
	Select s2 = new Select(year);
	s2.selectByValue("1988");
	
	WebElement usrName = d.findElement(By.xpath("(//input[@type='text'])[2]"));
	usrName.sendKeys("Arunsingh");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	WebElement lastName = d.findElement(By.xpath("//input[@name='lastname']"));
	lastName.sendKeys("sornam");
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	WebElement email = d.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("karthickarun87@gmail.com");
	

	
	WebElement newPass = d.findElement(By.id("password_step_input"));
	newPass.sendKeys("1234567890");
	
	List<WebElement> optionss = s		.getOptions();
	for(int i=0;i<optionss.size();i++) {
		WebElement element = optionss.get(i);
		String text = element.getText();
		System.out.println		(text);
		
	
	
	
	
	
	}

			}}

		
	

	
