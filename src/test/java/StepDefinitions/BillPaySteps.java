package StepDefinitions;

import Pages.ParaBankCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class BillPaySteps {

    ParaBankCodePage cp=new ParaBankCodePage();


    @When("click the BillPay link")
    public void clickTheBillPayLink() {
        cp.clickFunction(cp.billPayLink);
    }

    @And("pay  the bills {string}")
    public void payTheBills(String arg0) {
        cp.sendKeysFunction(cp.payName,"Halime");
        cp.sendKeysFunction(cp.payAdress,"virginia street");
        cp.sendKeysFunction(cp.payCity,"sugar land");
        cp.sendKeysFunction(cp.payState,"virginia");
        cp.sendKeysFunction(cp.payZipcode,"123456");
        cp.sendKeysFunction(cp.payPhone,"05564789");
        cp.sendKeysFunction(cp.payAccountNum,"789456");
        cp.sendKeysFunction(cp.verifyAccount,"789456");
        cp.sendKeysFunction(cp.payAmount,arg0);
        cp.clickFunction(cp.paySent);


    }

    @Then("verify that bills have been  paid")
    public void verifyThatBillsHaveBeenPaid() {
        cp.Assertion(cp.verifyPayment,"Payment");
    }


    }

