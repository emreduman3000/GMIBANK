package gmibank.stepdefinitions;

import gmibank.jsonModels.CountryJson;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.WriteToText2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class CountryApiStepDefinitions {
    Response response;
    JsonPath json;
    List<Map<String, Object>> allCountryData;

    @Given("user gets all data for countries using api en point {string}")
    public void user_gets_all_data_for_countries_using_api_en_point(String url) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                get(url);
        response.then().
                assertThat().statusCode(200);
        response.prettyPrint();
        json = response.jsonPath();

    }

    @Given("user deserializes country data as json to java pojo")
    public void user_deserializes_country_data_as_json_to_java_pojo() {
        allCountryData = json.getList("$");
        System.out.println("list of countries :" + allCountryData);

        String fifthCountryName = allCountryData.get(4).get("name").toString();
        System.out.println("the name of the fifth country:" + fifthCountryName);

        Integer thirdCountryId = (int) allCountryData.get(2).get("id");
        System.out.println("the thirdCountryId :" + thirdCountryId);
        System.out.println("the count of the country:" + allCountryData.size());//86
        System.out.println(allCountryData.size());
        String lastCountryName = allCountryData.get(allCountryData.size() - 1).get("name").toString();
        System.out.println(lastCountryName);

    }
    @Then("user validates the data")
    public void user_validates_the_data() {

        String expectedCountryName="Sudan";
        String actualCountryName= allCountryData.get(70).get("name").toString();
        Assert.assertEquals(expectedCountryName,actualCountryName);

        int expectedCountryId=1751;
        int actualCountryId=(int) allCountryData.get(5).get("id");
        Assert.assertEquals(expectedCountryId,actualCountryId);

    }

    @Given("user sets the response using api end point {string} and creates country using {string} and {string}")
    public void user_sets_the_response_using_api_end_point_and_creates_country_using_and(String url, String type, String country) {
    response = given().
            contentType(ContentType.JSON).
            auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
            when().
            body(CountryJson.createCountry).
            post(url).then().contentType(ContentType.JSON).extract().response();
      response.prettyPrint();
    }

    @Given("user sets the countries to response using {string}")
    public void user_sets_the_countries_to_response_using(String url) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                get(url);
        response.then().
                assertThat().statusCode(200);
        response.prettyPrint();
        json = response.jsonPath();

    }

    @Given("user saves the countries to correspondent files")
    public void user_saves_the_countries_to_correspondent_files() {
        WriteToText2.saveDataInFileWithJsonListMap("us_21.csv",allCountryData);

    }

    @Then("user validates the countries")
    public void user_validates_the_countries() {

    }

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String endpoint, String id) {
        response = given().accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                delete(endpoint+id).
                then().
                extract().
                response();
    }




}
