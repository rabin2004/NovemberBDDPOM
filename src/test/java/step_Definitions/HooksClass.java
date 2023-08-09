package step_Definitions;

import basePkg.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	// Pre-requisite step
	@Before
	public void loadApp() {
		initialization();
	}

	// post-requisite step
	@After
	public void closeApp() {
		tearDown();
	}
}
