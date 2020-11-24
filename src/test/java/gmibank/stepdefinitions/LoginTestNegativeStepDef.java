package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginTestNegativeStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user clicks on the username textbox and text invalid username")
    public void user_clicks_on_the_username_textbox_and_text_invalid_username() {
        loginPage.usernamebox.sendKeys("team9");
    }

    @Given("user clicks on the password textbox and text valid password")
    public void user_clicks_on_the_password_textbox_and_text_valid_password() {
        loginPage.passwordbox.sendKeys("123qw?+.");
    }


    @Then("user verify the error message")
    public void user_verify_the_error_message() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String errorMessage = "Failed to sign in! Please check your credentials and try again.";
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage, loginPage.errorMessage.getText());
    }

    @Given("user clicks on the username textbox and text valid username")
    public void user_clicks_on_the_username_textbox_and_text_valid_username() {
        loginPage.usernamebox.sendKeys("team8");
    }

    @Given("user clicks on the password textbox and text invalid password")
    public void user_clicks_on_the_password_textbox_and_text_invalid_password() {
        loginPage.passwordbox.sendKeys("123asd");
    }

    @Then("user clicks on this text \"Did you forget your password?")
    public void user_clicks_on_this_text_Did_you_forget_your_password() {
        loginPage.forgetPassword.click();
    }

    @Then("user verify the new page")
    public void user_verify_the_new_page() {
        String verifymessage = "Reset your password";
        Assert.assertEquals(verifymessage, loginPage.newPageVerify.getText());
    }

    @Then("user enter the email address you used to register in the email text box")
    public void user_enter_the_email_address_you_used_to_register_in_the_email_text_box() {
        loginPage.emailTextBox.sendKeys("katrenjohn789@gmail.com");
    }

    @Then("user clicks the Reset password button")
    public void user_clicks_the_Reset_password_button() {
        loginPage.resetButton.click();

    }

    @Then("user verify the success message")
    public void user_verify_the_success_message() {
        Driver.waitForVisibility((loginPage.verifyMessage),5);


    }

    @Then("user clicks on this text {string}")
    public void user_clicks_on_this_text(String string) {
        loginPage.registerNewAccount.click();

    }

    @Then("user verify the Registration page")
    public void user_verify_the_Registration_page() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      Assert.assertTrue(loginPage.registrationPage.isDisplayed());
    }

}

