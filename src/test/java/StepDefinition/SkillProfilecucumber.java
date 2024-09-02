package StepDefinition;

import org.openqa.selenium.WebDriver;
import PageFactory.CucumberBaseClass;
import PageObjectModel.SkillProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class SkillProfilecucumber {
	public WebDriver driver = CucumberBaseClass.getDriver();
	SkillProfile skillp = new SkillProfile(driver);

	@Given("User Clicks on My skill path")
	public void user_clicks_on_my_skill_path() {
		// Write code here that turns the phrase above into concrete actions
		skillp.ClickMySkillPath();
	}

	@And("click on Org Assigned")
	public void click_on_org_assigned() {
		// Write code here that turns the phrase above into concrete actions
		skillp.ClickOrgAssigned();
	}

	@When("Scroll down to CTS")
	public void scroll_down_to_cts() {
		// Write code here that turns the phrase above into concrete actions
		skillp.ScrollDownToCTS();
	}

	@And("clicking arrow")
	public void clicking_arrow() {
		// Write code here that turns the phrase above into concrete actions
		skillp.SupplementorySkills();
	}

	@And("Select skilling path")
	public void select_skilling_path() {
		// Write code here that turns the phrase above into concrete actions
		skillp.SelectSkillingPath();
	}

	@And("Displaying the Cluster skills")
	public void displaying_the_cluster_skills() {
		// Write code here that turns the phrase above into concrete actions
		skillp.ClustersSkills();
	}
}
