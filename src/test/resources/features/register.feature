@register
  Feature: GMIBank Registration

    Background: user is on the url
      Given user is on the GMIBank registration page

    Scenario Outline: User should register with valid credentials
      When user enters valid SSN "<ssn>"
      And user enters valid first name "<firstname>"
      And user enters valid last name "<lastname>"
      And user enters valid address "<address>"
      And user enters valid mobile phone number "<pNumber>"
      And user enters valid Username "<username>"
      And user enters valid Email "<email>"
      And user enters valid password "<password>"
      And user enters password confirmation "<password>"
      And user clicks on register button
      Then verify the user's registration is successful

      Examples: Test Data
      |ssn|firstname|lastname|address|pNumber|username|email|password|
      |121-11-0956|john|smith|8080 winter circle Alpharetta 30011|780-232-2222|jsmith|jsmith@gmail.com|john_1234|
      |278-88-1001|marry|alice|2021 summer circle                |330-345-6789|alice |alice@gmail.com |1234     |
      |111-14-1111|a    |b    |Time Square                       |000-000-0000|8     |a@hotmail.com   |12345678 |
      |627-91-3459|123  |456  |2000                              |210-200-2000|a123  |123@yahoo.com   |tester   |
      |999-21-2249|jim  |co   |101 Cumming 30040                 |999-999-9999|co    |jimco@gmail.com |Jim?101  |

    Scenario: User should not leave the mandatory text boxes empty
      When user leave SSN text box empty
      Then verify required SSN message
      When user leave firstname text box empty
      Then verify required firstname  message
      When user leave lastname text box empty
      Then verify required lastname message
      When user leave username text box empty
      Then verify required username message
      When user leave email text box empty
      Then verify required email message
      When user leave password text box empty
      Then verify required password message
      When user leave confirmation password text box empty
      Then verify required confirmation password message

    Scenario: User should not enter invalid SSN
      When user enter invalid SSN
      Then verify invalid SSN message

    Scenario: User should not enter invalid Mobilephone Number
      When user enter invalid Mobilephone number
      Then verify invalid Mobilephone number message

    Scenario: User should not enter invalid email
      When user enter invalid email
      Then verify invalid email message


