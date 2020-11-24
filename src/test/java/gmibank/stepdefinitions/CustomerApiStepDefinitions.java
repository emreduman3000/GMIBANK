package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.ReadTxt;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
public class CustomerApiStepDefinitions {

    Response response;
    //  String filePath=ConfigurationReader.getProperty("filePath_Customer");
    // String bearerToken= ConfigurationReader.getProperty("api_bearer_token");
    Customer[] customers;

    @Given("user provides api end point to set the response using {string}")
        public void user_provides_the_api_end_point_to_set_the_response_using(String url) {
        System.out.println("Here is step1");
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("manipulate all customers' data")
    public void manipulate_all_customers_data() throws Exception {
        System.out.println("Here is Step2");

        ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++)
            if (customers[i].getUser() != null)
                System.out.println(customers[i].getUser().getFirstName());

    }

    @Given("user sets the data in correspondent files")
    public void user_sets_the_data_in_correspondent_files() {
        //  WriteToTxt.saveDataInFileWithAllCustomerInfo("AllCustomerData.txt",customers);
        WriteToTxt.saveDataInFile("NewFile.txt", customers);

    }

    @Then("user validates all data")
    public void user_validates_all_data() {

        List<Customer> list = ReadTxt.returnCustomerSNN("NewFile.txt");
        Customer customer = new Customer();
        customer.setSsn("123-47-2476");
        int count = 0;

        String expected = "123-47-2476";
        String expected2 = "098-68-1985";
        String expected3 = "777-77-7777";

        int expectedNumberOfSSN = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSsn().equals(expected)) {
                System.out.println("Found item");
            }


        }
    }


    }



//    Response response;
//    String filePath = ConfigurationReader.getProperty("filePath_Customer");
//    String bearerToken = ConfigurationReader.getProperty("api_bearer_token");
//    Customer[] customers;
//    @Given("user sets all response using api end point {string}")
//    public void user_sets_all_response_using_api_end_point(String url) {
//        System.out.println("Here is the stpe1");
//        response = given().headers(
//                "Authorization",
//                "Bearer " + bearerToken,
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON)
//                .when()
//                .get(url)
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();
//        response.prettyPrint();
//    }
//    @Given("user deserializes country data as json to java pojo")
//    public void user_deserializes_country_data_as_json_to_java_pojo()throws Exception {
//        System.out.println("Here is the stpe2");
//        ObjectMapper obj = new  ObjectMapper();
//        customers = obj.readValue(response.asString(), Customer[].class);
//        for(int i=0; i<customers.length;i++ ){
//            if(customers[i].getUser() != null)
//                System.out.println("id: "+ customers[i].getUser().getFirstName());
//        }
//    }
//    @Then("user validates the data")
//    public void user_validates_the_data() {
//        System.out.println("Here is the stpe3");
////        WriteToTxt.returnCustomerSNN(filePath,customers[10]);
//    }
