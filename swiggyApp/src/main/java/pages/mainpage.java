package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class mainpage extends TestBase{

	@FindBy(id="id_contact")
	WebElement Subjectheading;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="id_order")
	WebElement orderref;
	@FindBy(id="message")
	WebElement messageText;
	@FindBy(id="submitMessage")
	WebElement sendButton;
	
	public mainpage()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateTitle()
	{
		return driver.getTitle();
	}
	
}
