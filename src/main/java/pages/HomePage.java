package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[1]/div/div/div/div/ul/li[3]/div/button")
	WebElement PartnerWithUs;
	@FindBy(xpath = "(//a[@class='ccl-8895c83ac1a67a9f'])[1]")
	WebElement Careers;
	@FindBy(xpath = "(//a[@class='ccl-7d59c9b330310cd4'])[1]")
	WebElement Riders;
	@FindBy(xpath = "(//a[@class='ccl-7d59c9b330310cd4'])[2]")
	WebElement Resturants;
	@FindBy(xpath = "(//a[@class='ccl-8895c83ac1a67a9f'])[2]")
	WebElement DeliveroForWork;
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement SearchBtn;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement AddressInput;
	@FindBy(xpath="//div[@class='ccl-208b296b2fcd108c ccl-bce792ee73ed1239']/ul/ul/li/button")
	public WebElement FirstOption;
	

	
    WebDriverWait wait; 

	
	public void NavigateToRiders() {
		click(PartnerWithUs);
		click(Riders);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void WriteInSearch(String Value) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

		ScrollBy("200");
		SendText(AddressInput, Value);		
	}
	
	public void ChooseFirstElement() {
//		wait.until(ExpectedConditions.visibilityOf(FirstOption));
		click(FirstOption);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
