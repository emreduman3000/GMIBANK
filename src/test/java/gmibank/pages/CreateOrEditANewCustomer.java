package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrEditANewCustomer {
    public CreateOrEditANewCustomer(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;
    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;
    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;
    @FindBy( xpath ="//label[@for='search-ssn']")
    public WebElement ssnLabel;
    @FindBy(id = "search-ssn")
    public WebElement ssn;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;
   @FindBy( xpath ="//*[@id=\"firstNameLabel\"]")
   public WebElement firstNameLabel;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy( xpath ="//*[@id=\"lastNameLabel\"]")
    public WebElement lastNameLabel;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy( xpath ="//*[@id=\"emailLabel\"]")
    public WebElement emailLabel;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy( xpath ="//*[@id=\"mobilePhoneNumberLabel\"]")
    public WebElement mobilePhoneNumberLabel;
    @FindBy(xpath = "//*[@id=\"tp-customer-mobilePhoneNumber\"]")
    public WebElement mobilePhoneNumber;
    @FindBy( xpath ="//*[@id=\"addressLabel\"]")
    public WebElement addressLabel;
    @FindBy(xpath = "//*[@id=\"tp-customer-address\"]")
    public WebElement address;
    @FindBy( tagName ="label")
    public WebElement labels;


}
