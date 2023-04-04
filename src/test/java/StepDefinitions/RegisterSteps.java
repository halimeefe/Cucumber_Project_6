package StepDefinitions;

import Pages.ParaBankCodePage;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

   ParaBankCodePage cp=new ParaBankCodePage();
    @Given("Navigate to parabank")
    public void navigate_to_parabank() {
        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

        BaseDriver.getDriver().manage().window().maximize();


    }
    @When("Click register link")
    public void click_register_link() {
        cp.clickFunction(cp.registerlink);

    }

    @When("Enter valid information")
    public void enter_valid_information() {
        cp.sendKeysFunction(cp.nameInput, "Halime");
        cp.sendKeysFunction(cp.lastNameInput, "Efe");
        cp.sendKeysFunction(cp.adress, "x mh. x cd. no:13");
        cp.sendKeysFunction(cp.city, "istanbul");
        cp.sendKeysFunction(cp.state, "Türkiye");
        cp.sendKeysFunction(cp.zipCode, "010101");
        cp.sendKeysFunction(cp.phoneNumber, "555897411");
        cp.sendKeysFunction(cp.ssn, "0147852369");
        cp.sendKeysFunction(cp.userNameInput, "Samihan");
        cp.sendKeysFunction(cp.passwordInput, "665312");
        cp.sendKeysFunction(cp.confirmPassword, "665312");

    }

    @When("Click register button")
    public void click_register_button() {
        cp.clickFunction(cp.registerButton);
    }

    @Then("verify  success message")
    public void verify_success_message() {
        cp.Assertion(cp.successMessage, "account was created successfully");

    }
}
