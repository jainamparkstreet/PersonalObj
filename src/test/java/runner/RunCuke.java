package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"html:target/cucumber-reports/cucumber-html-report.html"},
		features = {"src/test/resources/FeatureFile/Login.feature", "src/test/resources/FeatureFile/ProductTool.feature"},
		glue = "steps", 
		//plugin = {"json:target/cucumber.json"},
		monochrome = true 
				)

public class RunCuke extends AbstractTestNGCucumberTests{
	

	

}
