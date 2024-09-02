package StepDefinition;

import org.openqa.selenium.WebDriver;
import PageFactory.CucumberBaseClass;
import PageObjectModel.CareerLatticeRoleDescription;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class CareerLatticeRoleDescriptioncucumber {
	public WebDriver driver = CucumberBaseClass.getDriver();
	CareerLatticeRoleDescription career = new CareerLatticeRoleDescription(driver);

	@Given("Switch Frame")
	public void switch_frame() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.SwitchFrame();
		Thread.sleep(5000);
	}

	@And("Clicking on Arrow")
	public void clicking_on_arrow() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.ClickArrow();
		Thread.sleep(5000);
	}

	@When("Switching the Frame")
	public void switching_the_frame() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.FrameSwitch();
		Thread.sleep(5000);
	}

	@And("Displaying the Service Line")
	public void displaying_the_service_line() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.ServiceLine();
		Thread.sleep(5000);
	}

	@And("Switching to main frame")
	public void switching_to_main_frame() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.SwitchBack();
		Thread.sleep(5000);
	}

	@And("Click Mycareer icon")
	public void click_mycareer_icon() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		career.ClickMyCareericon();
		Thread.sleep(5000);
	}
}