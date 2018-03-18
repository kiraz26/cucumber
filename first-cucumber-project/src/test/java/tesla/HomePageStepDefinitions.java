package tesla;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDefinitions {

	WebDriver driver;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am going to the www.tesla.com");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://tesla.com");

	}

	@When("^I click on the model S link$")
	public void i_click_on_the_model_S_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on the Model S link");

		driver.findElement(By.linkText("MODEL S")).click();
	}

	@Then("^Model S home page should be displayed$")
	public void model_S_home_page_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Verifying the Model S homepage");

		Assert.assertTrue(driver.getTitle().contains("Model S"));
	}

	@When("^I click on Roadster link$")
	public void i_click_on_Roadster_link() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("ROADSTER")).click();
	}

	@Then("^Roadster home page should be displayed$")
	public void roadster_home_page_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getTitle().contains("Roadster"));
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() {
	    driver.close();
	}

	@When("^I click on Model (\\d+) link$")
	public void i_click_on_Model_link(int arg1) {
		driver.findElement(By.linkText("MODEL 3")).click();
	}

	@Then("^Model (\\d+) home page should be displayed$")
	public void model_home_page_should_be_displayed(int arg1) {
		Assert.assertTrue(driver.getTitle().contains("Model 3"));
	}

}
