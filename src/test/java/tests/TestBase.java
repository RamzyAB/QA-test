package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public WebDriver driver;
	String WebURL = "https://deliveroo.co.uk/";
	
	@BeforeSuite
	public void startDriver() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(WebURL);
		
	}
	
	@AfterSuite
	public void EndDriver() {
		
		driver.quit();
	}
}
