package TestRunner;
//import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Features//AmarRajaMobileRegistration.feature"},
	    tags = "@Sanity",
		

		
		glue="StepDefinition",
		dryRun = false,
		monochrome = true,
		//tags = "",
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
		)

//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Run extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
}
