package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

    public CustomerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(text(),'My Operations')]")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement manageCustomers;

    @FindBy(xpath = "(//*[contains(text(),'View')])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "(//*[contains(text(),'Edit')])[1]")
    public WebElement editButton;


    @FindBy(xpath = "(//*[contains(text(),'Delete')])[1]")
    public WebElement deleteButton;


    @FindBy(xpath = "(//*[contains(text(),'Customer')])[2]")
    public WebElement verifyViewButton;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/a[2]")
    public WebElement viewEdit;

    @FindBy(xpath = "//*[contains(text(),'Create or edit a Customer')]")
    public WebElement verifyEditPage;

    @FindBy(xpath = "//*[contains(text(),'Confirm delete operation')]")
    public WebElement deleteMessage;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement deleteCancel;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createCustomer;


}
