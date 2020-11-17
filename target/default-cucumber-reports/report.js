$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginNegative.feature");
formatter.feature({
  "name": "Login negative",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginNegative"
    }
  ]
});
formatter.background({
  "name": "user is on the login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestStepdefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login page should not be accessible with invalid username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginNegative"
    },
    {
      "name": "@Negative1"
    }
  ]
});
formatter.step({
  "name": "user clicks on the username textbox and text invalid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_the_username_textbox_and_text_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the password textbox and text valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_the_password_textbox_and_text_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestStepdefinitions.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_verify_the_error_message()"
});
formatter.result({
  "status": "passed"
});
});