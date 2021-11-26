package br.com.keeggo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {
	
	protected static WebDriver Browser;
	
	public static final String URL_MENU = "http://automationpractice.com/index.php";

	public WebBrowser() {
		if(Browser == null) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			Browser = new ChromeDriver();
			Browser.navigate().to(URL_MENU);
			Browser.manage().window().maximize();
		}
		
		}
	
	
	
}
