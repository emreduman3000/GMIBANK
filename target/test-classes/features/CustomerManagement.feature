@cc
Feature: GMI Bank new Customer creation

  Scenario: TC 01_ User should create a new customer by filling out the required fields
    Given user is on the GMI Bank signin page
    And enter correct username and password
    Given user clicks on My Operations
    And click on Manage Customers
    And click on Create a new Customer

  Scenario: TC 02_ The date cannot be typed earlier, in the past, at the time of creation a customer
    Given user clicks on create date box
    And enter a date earlier than the time of creation a customer
    Then verify if it is an invalid input

  Scenario: TC 03_ User can select Zelle Enrolled optionally and save it
    Given user clicks on zelle enrolled
    Then verify if zelle enrolled is true

  Scenario: TC 04_ User can choose a user from the registration and it cannot be blank
    Given user selects a user from dropdown
    Then verify if selected user is valid

  Scenario: TC 05_ User box can not be blank
    Given  user leaves user box empty
    Then verify user box can not be blank

  Scenario: TC 06_ User can choose an account created on manage accounts
    Given user selects an account from account dropdown
    Then verify if selected account is valid


