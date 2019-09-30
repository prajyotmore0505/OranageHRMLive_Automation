package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOperation 
{
	WebDriver driver;
	public WebDriver launchApplication(String browserName) throws Exception
	{
		switch(browserName)
		{
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		 	driver = new FirefoxDriver();
		 	
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "c:\\IEDriverServerdriver.exe");
			driver= new InternetExplorerDriver();
			break;
			
			
		}
		Fileop fileoopObj= new Fileop();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(fileoopObj.ReadPropertyFile("url"));
		driver.get("https://s1.demo.opensourcecms.com/wordpress");
		
		return driver;
	}
		public String Gettitle()
		{
			String title= driver.getTitle();
			return title;
		}
		
		public String RequiredError()
		{
			String error = "Required";
			return error;
		}
}
