package Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTesting {
	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.homecentre.in/in/en/");
		chromeDriver.manage().window().maximize();
		//chromeDriver.manage().window().minimize();
		//chromeDriver.manage().window().fullscreen();
		String title = chromeDriver.getTitle();
		System.out.println(title);
		String currentUrl = chromeDriver.getCurrentUrl();
		System.out.println(currentUrl);
		
		chromeDriver.close();
	}
}