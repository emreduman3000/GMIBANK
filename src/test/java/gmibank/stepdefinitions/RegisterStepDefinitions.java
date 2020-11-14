package gmibank.stepdefinitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RegisterStepDefinitions {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on the GMIBank registration page")
    public void user_is_on_the_GMIBank_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("register_url"));
    }

    @When("user enters valid SSN {string}")
    public void user_enters_valid_SSN(String ssn) {
        Driver.waitAndSendText(registrationPage.sSN,ssn,5);

    }

    @When("user enters valid first name {string}")
    public void user_enters_valid_first_name(String firstname) {
        Driver.waitAndSendText(registrationPage.firstName,firstname,5);

    }

    @When("user enters valid last name {string}")
    public void user_enters_valid_last_name(String lastname) {
        Driver.waitAndSendText(registrationPage.lastName,lastname,5);

    }

    @When("user enters valid address {string}")
    public void user_enters_valid_address(String address) {
        Driver.waitAndSendText(registrationPage.address,address,5);

    }

    @When("user enters valid mobile phone number {string}")
    public void user_enters_valid_mobile_phone_number(String pNumber) {
        Driver.waitAndSendText(registrationPage.mobilePhone,pNumber,5);

    }

    @When("user enters valid Username {string}")
    public void user_enters_valid_Username(String username) {
        Driver.waitAndSendText(registrationPage.userName,username,5);

    }

    @When("user enters valid Email {string}")
    public void user_enters_valid_Email(String email) {
        Driver.waitAndSendText(registrationPage.email,email,5);

    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String password) {
        Driver.waitAndSendText(registrationPage.password,password,5);

    }

    @When("user enters password confirmation {string}")
    public void user_enters_password_confirmation(String password) {
        Driver.waitAndSendText(registrationPage.passwordCon,password,5);

    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        Driver.waitAndClick(registrationPage.registerButton,5);

    }

    @Then("verify the user's registration is successful")
    public void verify_the_user_s_registration_is_successful() {
        Driver.waitForVisibility((registrationPage.successMessage), 5);

    }

    @When("user leave SSN text box empty")
    public void user_leave_SSN_text_box_empty() {
        Driver.waitAndSendText(registrationPage.sSN,"",10);
    }

    @Then("verify required SSN message")
    public void verify_required_SSN_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredSSNMessage,10).contains("SSN is required"));

    }

    @When("user leave firstname text box empty")
    public void user_leave_firstname_text_box_empty() {
        Driver.waitAndSendText(registrationPage.firstName,"",10);
    }

    @Then("verify required firstname  message")
    public void verify_required_firstname_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredFirstnameMessage,10).contains("First Name is required"));
    }

    @When("user leave lastname text box empty")
    public void user_leave_lastname_text_box_empty() {
        Driver.waitAndSendText(registrationPage.lastName,"",10);
    }

    @Then("verify required lastname message")
    public void verify_required_lastname_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredLastnameMessage,10).contains("Last Name is required"));

    }

    @When("user leave username text box empty")
    public void user_leave_username_text_box_empty() {
        Driver.waitAndSendText(registrationPage.userName,"",10);
    }

    @Then("verify required username message")
    public void verify_required_username_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredUsernameMessage,10).contains("username is required"));

    }

    @When("user leave email text box empty")
    public void user_leave_email_text_box_empty() {
        Driver.waitAndSendText(registrationPage.email,"",10);
    }

    @Then("verify required email message")
    public void verify_required_email_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredEmailMessage,10).contains("email is required"));

    }

    @When("user leave password text box empty")
    public void user_leave_password_text_box_empty() {
        Driver.waitAndSendText(registrationPage.password,"",10);
    }

    @Then("verify required password message")
    public void verify_required_password_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredPasswordMessage,10).contains("password is required"));

    }

    @When("user leave confirmation password text box empty")
    public void user_leave_confirmation_password_text_box_empty() {
        Driver.waitAndSendText(registrationPage.passwordCon,"",10);
    }

    @Then("verify required confirmation password message")
    public void verify_required_confirmation_password_message() {
        Assert.assertTrue(Driver.waitAndGetText(registrationPage.requiredConPasswordMessage,10).contains("confirmation password is required"));

    }

    @When("user enter invalid SSN")
    public void user_enter_invalid_SSN() {
        registrationPage.sSN.sendKeys("aaa-cc-bbbb", Keys.ENTER);

    }

    @Then("verify invalid SSN message")
    public void verify_invalid_SSN_message() {
        Assert.assertTrue(registrationPage.invalidSSNMessage.getText().contains("SSN is invalid"));

    }

    @When("user enter invalid Mobilephone number")
    public void user_enter_invalid_Mobilephone_number() {
        registrationPage.mobilePhone.sendKeys("770-abc-1010",Keys.ENTER);

    }

    @Then("verify invalid Mobilephone number message")
    public void verify_invalid_Mobilephone_number_message() {
        Assert.assertTrue(registrationPage.invalidPhoneNumberMessage.getText().contains("phone number is invalid"));

    }

    @When("user enter invalid email")
    public void user_enter_invalid_email() {
        registrationPage.email.sendKeys("tester001@a.b",Keys.ENTER);

    }

    @Then("verify invalid email message")
    public void verify_invalid_email_message() {
        Assert.assertTrue(registrationPage.invalidEmailMessage.getText().contains("field is invalid"));

    }
}
