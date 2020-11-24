$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_24_Api.feature");
formatter.feature({
  "name": "read,create,delete and update all states",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllStates"
    }
  ]
});
formatter.background({
  "name": "read all states",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets all states to response using \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.StatesApiStepDef.user_sets_all_states_to_response_using(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "read all states",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllStates"
    }
  ]
});
formatter.step({
  "name": "user deserializes all states pojo",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user generates all states data in correspondent files",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.StatesApiStepDef.user_generates_all_states_data_in_correspondent_files()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates data for all states",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.StatesApiStepDef.user_validates_data_for_all_states()"
});
formatter.result({
  "status": "skipped"
});
});