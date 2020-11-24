package gmibank.stepdefinitions;

import gmibank.pages.CustomerCreation;
import gmibank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CustomerCreationStepDefinition {
    CustomerCreation customerCreation = new CustomerCreation();
    LoginPage loginPage = new LoginPage();

    @Given("user clicks on the username textbox and enter the employee username")
    public void user_clicks_on_the_username_textbox_and_enter_the_employee_username() {
        loginPage.usernamebox.click();
        loginPage.usernamebox.sendKeys("group8employee");
    }

    @Given("user clicks on the password textbox and enter the employee password")
    public void user_clicks_on_the_password_textbox_and_enter_the_employee_password() {
        loginPage.passwordbox.click();
        loginPage.passwordbox.sendKeys("group8employee");
    }

    @Given("user clicks on My Operations")
    public void user_clicks_on_My_Operations() {
        customerCreation.MyOperations.click();
    }

    @Given("click on Manage Customers")
    public void click_on_Manage_Customers() {
        customerCreation.ManageCustomers.click();

    }

    @Given("click on Create a new Customer")
    public void click_on_Create_a_new_Customer() {
        customerCreation.CreateCustomer.click();

    }

    @Given("user clicks on create date box")
    public void user_clicks_on_create_date_box() {
        customerCreation.createdate.click();

    }

    @Given("enter a date earlier than the time of creation a customer")
    public void enter_a_date_earlier_than_the_time_of_creation_a_customer() {
        customerCreation.createdate.sendKeys("11112018");
        customerCreation.createdate.sendKeys(Keys.TAB);
        customerCreation.createdate.sendKeys("0300PM");

    }

    @Then("verify if it is an invalid input")
    public void verify_if_it_is_an_invalid_input() {
        String isDateValid = customerCreation.createdate.getAttribute("class");
        System.out.println(isDateValid);
        Assert.assertFalse(isDateValid.contains("av-valid form"));


    }

    @Given("user clicks on zelle enrolled")
    public void user_clicks_on_zelle_enrolled() {
        customerCreation.zelle.click();


    }

    @Then("verify if zelle enrolled is true")
    public void verify_if_zelle_enrolled_is_true() {
        String valueOfZelle = customerCreation.zelle.getAttribute("value");
        Assert.assertTrue(valueOfZelle.contains("true"));


    }

    @Given("user selects a user from dropdown")
    public void user_selects_a_user_from_dropdown() {
        Select select = new Select(customerCreation.userDropDown);
        select.selectByIndex(5);

    }

    @Then("verify if selected user is valid")
    public void verify_if_selected_user_is_valid() {
        Select select = new Select(customerCreation.userDropDown);
        select.selectByIndex(6);
        WebElement option = select.getFirstSelectedOption();
        List<WebElement> options = select.getOptions();
        boolean flag = false;
        for(WebElement w: options) {
            System.out.println(w.getText());

            if(w.equals(option)) {
                flag = true;
                break;
            }
        }
        Assert.assertTrue(flag);

    }

    @Given("user leaves user box empty")
    public void user_leaves_user_box_empty() {
        Select select = new Select(customerCreation.userDropDown);
        select.selectByVisibleText("");
        String selectedOption = select.getFirstSelectedOption().getText();
    }

    @Then("verify user box can not be blank")
    public void verify_user_box_can_not_be_blank() {
        Select select = new Select(customerCreation.userDropDown);
        select.selectByVisibleText("");
        WebElement selectedOption = select.getFirstSelectedOption();
        Assert.assertNotNull(selectedOption);

    }

    @Given("user selects an account from account dropdown")
    public void user_selects_an_account_from_account_dropdown() {
        Select select = new Select(customerCreation.accountDropDown);
        select.selectByIndex(6);

    }

    @Then("verify if selected account is valid")
    public void verify_if_selected_account_is_valid() {
        Select select = new Select(customerCreation.accountDropDown);
        select.selectByIndex(6);
        WebElement option = select.getFirstSelectedOption();
        List<WebElement> options = select.getOptions();
        boolean flag = false;
        for(WebElement w: options) {
            System.out.println(w.getText());

            if(w.equals(option)) {
                flag = true;
                break;
            }
        }
        Assert.assertTrue(flag);



    }


}
