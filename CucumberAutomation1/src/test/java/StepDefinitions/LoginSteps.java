package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("Inside step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside step - user enters username & password");
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - user clicks on login button");
	}

	@And("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside step - user is navigated to the home page");
	}

	//27:00
}
