package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\Thinkpad\\git\\Swiggy-Application\\swiggyApp\\src\\test\\java\\featuers"},
		glue = {"steps"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"html:cucumberhtml",
				"json:jsonReports/cucumber.json",
				"junit:CucumberReports/cucmber.xml"
				
		}
		//tags = "@career"
		
		)
		


public class TestRunner {

}
