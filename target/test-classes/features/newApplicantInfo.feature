@newApplicantInfo
Feature: User should be able to search a new applicant by SSN and see all of their registration Info
  Background: user is on the url
    Given user goes to gmi_login_url and signs in
  Scenario: User Information Verification Test
    When user navigates to My operations
    And user choose Manage Customer Option
    And user click Create a new Customer button
    And user click the SSN Text box and properly types the SSN of a new applicant with dashes
    And user goes to search button and clicks
    Then user should be able to see the new applicant's all registration info
    And the page displays First Name info
    And the page displays Last Name info
    And the page displays Address info
    And the page displays Mobile Phone Number info
    And the page displays Email info
    And the page displays Username info

