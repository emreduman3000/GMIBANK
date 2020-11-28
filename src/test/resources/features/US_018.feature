@US_18
Feature: System should allow employee to manage a customer

  Background: Sign in
    Given User is on the sign in
    And navigate to manage customers


  @TC_0001
  Scenario: All customers should show up on manage customers module populating the account information of the customer "First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date"
    And Find the total number of rows and cells in the table body
    And Print headers, rows, and cells


  @TC_0002
  Scenario: There should be a View option where employee can be navigated to all customer info and see
  edit button there
    And Navigate to view option and click
    Then user verify the customer page
    And click on the edit button
    Then verify the customer edit page


  @TC_0003
  Scenario: There should be an Edit button where all customer information can be populated
   And Navigate to edit button and click
    And verify the customer edit page

    @TC_0004
    Scenario: The Edit portal can allow user to create or update the user info
      And Navigate to create a new customer to edit and click
      And verify the customer edit page

      @TC_0005
      Scenario: User can delete a customer, but seeing a message if the user is sure about deletion
       And Navigate to delete button and click
        And user verify the confirm delete operation
        Then user cancel the delete operation



