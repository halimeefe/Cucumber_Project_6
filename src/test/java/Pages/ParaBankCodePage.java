package Pages;

import Utilities.BaseDriver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class ParaBankCodePage extends AbstractClass {
    public ParaBankCodePage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerlink;

    @FindBy(css = "input[id='customer.firstName']")
    public WebElement nameInput;

    @FindBy(css = "input[id='customer.lastName']")
    public WebElement lastNameInput;

    @FindBy(css = "input[id='customer.address.street']")
    public WebElement adress;

    @FindBy(css = "input[id='customer.address.city']")
   public WebElement city;

    @FindBy(css = "input[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "input[id='customer.address.zipCode']")
    public WebElement zipCode ;

    @FindBy(css = "input[id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "input[id='customer.ssn']")
    public WebElement ssn;

    @FindBy(css = "input[id='customer.username']")
    public WebElement userNameInput;

    @FindBy(css = "input[id='customer.password']")
    public WebElement passwordInput;

    @FindBy(css = "input[id='repeatedPassword']")
    public WebElement confirmPassword;

    @FindBy(css = "input[value='Register']")
    public WebElement registerButton;


    @FindBy(css = "div[id='rightPanel']>p")
    public WebElement successMessage;

    @FindBy(css = "input[name='username']")
    public WebElement userNameInpt;

    @FindBy(css = "input[name='password']")
    public WebElement passwordInpt;

    @FindBy(css = "input[value='Log In']")
    public WebElement loginClick;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logout;

    @FindBy(css = "div[class='ng-scope']>h1")
    public WebElement verifyLogin;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logoutlink;

    @FindBy(css = "div[id='rightPanel']>p")
    public  WebElement verifynologin;

    @FindBy (xpath = "//h1[@class='title']")
    public WebElement loginSuccess;

    @FindBy(xpath = "//*[text()='Bill Pay']")
    public WebElement billPayLink;

    @FindBy(css = "[name='payee.name']")
    public WebElement payName;

    @FindBy(css = "[name='payee.address.street']")
    public WebElement payAdress;

    @FindBy(css = "[name='payee.address.city']")
    public WebElement payCity;

    @FindBy(css = "[name='payee.address.state']")
    public WebElement payState;

    @FindBy(css = "[name='payee.address.zipCode']")
    public WebElement payZipcode;

    @FindBy(css = "[name='payee.phoneNumber']")
    public WebElement payPhone;

    @FindBy(css = "[name='payee.accountNumber']")
    public WebElement payAccountNum;

    @FindBy(css = "[name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(css = "[name='amount']")
    public WebElement payAmount;

    @FindBy(css = "[value='Send Payment']")
    public WebElement paySent;

   @FindBy (xpath = "(//*[@class='title'])[2]")
    public WebElement verifyPayment;




}

