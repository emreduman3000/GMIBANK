package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation {
    public AccountCreation() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "tp-account-description")
    public WebElement description;

    @FindBy(xpath = "(//*[contains(text(),'is required')])[1]")
    public WebElement requiredDescripMessage;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    @FindBy(xpath = "(//*[contains(text(),'is required')])[2]")
    public WebElement requiredBalanceMessage;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDate;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDate;

    @FindBy(id = "tp-account-employee")
    public WebElement employeeDropdown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement creationSuccessMessage;

    @FindBy(id="jh-create-entity")
    public WebElement accountCreationButton;
}