package steps;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.careerspage;

public class careerspageSteps extends TestBase{

	careerspage cp;
	String title;
	
	@Given("I am on careers page")
	public void i_am_on_careers_page() {
		initialization();
		driver.navigate().to("https://careers.swiggy.com/");
		cp = new careerspage();
	  
	}
	@When("I get title of the page")
	public void i_get_the_title_of_the_page() {
		title = cp.validateTitle();
	    
	}
	@Then("I validate the title as {string}")
	public void i_validate_the_title_as_SwiggyCareer(String expectedTitle) {
	   
		Assert.assertEquals(title, expectedTitle);
			
	}
	

	@When("I enter job name {string}")
	public void i_enter_job_name(String jobName) {
		cp.EnterJobName(jobName);
	}
	@Then("click search button")
	public void i_click_search() {
		
	   cp.search();
			
	}
}
