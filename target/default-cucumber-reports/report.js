<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginNegative.feature");
formatter.feature({
  "name": "Login negative",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/register.feature");
formatter.feature({
  "name": "GMIBank Registration",
>>>>>>> master
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@loginNegative"
    }
  ]
});
formatter.background({
  "name": "user is on the login page",
=======
      "name": "@register"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid SSN \"\u003cssn\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters valid first name \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid address \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid mobile phone number \"\u003cpNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid Username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid Email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password confirmation \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ssn",
        "firstname",
        "lastname",
        "address",
        "pNumber",
        "username",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "222-11-3322",
        "john",
        "smith",
        "8080 winter circle Alpharetta 30011",
        "780-232-2222",
        "jsmith",
        "jsmith@gmail.com",
        "john_1234"
      ]
    },
    {
      "cells": [
        "378-88-1000",
        "marry",
        "alice",
        "2021 summer circle",
        "330-345-6789",
        "alice",
        "alice@gmail.com",
        "1234"
      ]
    },
    {
      "cells": [
        "111-11-1111",
        "a",
        "b",
        "Time Square",
        "000-000-0000",
        "8",
        "a@hotmail.com",
        "12345678"
      ]
    },
    {
      "cells": [
        "567-90-3456",
        "123",
        "456",
        "2000",
        "210-200-2000",
        "a123",
        "123@yahoo.com",
        "tester"
      ]
    },
    {
      "cells": [
        "999-11-2341",
        "jim",
        "co",
        "101 Cumming 30040",
        "999-999-9999",
        "co",
        "jimco@gmail.com",
        "Jim?101"
      ]
    }
  ]
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enters valid SSN \"222-11-3322\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid first name \"john\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid last name \"smith\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid address \"8080 winter circle Alpharetta 30011\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid mobile phone number \"780-232-2222\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Username \"jsmith\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Email \"jsmith@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password \"john_1234\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password confirmation \"john_1234\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enters valid SSN \"378-88-1000\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid first name \"marry\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid last name \"alice\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid address \"2021 summer circle\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid mobile phone number \"330-345-6789\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Username \"alice\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Email \"alice@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password \"1234\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password confirmation \"1234\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enters valid SSN \"111-11-1111\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid first name \"a\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid last name \"b\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid address \"Time Square\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Username \"8\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Email \"a@hotmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password \"12345678\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password confirmation \"12345678\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enters valid SSN \"567-90-3456\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid first name \"123\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid last name \"456\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid address \"2000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid mobile phone number \"210-200-2000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Username \"a123\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Email \"123@yahoo.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password \"tester\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password confirmation \"tester\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
>>>>>>> master
  "description": "",
  "keyword": "Background"
});
formatter.step({
<<<<<<< HEAD
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
  "name": "User navigate to registration page if they did not register yet",
=======
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enters valid SSN \"999-11-2341\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid first name \"jim\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid last name \"co\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid address \"101 Cumming 30040\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid mobile phone number \"999-999-9999\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Username \"co\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid Email \"jimco@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password \"Jim?101\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password confirmation \"Jim?101\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the user\u0027s registration is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should not leave the mandatory text boxes empty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user leave SSN text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required SSN message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave firstname text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required firstname  message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave lastname text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required lastname message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave username text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required username message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave email text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required email message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave password text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required password message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user leave confirmation password text box empty",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify required confirmation password message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should not enter invalid SSN",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enter invalid SSN",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify invalid SSN message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should not enter invalid Mobilephone Number",
>>>>>>> master
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@loginNegative"
    },
    {
      "name": "@Negative5"
=======
      "name": "@register"
>>>>>>> master
    }
  ]
});
formatter.step({
<<<<<<< HEAD
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
  "name": "user clicks on the password textbox and text invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_the_password_textbox_and_text_invalid_password()"
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
formatter.step({
  "name": "user clicks on this text \"You don\u0027t have an account yet? Register a new account\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_this_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the Registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_verify_the_Registration_page()"
=======
  "name": "user enter invalid Mobilephone number",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify invalid Mobilephone number message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "user is on the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the GMIBank registration page",
  "keyword": "Given "
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should not enter invalid email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user enter invalid email",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify invalid email message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});