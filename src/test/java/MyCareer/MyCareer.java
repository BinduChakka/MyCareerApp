package MyCareer;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCareer {
	public WebDriver driver;
	Driversetup ds = new Driversetup();

	public void test() throws IOException, InterruptedException {
		this.driver = ds.driverSet();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximise browser window

		driver.manage().window().maximize();

		// TestCase1
		// open Application
		// OneCognizantPortal

		driver.get("https://onecognizant.cognizant.com/Home?GlobalAppId=926");

		// Scrolldown
		WebElement Elements = driver.findElement(By.xpath("//*[text()='Hot Apps']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Elements);
		System.out.println("Scrolled till Hot Apps");

		// click My Career
		driver.findElement(By.xpath("//*[text()='MyCareer']")).click();
		System.out.println("My Career is clicked");

		// Alert
		// Alert alert = driver.switchTo().alert();
		// alert.accept();

		// Frame switching

		WebElement frame1 = driver.findElement(By.id("appFrame"));
		driver.switchTo().frame(frame1);
		System.out.println("Frame1 is switched");

		// click arrow
		driver.findElement(By.xpath("//*[text()=\"Career Lattice & Role Description\"]")).click();
		System.out.println("Arrow is clicked");

		// Switch frame
		WebElement frame2 = driver.findElement(By.name("content"));
		driver.switchTo().frame(frame2);
		System.out.println("Frame2 is switched");

		// Service Line

		WebElement servicelineText = driver.findElement(By.xpath("//*[text()=\"Quality Engineering & Assurance\"]"));

		if (servicelineText.isDisplayed()) {
			System.out.println("ServiceLine Quality Engineering & Assurance is displayed");
		}

		else
			System.out.println("ServiceLine Quality Engineering & Assurance is not displayed");

		// Switch back
		driver.switchTo().defaultContent();
		System.out.println("Frame3 is switched");
		Thread.sleep(5000);

		// CLick MyCareer
		driver.findElement(By.xpath("//*[text()=\"MyCareer\"]")).click();
		System.out.println("Clicked");
		Thread.sleep(5000);

		// Navigate
		driver.navigate().to("https://cognizantmyskills.prismforce.ai/home");
		System.out.println("Navigated");
		Thread.sleep(5000);

		// Window handel
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		Thread.sleep(5000);

		// My skills
		driver.findElement(By.xpath("//*[text()=\"engineering\"]")).click();
		System.out.println("Clicked on My Skills");

		// Technical
		driver.findElement(By.xpath("//*[text()=\"Technical (7)\"]")).click();

		// list of skills

		List<WebElement> Technical_skills = driver
				.findElements(By.xpath("//div[@class=\"truncate-skill label black\"]"));

		for (WebElement skills1 : Technical_skills) {
			System.out.println(skills1.getText());

		}

		Thread.sleep(5000);

		// Domain

		driver.findElement(By.xpath("//*[text()=\"Domain (2)\"]")).click();

		// List of domain

		List<WebElement> Domain_Skills = driver.findElements(By.xpath("//div[@class=\"name body black\"]"));

		for (WebElement skills2 : Domain_Skills) {
			System.out.println(skills2.getText());
		}

		// functional

		driver.findElement(By.xpath("//*[text()=\"Functional (1)\"]")).click();

		// List of functional
		List<WebElement> Functional_Skills = driver.findElements(By.xpath("//*[text()=\"Quality Assurance\"]"));

		for (WebElement skills3 : Functional_Skills) {
			System.out.println(skills3.getText());
		}

		// Behavioral

		driver.findElement(By.xpath("//*[text()=\"Behavioral (1)\"]")).click();

		// List of Behavioral
		List<WebElement> Behavioral_Skills = driver.findElements(By.xpath("//*[text()=\"Communication\"]"));

		for (WebElement skills4 : Behavioral_Skills) {
			System.out.println(skills4.getText());
		}

		// Click My skilling path

		driver.findElement(By.xpath("//div[@class=\"menu-con ng-tns-c300-9 ng-star-inserted\"]")).click();

		// ScrollDown

		WebElement Elements1 = driver.findElement(By.xpath("//*[text()=\" CITS \"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", Elements1);
		System.out.println("Scrolled Successfully");

		// List of supplementary skills

		List<WebElement> Supplementary_Skills = driver
				.findElements(By.xpath("//div[@class=\"proficiency-skill-name\"]"));

		for (WebElement skills5 : Supplementary_Skills) {
			System.out.println(skills5.getText());
		}

		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		MyCareer obj = new MyCareer();
		obj.test();

	}
}