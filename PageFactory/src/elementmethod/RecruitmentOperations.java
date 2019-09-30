package elementmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elementrepository.RecruitmentPage;

public class RecruitmentOperations 
{
	WebDriver driver;
	RecruitmentPage recruitmentObj;
	public RecruitmentOperations(WebDriver driver)
	{
		this.driver=driver;
		recruitmentObj=PageFactory.initElements(driver,RecruitmentPage.class );
		
	}
	public void Click_On_Recruitment()
	{
		recruitmentObj.Recruitment_Title.click();
	}
	
	public void Click_On_Vacency()
	{
		recruitmentObj.vacency_title.click();
	}
	
	public void Click_On_Add()
	{
		recruitmentObj.Add_button.click();
	}
	
	public void click_On_Save()
	{
		recruitmentObj.Save_button.click();
	}
	

	
	
	
	
	
	
}
