@AllStates
Feature: read,create,delete and update all states

  Background: read all states
    Given user sets all states to response using "https://www.gmibank.com/api/tp-states"

  Scenario: read all states
    Given user deserializes all states pojo
    And user generates all states data in correspondent files
    Then user validates data for all states

