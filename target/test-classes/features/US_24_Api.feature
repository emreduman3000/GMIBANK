@AllStates
Feature: read,create,delete and update all states

  Background: read and create all states
    Given user sets all states to response by using "https://www.gmibank.com/api/tp-states"

  Scenario: read all states

    Given users deserialize all states json
    And users generate all states data in correspondent files
    Then users validate data for all states

  @TC_2401
  Scenario: TC_2401 Users can just create each state 1 by 1

    Given Users send a POST request to REST API endpoint "https://www.gmibank.com/api/tp-states/" and create "Texas" state
    And After creation HTTP Status Code should be "200"
    Then After creation user verifies the created state "LAMUISLAND"


  Scenario Outline: delete states
    Given user deletes a state using endpoint "<url>" and its extension "<id>"

    Examples: multiple states
      | url                                   | id |
      | https://www.gmibank.com/api/tp-states | /27562 |
