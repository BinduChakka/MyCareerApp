package StepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import PageFactory.CucumberBaseClass;
import PageObjectModel.UploadResumeorLinkedinProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadResumeorLinkedinProfilecucumber {
	public List<String> Technical_skills = new ArrayList<String>();
	public List<String> Domain_skills = new ArrayList<String>();
	public List<String> Functional_skills = new ArrayList<String>();
	public List<String> Behavioral_skills = new ArrayList<String>();

	public WebDriver driver = CucumberBaseClass.getDriver();
	UploadResumeorLinkedinProfile upload = new UploadResumeorLinkedinProfile(driver);

	@Given("User Navigating to Cognizant My Skills")
	public void user_navigating_to_cognizant_my_skills() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.Navigate();
		Thread.sleep(5000);
	}

	@Given("Handling Window")
	public void handling_window() {
		// Write code here that turns the phrase above into concrete actions
		upload.WindowHandle();
	}

	@When("Clicking MySkills")
	public void clicking_my_skills() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ClickMySkill();
		Thread.sleep(10000);
	}

	@When("Click on Technical")
	public void click_on_technical() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ClickTechnical();
		Thread.sleep(5000);
	}

	@When("Get list of technical Skills")
	public void get_list_of_technical_skills() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		upload.ListOfSkills1();
		Thread.sleep(5000);
	}

	@Then("Click on Domain")
	public void click_on_domain() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ClickDomain();
		Thread.sleep(5000);
	}

	@Then("Get list of domain skills")
	public void get_list_of_domain_skills() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		upload.ListOfSkills2();
		Thread.sleep(5000);
	}

	@Then("Click on Functional")
	public void click_on_functional() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ClickFunctional();
		Thread.sleep(5000);
	}

	@Then("Get list of functional skills")
	public void get_list_of_functional_skills() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		upload.ListOfSkills3();
		Thread.sleep(5000);
	}

	@Then("Click on Behavioral")
	public void click_on_behavioral() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ClickBehavioral();
		Thread.sleep(5000);
	}

	@Then("Get list of behavioral skills")
	public void get_list_of_behavioral_skills() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		upload.ListOfSkills4();
		Thread.sleep(5000);
	}
}
