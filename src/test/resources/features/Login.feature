@login
Feature: login page feature


  @loginPositive
  Scenario Outline: log in to page
    Given user is on the login page
    And user clicks on the username textbox and text "<valid username>"
    And user clicks on the password textbox and text "<valid password>"
    And user clicks on the sign in button
    Then user verify to login

    Examples:
      | valid username | valid password |
      | team8          | 123qw?+.       |
      | group8admin    | Group8         |
      | group8employee | group8employee |
      | group8manager  | group8manager  |
      | group8customer | group8customer |

  @CancelButton
  Scenario Outline: log in to page with cancel button
    Given user is on the login page
    And user clicks on the username textbox and text "<valid username>"
    And user clicks on the password textbox and text "<valid password>"
    And user clicks on the cancel button
    Then user verify to homepage
    Examples:
      | valid username | valid password |
      | team8          | 123qw?+.       |
      | group8admin    | Group8         |
      | group8customer | group8customer |
      | group8manager  | group8manager  |
      | group8employee | group8employee |


