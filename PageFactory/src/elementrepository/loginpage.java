package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class loginpage 
{
	@FindBy(how=How.ID,using="txtUsername")
	public WebElement Text_username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public WebElement Text_password;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Log in')]")
	public WebElement click_button;
}

