package pages;


import org.openqa.selenium.support.PageFactory;


import base.TestBase;

public class mainpage extends TestBase{

	
	public mainpage()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateTitle()
	{
		return driver.getTitle();
	}
	
}
