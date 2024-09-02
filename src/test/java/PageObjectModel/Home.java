package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;

public class Home extends BasePage {

	public Home(WebDriver driver) {
		super(driver);
	}

	// Locators
	
	

	@FindBy(xpath = "//*[text()='Hot Apps']")
	WebElement Scrolldown;

	@FindBy(xpath = "//*[text()='MyCareer']")
	WebElement MyCareer;
	
	@FindBy(xpath = "//*[text()=\"Quick Access\"][1]")
	WebElement QuickAccess;
	
	@FindBy(xpath = "//*[text()='Hot Apps']")
	WebElement Scrolldown1;

	@FindBy(xpath = "//*[text()='MyCareer']")
	WebElement MyCareer1;
	
	

	// Actions Methods
	
	

	public void ScrollDownToHotApps() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Scrolldown);
		System.out.println("Scrolled to Hot Apps");
	}

	public void ClickMyCarrer() {
		MyCareer.click();
		System.out.println("My Career is clicked");
	}
	
	public void Alert() {
		Alert alert = driver.switchTo().alert();
        alert.accept();
		System.out.println("Alert handeled successfully");
	}
	
	public void QuickAccessOC() {
		QuickAccess.click();
		System.out.println("QuickAccess is clicked");
	}
	 
	public void ScrollDownToHotApps1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Scrolldown1);
		System.out.println("Scrolled to Hot Apps");
	}

	public void ClickMyCarrer1() {
		MyCareer1.click();
		System.out.println("My Career is clicked");
	}
	
	
	

}
