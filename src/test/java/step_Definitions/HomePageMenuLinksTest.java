package step_Definitions;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;

public class HomePageMenuLinksTest extends BaseClass{
	HomePage hp = new HomePage();
	
	@When("click on link {string}")
	public void click_on_link(String link) {
		hp.homePageMenuLinkClick(link);
	}
	
	@Then("user should be take to specific link {string} page")
	public void user_should_be_taken_to_specific_link_page(String link) {
		Assert.assertTrue(hp.homePageMenuLinkQuickPageTitleValidation(link));
		Assert.assertTrue(hp.homePageMenuLinkQuickPageURLValidation(link));
	}

}
