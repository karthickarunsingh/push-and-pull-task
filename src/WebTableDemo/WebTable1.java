package WebTableDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tableRows = d.findElement(By.id("customers"));
		List<WebElement> tableRow = tableRows.findElements(By.tagName("tr"));
		for(int i=0;i<tableRow.size();i++) {
			WebElement element = tableRow.get(i);
			//String text = element.getText();
			//System.out.println(text);
			List<WebElement> tableDatas = element.findElements(By.tagName("td"));
			for(int j=0;j<tableDatas.size();j++) {
				WebElement element2 = tableDatas.get(j);
				String text = element2.getText();
				if(text.equals("uk")) {
					System.out.println(text);
					System.out.println(i+1);
					System.out.println(j+1);
				}
				}
		        }}}
