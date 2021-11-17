package steps;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.mainpage;

public class mainpageSteps extends TestBase{

	mainpage ma;
	String title;
	
	@Given("I am on main page")
	public void i_am_on_login_page() {
		initialization();
		ma = new mainpage();
	  
	}

	@When("I get the title of the page")
	public void i_get_the_title_of_the_page() {
		title = ma.validateTitle();
	    
	}
	@Then("I validate title as {string}")
	public void i_validate_the_title_(String expectedTitle) {
	   
		Assert.assertEquals(title, expectedTitle);
			
	}
	
}
