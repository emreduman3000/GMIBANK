@newAccount
Feature: New Account Creation
  Background: user is on the url
    Given the user goes to gmi_login_url and signs in as an Employee
    And the user goes to accountCreation_url

  Scenario: TC1301_User can not leave the description textbox empty
    When user leaves the Description textbox empty
    Then verify required description message

  Scenario: TC1302_User should see account type as CHECKING, SAVING, CREDIT_CARD or INVESTING on the Account Type dropdown
    When user clicks on the account type dropdown
    Then verify account types are seen as CHECKING, SAVING, CREDIT_CARD or INVESTING

  Scenario: TC1303_User should see Account status as ACTIVE, SUSPENDED or CLOSED on the Account status dropdown
    When user clicks on the account status type dropdown
    Then verify account status types are seen as ACTIVE, SUSPENDED or CLOSED

  Scenario: TC1304_User can select an employee from the drop-down
    When user clicks on the employee dropdown
    Then verify any of the employees can be selected

  Scenario Outline: TC1305_When users fill in all blanks properly and completely, they should be able to create a new account successfully
    When user enters the description "<description>"
    And user enters the balance "<balance>"
    And user select the account type "<accountType>"
    And user select the account status type "<accountStatus>"
    And user clicks on the save button
    Then verify the account creation is successful

    Examples: Test Data
      |description|balance|accountType|accountStatus|
      |btl checking|1000  |CHECKING   |ACTIVE       |
      |btl saving  |20000 |SAVING     |ACTIVE       |
      |btl investing|100  |INVESTING  |CLOSED       |
      |btl creditcard|2000|CREDIT_CARD|SUESPENDED   |

  Scenario: select saving option from account type
    When user select the accountType







