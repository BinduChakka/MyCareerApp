package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageFactory.CucumberBaseClass;
import PageObjectModel.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homecucumber {

	
		public WebDriver driver = CucumberBaseClass.getDriver();
		Home home = new Home(driver);
	
	
	@Given("User Navigated to OneC Website")
	public void user_navigated_to_one_c_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
	    System.out.println("Navigated Successfully");
	    Thread.sleep(5000);
	}

	@And("ScrollDown to HotApps")
	public void scrolldowntohotapps() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		home.ScrollDownToHotApps();
		Thread.sleep(5000);
		System.out.println("Scrolled down");
	    
	}

	@When("User Clicking MyCareer App")
	public void user_clicking_my_career_app() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		home.ClickMyCarrer();
		Thread.sleep(5000);
		System.out.println("My Career app is clicked");
		Thread.sleep(5000);
	}

	/*@When("Alert handling")
	public void alert_handling() {
	    // Write code here that turns the phrase above into concrete actions
	    home.
	}

	@And("Click QuickAccess")
	public void click_quick_access() {
	    // Write code here that turns the phrase above into concrete actions
	    home.QuickAccessOC();
	}

	@Then("ScrollDown to HotApps")
	public void scroll_down_to_hot_apps() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.ScrollDownToHotApps1();
	    Thread.sleep(5000);
	}

	@And("User Clicking MyCareer App again")
	public void user_clicking_my_career_app_again() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    home.ClickMyCarrer1();
	    Thread.sleep(5000);
	    
	}*/


}
