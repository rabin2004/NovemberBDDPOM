package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\NovemberBDDPOM\\src\\test\\java\\featurePkg",
		glue="step_Definitions"
		)

public class RunnerClass_1 {

}
