package spare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Spare11 {

	@Test
	private void tc33() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
	    Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(@class,'hrefch') and text()]"));
		for (WebElement lap : list) {
			String text = lap.getText();
			while (text.contains("Pro")) {
				lap.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.xpath("//td"));
		boolean contains = false;
		for (WebElement cart : check) {
			
			while (cart.getText().contains("Pro")) {
				contains = true;
				break;
			}
		}
		Assert.assertTrue(contains, "product added");
		
		
	}
}
