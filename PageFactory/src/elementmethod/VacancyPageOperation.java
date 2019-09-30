package elementmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import elementrepository.VacancyPage;

public class VacancyPageOperation 
{
	WebDriver driver;
	VacancyPage vacancyObj;
	public VacancyPageOperation(WebDriver driver)
	{
		this.driver=driver;
		vacancyObj=PageFactory.initElements(driver, VacancyPage.class);
		
	}
	
	

	public void Select_jobtitle()
	{
		Select selectdropdown = new Select(vacancyObj.SelectDropdownOption);
		selectdropdown.selectByValue("8");
	}
	
	public void Select_Vacancyname()
	{
		vacancyObj.vacancyName.sendKeys("Automation Tester");
	}
	
	
	
}
