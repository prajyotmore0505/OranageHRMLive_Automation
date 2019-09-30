package RecruitmentTest;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import elementmethod.RecruitmentOperations;
import elementmethod.VacancyPageOperation;
import elementmethod.loginpagemethod;
import helper.BrowserOperation;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.ErrorEscalating;

public class VacancyTest 
{
	WebDriver driver;
	@BeforeMethod
	public void Login()
	{
		
	}
	
	
	
	@Test
	public void Addvacaency() throws Exception
	{
		BrowserOperation obj = new BrowserOperation();
		driver=obj.launchApplication("Chrome");
		
		//verify application is launched successfully
		//return title method
		//verify title is orangehrm
		
//		String actualTitle = obj.Gettitle();
//		Assert.assertEquals(actualTitle, "OrangeHRM");

		loginpagemethod loginpagemethodObj = new loginpagemethod(driver);
//		loginpagemethodObj.Username();
//		loginpagemethodObj.password();
		loginpagemethodObj.loginbutton();
//		
//		RecruitmentOperations RecObj = new RecruitmentOperations(driver);
//		RecObj.Click_On_Recruitment();
//		RecObj.Click_On_Vacency();
//		RecObj.Click_On_Add();
//		RecObj.click_On_Save();
//		
//		String Actualtitle=obj.RequiredError();
//		Assert.assertEquals(Actualtitle, "Required");
//		System.out.println("Required to fill the details");
		
//		VacancyPageOperation vacancyObj = new VacancyPageOperation(driver);
//		vacancyObj.Select_jobtitle();
//		vacancyObj.Select_Vacancyname();
		
		
		
	}
	
}
