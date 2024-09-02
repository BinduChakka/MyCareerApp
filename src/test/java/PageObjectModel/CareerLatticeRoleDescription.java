package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerLatticeRoleDescription extends BasePage {

	public CareerLatticeRoleDescription(WebDriver driver) {
		super(driver);
	}

	// Locators

	@FindBy(id = "appFrame")
	WebElement Frame1;

	@FindBy(xpath = "//*[text()=\"Career Lattice & Role Description\"]")
	WebElement Arrow;

	@FindBy(name = "content")
	WebElement Frame2;

	@FindBy(xpath = "//*[text()=\"Quality Engineering & Assurance\"]")
	WebElement ServiceLine;

	@FindBy(xpath = "//*[text()=\"MyCareer\"]")
	WebElement MyCareericon;

	// Actions Methods

	public void SwitchFrame() {

		driver.switchTo().frame(Frame1);
		System.out.println("Frame1 is changed");
	}

	public void ClickArrow() {

		Arrow.click();
		System.out.println("Arrow is clicked");
	}

	public void FrameSwitch() {
		driver.switchTo().frame(Frame2);
		System.out.println("Frame2 is changed");

	}

	public void ServiceLine() {
		if (ServiceLine.isDisplayed()) {
			System.out.println("ServiceLine Quality Engineering & Assurance is displayed");
		}

		else
			System.out.println("ServiceLine Quality Engineering & Assurance is not displayed");

	}

	public void SwitchBack() {
		driver.switchTo().defaultContent();
		System.out.println("Frame is switched");
	}

	public void ClickMyCareericon() {
		MyCareericon.click();
		System.out.println("Clicked on MyCareer");

	}

}
