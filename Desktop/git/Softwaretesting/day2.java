package MyntraAutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTesting {
	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.flipkart.com/");
		
		WebElement element = chromeDriver.findElement(By.xpath("//img[@class=\"-dOa_b L_FVxe\"]"));
		element.click();
		
		
		
		WebElement element2 = chromeDriver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		element2.sendKeys("9344021628");
		
		chromeDriver.navigate().to("https://www.flipkart.com/#");
		
		chromeDriver.quit();
		
	}
}
