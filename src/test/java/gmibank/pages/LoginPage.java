package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() { PageFactory.initElements(Driver.getDriver(),this); }
        public void login( String user_id, String user_pass) {
//            Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
            Driver.waitAndSendText(usernamebox,user_id,5);
            Driver.waitAndSendText(passwordbox,user_pass,5);
            Driver.waitAndClick(signInButton,5);

        }

    @FindBy(id = "username")
    public static WebElement usernamebox;
    @FindBy(id = "password")
    public static WebElement passwordbox;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signInButton;
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
    @FindBy (xpath = "//*[.='Sign out']")
    public WebElement signOutButton;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement userIcon;


}
