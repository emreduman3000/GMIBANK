
@AllStates
Feature: read,create,delete and update all states

  Background: read all states
    Given user sets all states to response by using "https://www.gmibank.com/api/tp-states"

  Scenario: read all states
    Given users deserialize all states pojo
    And users generate all states data in correspondent files
    Then users validate data for all states