package StepDefintion;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {
	
	WebDriver driver;
	@Given("I am able to navigate on to the login page")
	public void i_am_able_to_navigate_on_to_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BudithiAmrutha\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtUsername")).sendKeys(string);
	}


	@When("I enter Password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on Login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I should see username as {string}")
	public void i_should_see_username_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String name = driver.findElement(By.id("welcome")).getText();
		String Actualdata ="Welcome Hansika";
		Assert.assertEquals(name, Actualdata);
		System.out.println("login successful");
		Thread.sleep(3000);
		driver.close();
	   
	}
	@Then("I should see error message as {string}")
	public void i_should_see_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String actualerr = driver.findElement(By.id("welcome")).getText();
		String expectederr = "Invalid Credentials";
		Assert.assertEquals(actualerr, expectederr);
		System.out.println("Invalid Credentials");
	}
	
}
