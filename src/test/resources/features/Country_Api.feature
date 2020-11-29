@US_21CreateReader

Feature: System should allow to read all countries info using api end point


  @api
  Scenario: Read all countries you created and validate them from your data set
    Given user gets all data for countries using api en point "https://www.gmibank.com/api/tp-countries"
    And user deserializes country data as json to java pojo
    Then user validates the data


  @CreateCountry
  Scenario Outline: Create a country
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates country using "<idJson>" and "<nameJson>"
    Examples: create country
      | idJson | nameJson |
      | name   | Egypt    |
      | name   |Madagascar|
      | name   | Mali     |
      | name   | Uganda   |


  Scenario: read all countries
    Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    And  user saves the countries to correspondent files
    Then user validates the countries

  Scenario Outline: delete countries
    Given user deletes a country using endpoint "<endpoint>" and its extension "<id>"

    Examples: multiple countries
      | endpoint                                 | id     |
      | https://www.gmibank.com/api/tp-countries | /22345 |



