@newAccount
Feature: GMIBank Account Creation

  Background: user should login as an employee
    Given the user goes to gmi_login_url and signs in as an Employee
    And the user goes to new account creation page

  Scenario: TC1301 User can not leave the description textbox empty
    When user leaves the description text box empty
    Then verify required description message

  Scenario: TC1302 User should see account type as CHECKING, SAVING, CREDIT_CARD or INVESTING on the Account Type dropdown
    When user clicks Account Type dropdown
    Then verify all options are seen on the Account Type dropdown

  Scenario: TC1303 User should see Account status as ACTIVE, SUSPENDED or CLOSED on the Account status dropdown
    When user clicks Account Status Type dropdown
    Then verify all options are seen on the Account Status Type dropdown

  Scenario: TC1304 User can select an employee from the drop-down
    When user clicks employee dropdown
    Then verify all options are seen on the employee dropdown

  Scenario Outline: TC1305 When users fill in all blanks properly and completely, they should be able to create a new account successfully
    When user enters description "<description>"
    And user enters balance "<balance>"
    And user selects account type "<accountType>"
    And user selects account status type "<accountStatus>"
    And user clicks save button
    Then verify account creation is successful
    And user clicks on userIcon
    And user clicks on sign out button

    Examples: Test Data
    |description|balance|accountType|accountStatus|
    |BTL saving |1000   |SAVING     |ACTIVE       |
    |BTL checking|2000  |CHECKING   |ACTIVE       |
    |BTL credit  |100   |CREDIT_CARD|CLOSED       |
    |BTL investing|20000|INVESTING  |ACTIVE       |


