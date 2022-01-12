package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;

public class Tests extends TestBase{

	HomePage HomePageObj;
	
	@Test(priority=1)
	public void TestMenuRidersBtn() {
		HomePageObj = new HomePage(driver);
		HomePageObj.NavigateToRiders();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Deliveroo | The Deliveroo Riders Website"));
	}
	
	@Test(priority = 2)
	public void TestSearch() {
		HomePageObj = new HomePage(driver);
		driver.navigate().to(WebURL);
		HomePageObj.WriteInSearch("london");
		Assert.assertTrue(HomePageObj.FirstOption.getText().contains("London"));
		HomePageObj.ChooseFirstElement();
		Assert.assertTrue(driver.getTitle().contains("Takeaway delivery in St James's - Order with Deliveroo"));
	}
}
