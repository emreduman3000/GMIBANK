package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_019_StepDef  {
    LoginPage signinPage = new LoginPage();
    @Given("enter correct username and password for Admin")
    public void enter_correct_username_and_password_for_Admin() {

        signinPage.usernamebox.sendKeys("group8admin");
        signinPage.passwordbox.sendKeys("Group8");
        signinPage.signInButton.click();
    }

    @Given("click on description box")
    public void click_on_description_box() {

    }
    @Given("write a description for the new account")
    public void write_a_description_for_the_new_account() {

    }
    @Then("verify description box can not be blank")
    public void verify_description_box_can_not_be_blank() {

    }

}
