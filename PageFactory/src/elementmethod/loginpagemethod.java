package elementmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elementrepository.loginpage;

public class loginpagemethod 
{
	WebDriver driver;
	loginpage loginpageObj;
	public loginpagemethod(WebDriver driver)
	{
		this.driver=driver;
		loginpageObj=PageFactory.initElements(driver, loginpage.class);
	}

	public void Username()
	{
		loginpageObj.Text_username.sendKeys("admin");
	}
	
	
	public void password()
	{
		loginpageObj.Text_password.sendKeys("admin123");
	}
	
	public void loginbutton()
	{
		loginpageObj.click_button.click();
	}
	
	
	
	
	
	
	
}
