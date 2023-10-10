package stepDefinitions;


import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPageSteps {

	LoginPage lp = new LoginPage();
	
	@Given("user goes to login page")
	public void user_goes_to_login_page() {
		System.out.println("login page");
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@When("user provides username and password")
	public void user_provides_username_and_password() {
		System.out.println("username and password given");
		Driver.waitAndSendText(lp.username, "ibrahim");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {

	}

}
