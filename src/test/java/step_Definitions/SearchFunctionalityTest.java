package step_Definitions;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CommonFunctionality;
import pageFactory.HomePage;
import pageFactory.SearchResultPage;

public class SearchFunctionalityTest extends BaseClass{
	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();
	CommonFunctionality cf = new CommonFunctionality();
	
	// Handled in Hooks class
//	// Pre-requisite step
//	@Before
//	public void loadApp() {
//		initialization();
//	}
//	
//	// post-requisite step
//	@After
//	public void closeApp() {
//		tearDown();
//	}
	
	@Given("end user is in homepage")
	public void end_user_is_in_homepage() {
//		initialization();
//		hp = new HomePage();
//		srp = new SearchResultPage();
//		cf = new CommonFunctionality();
	}

	@When("enters a valid product search textbox")
	public void enters_a_valid_product_search_textbox() {
	    hp.enterProductInSearchTxtBox(prop.getProperty("validSearchProduct"));
	}

	@And("clicks search button")
	public void clicks_search_button() {
	    hp.clickSearchBtn();
	}

	@Then("user should be taken to search result page")
	public void user_should_be_take_to_search_result_page() {
	    Assert.assertTrue(srp.validatePageTitle().contains(prop.getProperty("validSearchProduct")));
	}

	@And("should see available products")
	public void should_be_available_products() {
	    Assert.assertTrue(srp.validateSearchResultHeader());
	}
	
	@And("hits Enter key")
	public void hits_enter_key() {
	    cf.hittingEnterKey();
	}
	
	@When("enters a invalid product search textbox")
	public void enters_a_invalid_product_search_textbox() {
		 hp.enterProductInSearchTxtBox(prop.getProperty("invalidSearchProduct"));
	}
	
	@Then("should see no result found error message should be displayed")
	public void should_see_no_result_found_error_message_should_be_displayed() {
		Assert.assertTrue(srp.validateNoResultErrorMsg());
	}
	
	@When("enters a valid product {string} search textbox")
	public void enters_a_valid_product_string_search_textbox(String validProduct) {
		hp.enterProductInSearchTxtBox(validProduct);
	}

	@Then("user should be taken to valid product {string} search result page")
	public void user_should_be_taken_to_valid_product_string_search_result_page(String validProduct) {
		Assert.assertTrue(srp.validatePageTitle().contains(validProduct));
	}
	
	@When("enters a invalid product {string} search textbox")
	public void enters_a_invalid_product_string_search_textbox(String invalidProduct) {
		hp.enterProductInSearchTxtBox(invalidProduct);
	}

	@Then("user should be taken to invalid product {string} search result page")
	public void user_should_be_taken_to_invalid_product_string_search_result_page(String invalidProduct) {
		Assert.assertTrue(srp.validatePageTitle().contains(invalidProduct));
	}

}
