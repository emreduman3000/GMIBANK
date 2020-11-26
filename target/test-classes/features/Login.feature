@login
Feature: login page feature

  Background: user is on the login page
    Given user is on the login page

  @loginPositive
  Scenario Outline: log in to page
    And user clicks on the username textbox and text "<valid username>"
    And user clicks on the password textbox and text "<valid password>"
    And user clicks on the sign in button
    Then user verify to login
<<<<<<< HEAD

=======
    And user clicks on userIcon
    And user clicks on sign out button
>>>>>>> master
    Examples:
      | valid username | valid password |
      | team8          | 123qw?+.       |
      | group8admin    | Group8         |
      | group8customer | group8customer |
      | group8manager  | group8manager  |
      | group8employee | group8employee |

  @CancelButton
  Scenario Outline: log in to page with cancel button
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


