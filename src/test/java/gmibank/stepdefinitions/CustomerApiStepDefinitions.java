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
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.*;

public class CustomerApiStepDefinitions {

    Response response;
    //  String filePath=ConfigurationReader.getProperty("filePath_Customer");
    // String bearerToken= ConfigurationReader.getProperty("api_bearer_token");
    Customer[] customers;

    @Given("user provides the api end point to set the response using {string}")
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

        @Given("manipulate all customers data")
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
            System.out.println("Here is Step3");
            //  WriteToTxt.saveDataInFileWithAllCustomerInfo("AllCustomerData.txt",customers);
            WriteToTxt.saveDataInFile("NewFile.txt", customers);

        }

        @Then("user validates all data")
        public void user_validates_all_data() {
            System.out.println("Here is Step4");

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