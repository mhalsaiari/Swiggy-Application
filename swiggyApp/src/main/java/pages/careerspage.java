package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class careerspage extends TestBase{
	
	@FindBy(xpath="/html/body/app-root/app-home/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/input")
	WebElement CareesTextFiled;
	
	@FindBy(xpath="/html/body/app-root/app-home/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/button")
	WebElement SearchButton;
	
	public careerspage()
	{
		PageFactory.initElements(driver, this);
	}

	public void EnterJobName(String jobName) {
		CareesTextFiled.sendKeys(jobName);
	}
	
	public void clickSearchButton(){
		SearchButton.click();
	}

	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public void search() {
		SearchButton.click();
	}
	
}
