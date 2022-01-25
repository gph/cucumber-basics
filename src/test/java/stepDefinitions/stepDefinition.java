package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("User is on NetBanking page")
	public void user_is_on_net_banking_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given: netbanking page");
	}
	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When: Username: "+ username + " Password: " + password);
	}
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then: home page validation");
	}
	@And("Cards displayed are {string}")
	public void cards_displayed_are(String bool) {
	    // Write code here that turns the phrase above into concrete actions
		if(bool.equals("true"))
		{
			System.out.println("And: Cards are displayed!");
		}
		else
		{
			System.out.println("And: Cards are not displayed!");
		}
	}
}