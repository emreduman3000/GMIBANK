package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_18StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the sign in")
    public void user_is_on_the_sign_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
        loginPage.usernamebox.sendKeys(ConfigurationReader.getProperty("employee_id"));
        loginPage.passwordbox.sendKeys(ConfigurationReader.getProperty("employee_password"));
        loginPage.signInButton.click();
    }

    @Given("navigate to manage customers")
    public void navigate_to_manage_customers() {
        loginPage.myOperations.click();
        loginPage.manageCustomers.click();

    }

    @Given("Find the total number of rows and cells in the table body")
    public void find_the_total_number_of_rows_and_cells_in_the_table_body() {
        List<WebElement> table = Driver.getDriver().findElements(By.xpath("//tbody//td"));
        System.out.println("The size of the table body is ===>> " + table.size());
    }

    @Given("Print headers, rows, and cells")
    public void print_headers_rows_and_cells() {
        List<WebElement> allHeader = Driver.getDriver().findElements(By.tagName("th"));
        for (WebElement header : allHeader) {
            System.out.println(header.getText());
        }
        //write your code in this method
        //tbody//tr[8]//td[6]
        //Writing the dynamic xpath
        // String xpath = "//tbody//tr[" + row + "]//td[" + column + "]";
        String xpath1 = "//tbody//tr[8]//td[6]";//=>
        //We are finding the elements  using that xpath
        WebElement data = Driver.getDriver().findElement(By.xpath(xpath1));
        //We are and printing the data
        System.out.println(data.getText());
    }

    @Given("Navigate to view option and click")
    public void navigate_to_view_option_and_click() {
     Driver.waitAndClick(loginPage.viewButton,5);

    }

    @Then("user verify the customer page")
    public void user_verify_the_customer_page() {

        Assert.assertTrue(Driver.waitAndGetText(loginPage.verifyCustomer,5).contains("Customer"));
    }


    @Given("click on the edit button")
    public void click_on_the_edit_button() {
        loginPage.editButton.click();

    }

    @Then("verify the customer edit page")
    public void verify_the_customer_edit_page() {
        Assert.assertTrue(Driver.waitAndGetText(loginPage.verifyPage,5).contains("Create or edit a Customer"));

    }

    @Given("Navigate to edit button and click")
    public void navigate_to_edit_button_and_click() {
      Driver.waitAndClick(loginPage.editButton,5);
    }

    @Given("Navigate to create a new customer to edit and click")
    public void navigate_to_create_a_new_customer_to_edit_and_click() {
      Driver.waitAndClick(loginPage.editPortal,5);

    }

    @Given("Navigate to delete button and click")
    public void navigate_to_delete_button_and_click() {
        Driver.waitAndClick(loginPage.deleteButton,5);

    }

    @Then("user verify the confirm delete operation")
    public void user_verify_the_confirm_delete_operation() {

        Assert.assertTrue(Driver.waitAndGetText(loginPage.confirmDeleteOperation,5).contains("Confirm delete operation"));

    }

    @Then("user cancel the delete operation")
    public void user_cancel_the_delete_operation() {
        Driver.waitAndClick(loginPage.deleteCancelButton,5);


    }


}



