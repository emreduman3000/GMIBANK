package gmibank.stepdefinitions;
import gmibank.jsonModels.StateJson;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_24StepDefinitions {
    Response response;
    JsonPath json;
    List<Map<String, Object>> allStatesData;

    @Given("user sets all states to response by using {string}")
    public void userSetsAllStatesToResponseUsing(String endpointurl) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                get(endpointurl);
        response.then().
                assertThat().
                statusCode(200);
        // response.prettyPrint();
        json = response.jsonPath();

    }

    @Given("users deserialize all states json")
    public void userDeserializesAllStatesjson() {
        response.prettyPrint();
        allStatesData = json.getList("$");//butun data elimizde
        System.out.println("Java List Map response : " + allStatesData);
        System.out.println("First state Info :" + allStatesData.get(0));
        System.out.println("First state name:" + allStatesData.get(0).get("name"));
        System.out.println("Sixth state id:" + allStatesData.get(5).get("id"));

        String elevenStateName = allStatesData.get(10).get("name").toString();
        System.out.println("ElevenState name:" + elevenStateName);

        int stateId = (int) allStatesData.get(7).get("id");
        System.out.println("EightStateId : " + stateId);
    }

    @And("users generate all states data in correspondent files")
    public void userGeneratesAllStatesDataInCorrespondentFiles() {

          WriteToTxt.saveDataInFileWithJsonListMap("us_24.csv",allStatesData);
    }

    @Then("users validate data for all states")
    public void userValidatesDataForAllStates() {
        System.out.println("All States Count : " + allStatesData.size());

        String actualName = allStatesData.get(1).get("name").toString();
        Assert.assertEquals("Auvergne", actualName);

        String expectedCount="159";
        Integer actualCount = allStatesData.size();
        Assert.assertEquals(expectedCount, actualCount);

    }

    @Given("Users send a POST request to REST API endpoint {string} and create {string} state")
    public void users_send_a_POST_request_to_REST_API_endpoint_and_create_state(String endpointUrl, String string2) {
        response = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                body(StateJson.CREATE_STATE4).
                post(endpointUrl).then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();


    }


    @Given("After creation HTTP Status Code should be {string}")
    public void after_creation_HTTP_Status_Code_should_be(String statusCode) {
        int expectedStatusCode=Integer.parseInt(statusCode);
        response.then().
                 assertThat().
              statusCode(expectedStatusCode);
    }

    @Then("After creation user verifies the created state {string}")
    public void after_creation_user_verifies_the_created_state(String expectedState) {
        String actualState=allStatesData.get(allStatesData.size()-1).get("name").toString();
        Assert.assertEquals(expectedState,actualState);
    }

    @Given("user deletes a state using endpoint {string} and its extension {string}")
    public void user_deletes_a_state_using_endpoint_and_its_extension(String endpoint, String id) {
        response = given().accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                delete(endpoint + id).
                then().
                extract().
                response();
    }

}







