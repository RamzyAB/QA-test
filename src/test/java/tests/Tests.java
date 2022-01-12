package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class Tests extends TestBase{

	HomePage HomePageObj;
	
	@Test()
	public void TestOne() {
		HomePageObj = new HomePage(driver);
		HomePageObj.NavigateToRiders();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Deliveroo | The Deliveroo Riders Website"));
	}
	
	@Test
	public void TestTwo() {
		HomePageObj = new HomePage(driver);
		driver.navigate().to(WebURL);
		HomePageObj.WriteInSearch("london");
		Assert.assertTrue(HomePageObj.FirstOption.getText().contains("London"));
		HomePageObj.ChooseFirstElement();
		Assert.assertTrue(driver.getTitle().contains("Takeaway delivery in St James's - Order with Deliveroo"));
	}
}
