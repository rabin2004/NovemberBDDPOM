package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\NovemberBDDPOM\\src\\test\\java\\featurePkg",
		glue="step_Definitions",
		plugin={"pretty","html:target/HTML_Report/report.html","json:target/JSON_Report/report.json"},
//		tags="@NewScenario" // only run called out tags
//		tags="@E2E and @Integration" // only run scenario with both tag
//		tags="@E2E or @Smoke" // run scenario with have either of them
		tags="@Smoke and not @E2E" // will not run scenario mentioned as "and not"
		)

public class RunnerClass_3 {

}
