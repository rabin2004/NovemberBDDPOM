package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\NovemberBDDPOM\\src\\test\\java\\featurePkg",
		glue="step_Definitions",
		plugin={"pretty","html:target/HTML_Report/report.html","json:target/JSON_Report/report.json"}
		)

public class RunnerClass_2 {

}
