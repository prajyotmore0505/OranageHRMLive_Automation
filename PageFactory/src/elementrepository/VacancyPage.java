package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VacancyPage
{
	@FindBy(how=How.ID,using="addJobVacancy_jobTitle")
	public WebElement SelectDropdownOption;
	@FindBy(how=How.NAME,using="addJobVacancy[name]")
	public WebElement vacancyName;
	
	
}
