package gmibank.stepdefinitions;

import gmibank.pages.CreateOrEditANewCustomer;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewApplicantInfoStepDefinitions {
    CreateOrEditANewCustomer createOrEditANewCustomer = new CreateOrEditANewCustomer();
    LoginPage loginPage = new LoginPage();

    @Given("the user goes to gmi_login_url and signs in as an Employee")
    public void the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
        loginPage.login(ConfigurationReader.getProperty("employee_id"),ConfigurationReader.getProperty("employee_password"));
    }

    @When("user navigates to My operations")
    public void user_navigates_to_My_operations() {
        createOrEditANewCustomer.myOperations.click();
    }

    @When("user choose Manage Customer Option")
    public void user_choose_Manage_Customer_Option() {
        createOrEditANewCustomer.manageCustomers.click();
    }

    @When("user click Create a new Customer button")
    public void user_click_Create_a_new_Customer_button() {
        createOrEditANewCustomer.createNewCustomer.click();
    }

    @When("user click the SSN Text box and properly types the SSN of a new applicant with dashes")
    public void user_properly_types_the_SSN_of_a_new_applicant_with_dashes() {
        createOrEditANewCustomer.ssn.sendKeys(ConfigurationReader.getProperty("new_Applicant_SSN"));
    }

    @When("user goes to search button and clicks")
    public void user_goes_to_search_button_and_clicks() {
        createOrEditANewCustomer.searchButton.click();
    }

    @Then("user should be able to see the new applicant's all registration info")
    public void user_should_be_able_to_see_the_new_applicant_s_all_registration_info() {
            }

    @Then("the page displays First Name info")
    public void the_page_displays_First_Name_info() {
        Assert.assertTrue(createOrEditANewCustomer.firstName.isDisplayed());
    }

    @Then("the page displays Last Name info")
    public void the_page_displays_Last_Name_info() {
        Assert.assertTrue(createOrEditANewCustomer.lastName.isDisplayed());
    }

    @Then("the page displays Address info")
    public void the_page_displays_Address_info() {
        Assert.assertTrue(createOrEditANewCustomer.address.isDisplayed());
    }

    @Then("the page displays Mobile Phone Number info")
    public void the_page_displays_Mobile_Phone_Number_info() {
        Assert.assertTrue(createOrEditANewCustomer.mobilePhoneNumber.isDisplayed());
    }
    @Then("the page displays Email info")
    public void the_page_displays_Email_info()  {
        Assert.assertTrue(createOrEditANewCustomer.email.isDisplayed());
    }

    @Then("the page displays Username info")
    public void the_page_displays_Username_info() {
        List<WebElement> list = Driver.getDriver().findElements(By.tagName("label"));
        boolean flag = true;
        for (WebElement webElement : list) {
            String label = webElement.getText();
            if (label.equals("Username")) {
                System.out.println("Username info is labelled");
            } else {
                System.out.println("Username info is missing");
                flag = false;
            }
            Assert.assertTrue(flag);

        }
    }
}
