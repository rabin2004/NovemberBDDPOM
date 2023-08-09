package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import basePkg.BaseClass;

public class CommonFunctionality extends BaseClass{
	Actions action;

	public CommonFunctionality() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void hittingEnterKey() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
}
