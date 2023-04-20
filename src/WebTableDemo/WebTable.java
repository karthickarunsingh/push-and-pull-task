package WebTableDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = d.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for(int i=0;i<tableRows.size();i++) {
			WebElement element = tableRows.get(i);
			
			String text = element.getText();
			System.out.println(text);
			
			//To get Data from table
			List<WebElement> tableDatas = element.findElements(By.tagName("td"));
			for(int j=0;j<tableDatas.size();j++){
				WebElement tableData = tableDatas.get(j);
				String text2 = tableData.getText();
				System.out.println(text2);
				
				//To get the headers from the table
				List<WebElement> tableHeaders = tableData.findElements(By.tagName("th"));
				
				for(int k=0;k<tableHeaders.size();k++) {
					WebElement tableHeader = tableHeaders.get(k);
					String text3 = tableHeader.getText();
					System.out.println(text3);
					
				}
			
			
			}}}}
			
		
		    
	        


