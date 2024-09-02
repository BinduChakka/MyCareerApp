package TestCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


import PageFactory.BaseClass;
import PageObjectModel.CareerLatticeRoleDescription;
import PageObjectModel.Home;
import PageObjectModel.SkillProfile;
import PageObjectModel.SkillUp;
import PageObjectModel.UploadResumeorLinkedinProfile;


public class TestCase1 extends BaseClass {
	
	public List<String> Technical_skills = new ArrayList<String>();
	public List<String> Domain_skills = new ArrayList<String>();
	public List<String> Functional_skills = new ArrayList<String>();
	public List<String> Behavioral_skills = new ArrayList<String>();
	public Home OneCognizant;
	public CareerLatticeRoleDescription Career;
	public UploadResumeorLinkedinProfile Upload;
	public SkillProfile skillprofile;
	public SkillUp skillup;

	// Home TestCase_1
	
	

	@Test(priority = 1, groups = { "smoke" })
	public void ScrollDown() throws InterruptedException {
		OneCognizant = new Home(driver);
		System.out.println("Home TestCase:1.1");
		OneCognizant.ScrollDownToHotApps();
		Thread.sleep(5000);

	}

	@Test(priority = 2, groups = { "regression" })
	public void MyCareer() throws InterruptedException {
		System.out.println("TestCase:1.2");
		OneCognizant.ClickMyCarrer();
		Thread.sleep(5000);

	}
	
	

	/*@Test(priority = 3, groups = { "regression" })
	public void AlertHandle() throws InterruptedException {
		System.out.println("TestCase:1.3");
		OneCognizant.Alert();
		Thread.sleep(5000);
	}*/

	@Test(priority = 4, groups = { "regression" })
	public void QuickAccessOneC() {
		System.out.println("TestCase:1.4");
		OneCognizant.QuickAccessOC();
	}

	

	@Test(priority = 5, groups = { "smoke" })
	public void ScrollDown1() throws InterruptedException {
		System.out.println("TestCase:1.5");
		OneCognizant.ScrollDownToHotApps1();
		Thread.sleep(5000);

	}

	@Test(priority = 6, groups = { "smoke" })
	public void MyCareer1() throws InterruptedException {
		System.out.println("TestCase:1.6");
		OneCognizant.ClickMyCarrer1();
		Thread.sleep(5000);
	}
	
	// CareerLatticeRoleDescription TestCase_2

	@Test(priority = 7, groups = { "regression" })
	public void SwitchFrame1() {
		System.out.println("CareerLatticeRoleDescription TestCase:2.1");
		Career = new CareerLatticeRoleDescription(driver);
		Career.SwitchFrame();

	}

	@Test(priority = 8, groups = { "regression" })
	public void MyCareerArrow() {
		System.out.println("TestCase:2.2");
		Career.ClickArrow();
	}

	@Test(priority = 9, groups = { "smoke" })
	public void SwitchFrame2() {
		System.out.println("TestCase:2.3");
		Career.FrameSwitch();
	}

	@Test(priority = 10, groups = { "regression" })
	public void ServiceLineQEA() {
		System.out.println("TestCase:2.4");
		Career.ServiceLine();

	}

	@Test(priority = 11, groups = { "smoke" })
	public void SwitchBackFrame() {
		System.out.println("TestCase:2.5");
		Career.SwitchBack();
	}

	@Test(priority = 12, groups = { "regression" })
	public void MyCareerIcon() throws InterruptedException {
		System.out.println("TestCase:2.6");
		Career.ClickMyCareericon();
		Thread.sleep(5000);

	}

	// UploadResumeorLinkedinProfile TestCase3

	@Test(priority = 13, groups = { "regression" })
	public void NavigateTo() throws InterruptedException {
		System.out.println("UploadResumeorLinkedinProfile TestCase:3.1");
		Upload = new UploadResumeorLinkedinProfile(driver);
		Upload.Navigate();
		Thread.sleep(10000);
	}

	@Test(priority = 14, groups = { "smoke" })
	public void WindowHandling() throws InterruptedException {
		System.out.println("TestCase:3.2");
		Upload.WindowHandle();
		Thread.sleep(10000);
	}

