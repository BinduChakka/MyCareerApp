package StepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import PageFactory.CucumberBaseClass;
import PageObjectModel.SkillUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class SkillUpcucumber {
	public List<String> Skilling_Status = new ArrayList<String>();

	public WebDriver driver = CucumberBaseClass.getDriver();
	SkillUp skill = new SkillUp(driver);

	@Given("User navigate to OneCognizant Apps")
	public void user_navigate_to_one_cognizant_apps() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		skill.NavigateToSKillUp();
		Thread.sleep(5000);
	}

	@And("Switching frame in skillup")
	public void switching_frame_in_skillup() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		skill.FrameSwitchInSKillUp();
		Thread.sleep(5000);
	}

	@When("Scrolling for view")
	public void scrolling_for_view() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		skill.Scrolling();
	}

	@And("AquireSkills using get text to display")
	public void aquire_skills_using_get_text_to_display() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		skill.AquireSkills();
	}
}
