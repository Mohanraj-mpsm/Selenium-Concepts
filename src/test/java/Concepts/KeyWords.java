package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyWords {
	
public static WebDriver driver;
	
	
	public static void launch(String url) {
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver(); 
//		driver.navigate().to(url);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.navigate().to(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
		
	}

	public static void minimize() {
		driver.manage().window().minimize();
	}
	

}



