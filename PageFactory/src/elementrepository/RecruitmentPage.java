package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RecruitmentPage
{
	@FindBy(how=How.ID,using="menu_recruitment_viewRecruitmentModule")
	public WebElement Recruitment_Title;
	
	@FindBy(how=How.ID,using="menu_recruitment_viewJobVacancy")
	public WebElement vacency_title;
	
	@FindBy(how=How.ID,using="btnAdd")
	public WebElement Add_button;
	
	@FindBy(how=How.ID,using="btnSave")
	public WebElement Save_button;
	
	@FindBy(how=How.ID,using="addJobVacancy_jobTitle")
	public WebElement SelectOption;
	
	
}


