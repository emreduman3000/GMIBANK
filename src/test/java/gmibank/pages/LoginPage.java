package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernamebox;
    @FindBy(id = "password")
    public WebElement passwordbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement cancelButton;
    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement forgetPassword;
    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[4]/a/span")
    public WebElement registerNewAccount;
    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement errorMessage;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/h1/span")
    public WebElement newPageVerify;
    @FindBy(id = "email")
    public WebElement emailTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement resetButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement verifyMessage;
    @FindBy(xpath = "//h1[@id='register-title']/span")
    public WebElement registrationPage;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement signOut;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/a/button")
    public WebElement signInAgain;

    @FindBy(xpath = "//*[contains(text(),'My Operations')]")
    public WebElement myOperations;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement manageCustomers;

    @FindBy(tagName = "th")
    public WebElement allInformationHeader;

    @FindBy(linkText = "(//*[contains(text(),'View')])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//*[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//*[contains(text(),'Create or edit a Customer')]")
    public WebElement verifyPage;

    @FindBy(id = "jh-create-entity")
    public WebElement editPortal;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[contains(text(),'Confirm delete operation')]")
    public WebElement confirmDeleteOperation;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement deleteCancelButton;

    @FindBy(xpath = "(//*[contains(text(),'Customer')])[2]")
    public WebElement verifyCustomer;




}