	@Test(priority = 15, groups = { "regression" })
	public void MySkills() throws InterruptedException {
		System.out.println("TestCase:3.3");
		Upload.ClickMySkill();
		Thread.sleep(10000);
	}

	@Test(priority = 16, groups = { "smoke" })
	public void TechnicalSkills() throws InterruptedException {
		System.out.println("TestCase:3.4");
		Upload.ClickTechnical();
		Thread.sleep(5000);
	}

	@Test(priority = 17, groups = { "regression" })
	public void ListOfTech() throws InterruptedException, IOException {
		System.out.println("TestCase:3.5");
		Upload.ListOfSkills1();
		
	}

	@Test(priority = 18, groups = { "regression" })
	public void DomainSkills() throws InterruptedException {
		System.out.println("TestCase:3.6");
		Upload.ClickDomain();
	}

	@Test(priority = 19, groups = { "regression" })
	public void ListOfDomain() throws InterruptedException, IOException {
		System.out.println("TestCase:3.7");
		Upload.ListOfSkills2();
	}

	@Test(priority = 20, groups = { "smoke" })
	public void FunctionalSKills() throws InterruptedException {
		System.out.println("TestCase:3.8");
		Upload.ClickFunctional();
	}

	@Test(priority = 21, groups = { "regression" })
	public void ListOfTech3() throws InterruptedException, IOException {
		System.out.println("TestCase:3.9");
		Upload.ListOfSkills3();
	}

	@Test(priority = 22, groups = { "regression" })
	public void BehavioralSkills() throws InterruptedException {
		System.out.println("TestCase:3.10");
		Upload.ClickBehavioral();
		
	}

	@Test(priority = 23, groups = { "smoke" })
	public void ListOfTech4() throws IOException {
		System.out.println("TestCase:3.11");
		Upload.ListOfSkills4();
	}

	// SkillProfile TestCase4

	@Test(priority = 24, groups = { "regression" })
	public void MySkillPath() {
		System.out.println("SkillProfile TestCase:4.1");
		skillprofile = new SkillProfile(driver);
		skillprofile.ClickMySkillPath();
	}

	@Test(priority = 25, groups = { "regression" })
	public void OrgAssigned() {
		System.out.println("TestCase:4.2");
		skillprofile.ClickOrgAssigned();
	}

	@Test(priority = 26, groups = { "smoke" })
	public void ScrollDownCTS() {
		System.out.println("TestCase:4.3");
		skillprofile.ScrollDownToCTS();
	}

	@Test(priority = 27, groups = { "smoke" })
	public void supplementorySkills() throws InterruptedException {
		System.out.println("TestCase:4.4");
		skillprofile.SupplementorySkills();
	}

	@Test(priority = 28, groups = { "regression" })
	public void SkillingPath() throws InterruptedException {
		System.out.println("TestCase:4.5");
		skillprofile.SelectSkillingPath();

	}

	@Test(priority = 29, groups = { "smoke" })
	public void Clusters() throws InterruptedException {
		System.out.println("TestCase:4.6");
		skillprofile.ClustersSkills();

	}
	
	//SkillUp TestCase 5

	@Test(priority = 30, groups = { "smoke" })
	public void NavigateToSkillUp() throws InterruptedException {
		System.out.println("SkillUp TestCase:5.1");
		skillup = new SkillUp(driver);
		skillup.NavigateToSKillUp();

	}

	@Test(priority = 31, groups = { "regression" })
	public void FrameSwitch() throws InterruptedException {
		System.out.println("TestCase:5.2");
		skillup.FrameSwitchInSKillUp();
	}

	@Test(priority = 32, groups = { "regression" })
	public void Scroll() throws InterruptedException {
		System.out.println("TestCase:5.3");
		skillup.Scrolling();
	}

	@Test(priority = 33, groups = { "smoke" })
	public void AquiredSkills() throws InterruptedException {
		System.out.println("TestCase:5.4");
		skillup.AquireSkills();
	}

}
