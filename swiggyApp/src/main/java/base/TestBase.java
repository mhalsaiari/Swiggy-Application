package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\git\\Swiggy-Application\\swiggyApp\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

}
