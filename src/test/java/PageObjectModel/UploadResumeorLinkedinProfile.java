package PageObjectModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.ExcelUtils;

public class UploadResumeorLinkedinProfile extends BasePage {

	public List<String> Technical_skills = new ArrayList<String>();
	public List<String> Domain_skills = new ArrayList<String>();
	public List<String> Functional_skills = new ArrayList<String>();
	public List<String> Behavioral_skills = new ArrayList<String>();

	public UploadResumeorLinkedinProfile(WebDriver driver) {
		super(driver);
	}

	// Locators

	@FindBy(xpath = "//*[text()=\"engineering\"]")
	WebElement MySkill;

	@FindBy(xpath = "//*[text()=\"Technical (7)\"]")
	WebElement Technical;

	@FindBy(xpath = "//div[@class=\"truncate-skill label black\"]")
	public List<WebElement> Technicalskills;

	@FindBy(xpath = "//*[text()=\"Domain (2)\"]")
	WebElement Domain;

	@FindBy(xpath = "//div[@class=\"truncate-skill label black\"]")
	public List<WebElement> DomainSkills;

	@FindBy(xpath = "//*[text()=\"Functional (1)\"]")
	WebElement Functional;

	@FindBy(xpath = "//*[@class=\"name body black\"]")
	public List<WebElement> FunctionalSkills;

	@FindBy(xpath = "//*[text()=\"Behavioral (1)\"]")
	WebElement Behavioral;

	@FindBy(xpath = "//div[text()=\"Communication\"]")
	public List<WebElement> BehavioralSkills;

	// Actions

	public void Navigate() {
		driver.navigate().to("https://cognizantmyskills.prismforce.ai/home");
		System.out.println("Navigated to My Skills successfully");
	}

	public void WindowHandle() {
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		System.out.println("Window handled successfully");
	}

	public void ClickMySkill() {
		MySkill.click();
		System.out.println("My Skill is clicked");
	}

	public void ClickTechnical() {
		Technical.click();
		System.out.println("Techinal is clicked");
	}

	public void ListOfSkills1() throws InterruptedException, IOException {
		int c1 = 1;
		int row0 = 1;
		for (WebElement skills1 : Technicalskills) {
			System.out.println(c1 + "." + skills1.getText());
			// Thread.sleep(5000);
			c1++;
			String skill1 = skills1.getText();
			ExcelUtils.setCellData("XLwrite", row0, 0, skill1);
			row0++;
		}
	}

	public void ClickDomain() throws InterruptedException {
		Domain.click();
		System.out.println("Domain is clicked");
		 Thread.sleep(5000);

	}

	public void ListOfSkills2() throws InterruptedException, IOException {
		int c2 = 1;
		int row1 = 1;
		for (WebElement skills2 : DomainSkills) {
			System.out.println(c2 + "." + skills2.getText());
			Thread.sleep(10000);
			c2++;
			String skill2 = skills2.getText();
			ExcelUtils.setCellData("XLwrite", row1, 1, skill2);
			row1++;
		}
	}

	public void ClickFunctional() throws InterruptedException {
		Functional.click();
		System.out.println("Functional is clicked");
		 Thread.sleep(5000);
	}

	public void ListOfSkills3() throws InterruptedException, IOException {
		int c3 = 1;
		int row2 = 1;
		for (WebElement skills3 : FunctionalSkills) {
			System.out.println(c3 + "." + skills3.getText());
			 Thread.sleep(5000);
			c3++;
			String skill3 = skills3.getText();
			ExcelUtils.setCellData("XLwrite", row2, 2, skill3);
			row2++;
		}
	}

	public void ClickBehavioral() throws InterruptedException {
		Behavioral.click();
		System.out.println("Behavioral is clicked");
		 Thread.sleep(5000);
	}

	public void ListOfSkills4() throws IOException {
		int c4 = 1;
		int row3 = 1;
		for (WebElement skills4 : BehavioralSkills) {
			System.out.println(c4 + "." + skills4.getText());
			c4++;
			String skill4 = skills4.getText();
			ExcelUtils.setCellData("XLwrite", row3, 3, skill4);
			row3++;
		}
	}

}