package onlineShopping.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	 static public WebDriver getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe"); 
			 return new ChromeDriver();
					 
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","src/test/resources/drivers/IEDriverServer.exe"); 
			return new InternetExplorerDriver();
		}
		else
		{
			return null;
		}
	}

}

