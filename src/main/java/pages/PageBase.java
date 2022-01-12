package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	
	
	public PageBase(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	
	protected void click(WebElement elem) {
		elem.click();
	}
	
	protected void SendText(WebElement elem,String value) {
		elem.clear();
		elem.sendKeys(value);
	}
	
	public void ScrollBy(String Value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scrollBy(0,"+Value+')');
	}
}
