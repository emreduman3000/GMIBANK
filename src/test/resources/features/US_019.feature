@admin
Feature: US_019 System should allow Admin to create a new Account
  Background: Sign in as Admin
    Given user is on the login page
    And enter correct username and password for Admin

    Scenario: TC_001 Admin should create a description for the new account and it cannot be blank
      Given click on description box
      And write a description for the new account
      Then verify description box can not be blank
