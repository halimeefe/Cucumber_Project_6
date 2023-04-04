package StepDefinitions;

import Pages.ParaBankCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCodeSteps {

     ParaBankCodePage cp=new ParaBankCodePage();

    @When("enter valid username  as {string}and password  as {string}and click login button")
    public void enterValidUsernameAsAndPasswordAsAndClickLoginButton(String username, String password) {
        cp.sendKeysFunction(cp.userNameInpt,username);
        cp.sendKeysFunction(cp.passwordInpt,password);
        cp.clickFunction(cp.loginClick);

    }

    @Then("verify login success")
    public void verifyLoginSuccess() {
        cp.Assertion(cp.verifyLogin,"Accounts");

    }

    @And("click logoutlink")
    public void clickLogoutlink() {
        cp.clickFunction(cp.logoutlink);
    }


    @When("enter invalid username as{string}and password{string} and click login button")
    public void enterInvalidUsernameAsAndPasswordAndClickButton(String invalidusername, String invalidpassword) {
        cp.sendKeysFunction(cp.userNameInpt,invalidusername);
        cp.sendKeysFunction(cp.passwordInpt,invalidpassword);
        cp.clickFunction(cp.loginClick);

    }

    @Then("verify no login")
    public void verifyNoLogin() {
        cp.Assertion(cp.verifynologin,"error");

    }


}
















