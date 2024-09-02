package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillProfile extends BasePage {

	public SkillProfile(WebDriver driver) {
		super(driver);
	}

	// Locators

	@FindBy(xpath = "//*[text()=\"self_improvement\"]")
	WebElement MySkillPath;

	@FindBy(xpath = "//*[text()=\"Web_Java Quality Engineer (... \"]")
	WebElement OrgAssigned;

	@FindBy(xpath = "//*[text()=\" CITS \"]")
	WebElement Scrolldown;

	@FindBy(xpath = "//*[text()=\"keyboard_arrow_left\"]")
	WebElement KeyBoardArrow;

	@FindBy(xpath = "//*[text()=\" Select skilling path \"]")
	WebElement SkillingPath;

	@FindBy(xpath = "//div[text()=\"111 skill clusters found\"]")
	WebElement SkillClusters;

	// Actions

	public void ClickMySkillPath() {
		MySkillPath.click();
		System.out.println("Clicked My Skill Path Successfully");
	}

	public void ClickOrgAssigned() {
		OrgAssigned.click();
		System.out.println("Clicked Org Assigned Successfully");

	}

	public void ScrollDownToCTS() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", Scrolldown);
		System.out.println("Successfully Scrolled till CTS");
	}

	public void SupplementorySkills() {
		KeyBoardArrow.click();
		System.out.println("Arrow is clicked");
	}

	public void SelectSkillingPath() {
		SkillingPath.click();
		System.out.println("Skilling path is selected Successfully");
	}

	public void ClustersSkills() {
		if (SkillClusters.isDisplayed()) {
			System.out.println("No of Clusters avaialble are displayed: 111 skill clusters found");
		}
	}

}
