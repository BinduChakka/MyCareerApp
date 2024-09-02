package PageObjectModel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillUp extends BasePage {
	public List<String> Skilling_Status = new ArrayList<String>();

	public SkillUp(WebDriver driver) {
		super(driver);

	}

	// Locators

	@FindBy(id = "appFrame")
	WebElement frame1;

	@FindBy(xpath = "//*[text()=\"Goal Fullfillment\"]")
	WebElement scroll;

	@FindBy(xpath = "//td[@class=\"con-wrapper ng-scope\"]/div/span")
	List<WebElement> courses;

	@FindBy(xpath = "//td[@class=\"con-wrapper\"]/span")
	List<WebElement> skillstatus;

	// Actions

	public void NavigateToSKillUp() {
		driver.navigate().to(
				"https://onecognizant.cognizant.com/Home?GlobalAppID=1738&URL=https://onecognizantazrapps.cognizant.com/1738/RDPApp/");
		System.out.println("Navigated to SkillUP");
	}

	public void FrameSwitchInSKillUp() throws InterruptedException {

		driver.switchTo().frame(frame1);
		System.out.println("Frame is switched");
	}

	public void Scrolling() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		System.out.println("Scrolled successfully");
	}

	public void AquireSkills() throws InterruptedException {

		for (WebElement c : courses) {
			System.out.println(c.getText());
		}
		System.out.println("Skill Type    Expected Proficiency      Status");
		System.out.println("===============================================================");
		for (WebElement s : skillstatus) {
			System.out.print(s.getText() + "      ");
		}
		System.out.println();
		System.out.println("===============================================================");
		Thread.sleep(1000);

	}

}
