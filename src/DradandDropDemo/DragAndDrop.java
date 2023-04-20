package DradandDropDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();

		d.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement source = d.findElement(By.xpath("//a[text()=' 5000']"));

		WebElement target = d.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		Actions ac = new Actions(d);

		ac.dragAndDrop(source, target).perform();

	}

}
