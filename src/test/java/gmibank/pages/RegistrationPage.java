package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage()

    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="ssn")
    public WebElement sSN;

    @FindBy(name="firstname")
    public WebElement firstName;

    @FindBy(name="lastname")
    public WebElement lastName;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilePhone;

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="firstPassword")
    public WebElement password;

    @FindBy(id="secondPassword")
    public WebElement passwordCon;

    @FindBy(id="register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'Registration saved')]")
    public WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'SSN is required')]")
    public WebElement requiredSSNMessage;

    @FindBy(xpath = "//*[contains(text(),'First Name is required')]")
    public WebElement requiredFirstnameMessage;

    @FindBy(xpath = "//*[contains(text(),'Last Name is required')]")
    public WebElement requiredLastnameMessage;

    @FindBy(xpath = "//*[contains(text(),'username is required')]")
    public WebElement requiredUsernameMessage;

    @FindBy(xpath = "//*[contains(text(),'email is required')]")
    public WebElement requiredEmailMessage;

    @FindBy(xpath = "//*[contains(text(),'password is required')]")
    public WebElement requiredPasswordMessage;

    @FindBy(xpath = "//*[contains(text(),'confirmation password is required')]")
    public WebElement requiredConPasswordMessage;

    @FindBy(xpath = "//*[contains(text(),'SSN is invalid')]")
    public WebElement invalidSSNMessage;

    @FindBy(xpath = "//*[contains(text(),'phone number is invalid')]")
    public WebElement invalidPhoneNumberMessage;

    @FindBy(xpath = "//*[contains(text(),'field is invalid')]")
    public WebElement invalidEmailMessage;



}
