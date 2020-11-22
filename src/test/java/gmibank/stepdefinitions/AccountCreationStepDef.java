package gmibank.stepdefinitions;

import gmibank.pages.AccountCreation;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountCreationStepDef {
    AccountCreation newAccount = new AccountCreation();

    @Given("the user goes to account creation page")
    public void the_user_goes_to_account_creation_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("account_url"));
    }

    @Given("the user clicks new account creation button")
    public void the_user_clicks_new_account_creation_button() {
        Driver.waitAndClick(newAccount.accountCreationButton,5);
    }

    @Given("the user goes to new account creation page")
    public void the_user_goes_to_new_account_creation_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("accountCreation_url"));
    }

    @When("user leaves the description text box empty")
    public void user_leaves_the_description_text_box_empty() {
        Driver.waitAndSendText(newAccount.description,"",5);
    }

    @Then("verify required description message")
    public void verify_required_description_message() {
        Assert.assertTrue(Driver.waitAndGetText(newAccount.requiredDescripMessage,5).contains("is required"));
    }

    @When("user clicks Account Type dropdown")
    public void user_clicks_Account_Type_dropdown() {
        Driver.waitAndClick(newAccount.accountTypeDropdown,5);

    }

    @Then("verify all options are seen on the Account Type dropdown")
    public void verify_all_options_are_seen_on_the_Account_Type_dropdown() {
        Select select = new Select(newAccount.accountTypeDropdown);
        List<WebElement> list = select.getOptions();
        boolean flag;
        for (WebElement webElement : list) {
            String option = webElement.getText();
            if (option.equals("CHECKING")||option.equals("SAVING")||option.equals("CREDIT_CARD")||option.equals("INVESTING")) {
                flag= true;
            } else {
                flag = false;
            }
            Assert.assertTrue(flag);

        }
    }

    @When("user clicks Account Status Type dropdown")
    public void user_clicks_Account_Status_Type_dropdown() {
       Driver.waitAndClick(newAccount.accountStatusDropdown,5);
    }

    @Then("verify all options are seen on the Account Status Type dropdown")
    public void verify_all_options_are_seen_on_the_Account_Status_Type_dropdown() {
        Select select = new Select(newAccount.accountStatusDropdown);
        List<WebElement> list = select.getOptions();
        boolean flag;
        for (WebElement webElement : list) {
            String option = webElement.getText();
            if (option.equals("ACTIVE")||option.equals("SUSPENDED")||option.equals("CLOSED")) {
                flag= true;
            } else {
                flag = false;
            }
            Assert.assertTrue(flag);

        }
    }

    @When("user clicks employee dropdown")
    public void user_clicks_employee_dropdown() {
       Driver.waitAndClick(newAccount.employeeDropdown,5);
    }

    @Then("verify all options are seen on the employee dropdown")
    public void verify_all_options_are_seen_on_the_employee_dropdown() {
       Select select = new Select(newAccount.employeeDropdown);
       List<WebElement> list = select.getOptions();
       Assert.assertTrue(list.size()>1);

    }

    @When("user enters description {string}")
    public void user_enters_description(String description) {
        Driver.waitAndSendText(newAccount.description,description,5);
    }

    @When("user enters balance {string}")
    public void user_enters_balance(String balance) {
        newAccount.balance.sendKeys(balance);
    }

    @When("user selects account type {string}")
    public void user_selects_account_type(String accountType) {
        Driver.waitAndSelect(newAccount.accountTypeDropdown,accountType,5);
    }

    @When("user selects account status type {string}")
    public void user_selects_account_status_type(String accountStatus) {
        Driver.waitAndSelect(newAccount.accountStatusDropdown,accountStatus,5);
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        Driver.waitAndClick(newAccount.saveButton,5);
    }

    @Then("verify account creation is successful")
    public void verify_account_creation_is_successful() {
        Driver.waitForVisibility((newAccount.creationSuccessMessage),5);
    }





}
