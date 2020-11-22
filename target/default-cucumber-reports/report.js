$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/newAccount.feature");
formatter.feature({
  "name": "GMIBank Account Creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.background({
  "name": "user should login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.NewApplicantInfoStepDefinitions.the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to account creation page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks new account creation button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC1301 User can not leave the description textbox empty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "user leaves the description text box empty",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_leaves_the_description_text_box_empty()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify required description message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.verify_required_description_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "user should login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.NewApplicantInfoStepDefinitions.the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to account creation page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks new account creation button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC1302 User should see account type as CHECKING, SAVING, CREDIT_CARD or INVESTING on the Account Type dropdown",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "user clicks Account Type dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_clicks_Account_Type_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify all options are seen on the Account Type dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.verify_all_options_are_seen_on_the_Account_Type_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "user should login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.NewApplicantInfoStepDefinitions.the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to account creation page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks new account creation button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC1303 User should see Account status as ACTIVE, SUSPENDED or CLOSED on the Account status dropdown",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "user clicks Account Status Type dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_clicks_Account_Status_Type_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify all options are seen on the Account Status Type dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.verify_all_options_are_seen_on_the_Account_Status_Type_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "user should login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.NewApplicantInfoStepDefinitions.the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to account creation page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks new account creation button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC1304 User can select an employee from the drop-down",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "user clicks employee dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_clicks_employee_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify all options are seen on the employee dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.verify_all_options_are_seen_on_the_employee_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "TC1305 When users fill in all blanks properly and completely, they should be able to create a new account successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters description \"\u003cdescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters balance \"\u003cbalance\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects account type \"\u003caccountType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects account status type \"\u003caccountStatus\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.step({
  "name": "verify account creation is successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "description",
        "balance",
        "accountType",
        "accountStatus"
      ]
    },
    {
      "cells": [
        "btl saving",
        "20000",
        "SAVING",
        "ACTIVE"
      ]
    }
  ]
});
formatter.background({
  "name": "user should login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user goes to gmi_login_url and signs in as an Employee",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.NewApplicantInfoStepDefinitions.the_user_goes_to_https_gmibank_com_login_and_signs_in_as_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to account creation page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks new account creation button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC1305 When users fill in all blanks properly and completely, they should be able to create a new account successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "user enters description \"btl saving\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_enters_description(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters balance \"20000\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_enters_balance(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects account type \"SAVING\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_selects_account_type(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects account status type \"ACTIVE\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_selects_account_status_type(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify account creation is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.AccountCreationStepDef.verify_account_creation_is_successful()"
});
formatter.result({
  "status": "skipped"
});
});