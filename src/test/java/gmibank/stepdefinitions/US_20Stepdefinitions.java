package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

public class US_20Stepdefinitions {
    Response response;
    JsonPath json;
    List<Map<String, Object>> allCustomerData;


    @Given("use api end point  {string}")
    public void use_api_end_point(String endpointurl) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("api_bearer_token")).
                when().
                get(endpointurl);
        response.then().
                assertThat().
                statusCode(200);//restassuredaki assertle yapmis oldum
      //response in icindeki then le assert etmis oldum yani hersey yolunda mi ?
      //  Eger post, put, patch request yapiyorsak accept type yerine ==> content type kullanmaliyiz.
      //    get ve delete de ==> accept type kullanabiliriz.

        //response.prettyPrint();//bununla da cevabi consolda yazdiriyor

        json = response.jsonPath();//cevabi java diline cevirmek icin jsonpath yontemiyle
    }

    @Given("get all customers information as De-Serialization")
    public void get_all_customers_information_as_De_Serialization() {
          response.prettyPrint();
        allCustomerData = json.getList("$");//butun data elimizde
        System.out.println("Java List Map response : " + allCustomerData);
        System.out.println("First Customer Info :"+allCustomerData.get(0));
        System.out.println("First Customer FirstName:"+allCustomerData.get(0).get("firstName"));
        System.out.println("Sixth Customer email:"+allCustomerData.get(5).get("email"));

        String elevenCustomerLastname=allCustomerData.get(10).get("lastName").toString();
        System.out.println("Customer lastname:"+ elevenCustomerLastname);

        int customerId=(int) allCustomerData.get(7).get("id");
        System.out.println("customerId : "+customerId);

    }

    @Given("find out how many customers are and verify that there are {int} customers")
    public void find_out_how_many_customers_are_and_verify_that_there_are_customers(Integer customerCount) {
        Integer actualCustumerCount =  allCustomerData.size();
        System.out.println("number of customers: "+actualCustumerCount);
         Assert.assertEquals(customerCount,actualCustumerCount);
    }

    @Given("get all the information of the 3th customer")
    public void get_all_the_information_of_the_3th_customer() {
        System.out.println(allCustomerData.get(2));
        WriteToTxt.saveDataInFileWithJsonListMap("us20.csv",allCustomerData);
    }

    @Given("verify 3rd customers ssn and country name")
    public void verify_3rd_customers_ssn_is_and_country_name_is() {
     String actualSsn= allCustomerData.get(2).get("ssn").toString();
     Assert.assertEquals(actualSsn,"219-02-1962");

     String actualCountryName=json.getString("country[2].name");
     Assert.assertEquals(actualCountryName, "UNITED STATES");
    }

    @Given("verify first customer's firstName {string}")
    public void verify_first_customer_s_firstName(String expectedFirstName) {
   Assert.assertEquals(expectedFirstName,allCustomerData.get(0).get("firstName"));
    }

    @Given("verify second customer's lastName {string}")
    public void verify_second_customer_s_lastName(String expectedLastName) {

   String actualLastName=allCustomerData.get(1).get("lastName").toString();
       Assert.assertEquals(expectedLastName,actualLastName);

    }

    @Given("verify fifth customer's country {string}")
    public void verify_fifth_customer_s_country(String expectedCountry) {
        String actualCountry=json.getString("country[4].name");
        Assert.assertEquals(expectedCountry,actualCountry);

    }

    @Given("verify last customer's user email {string}")
    public void verify_last_customer_s_user_email(String expectedEmail) {
        String actualEmail=allCustomerData.get(allCustomerData.size()-1).get("email").toString();
        Assert.assertEquals(expectedEmail,actualEmail);

    }


}
//    Response response;
//    JsonPath json;
//    List<Map<String,Object>> allCustomerData;
//    @Given("use api end point  {string}")
//    public void use_api_end_point(String endpointUrl) {
//        response = given().
//                accept(ContentType.JSON).
//                auth().oauth2(ConfigurationReader.getProperty("token")).
//                when().
//                get(endpointUrl);
////    Eger post, put, patch request yapiyorsak accept type yerine ==> content type kullanmaliyiz.
////    get ve delete de ==> accept type kullanabiliriz.
//        response.
//                then().
//                assertThat().
//                statusCode(200);
////        response.prettyPrint();
//        json = response.jsonPath();
//    }
//    @Given("get all customers information as De-Serialization")
//    public void get_all_customers_information_as_De_Serialization() {
////    1. yontem ==> JsonPath
////    2. yontem ==> Pojo
//        //    1. yontem ==> JsonPath
//        allCustomerData = json.getList("$"); // butun data elimizde
//        System.out.println("Java List Map response: " + allCustomerData);
//        System.out.println("First customer info: " + allCustomerData.get(0));
//        System.out.println("First customer firstname: " + allCustomerData.get(0).get("firstName"));
//        String customerLatsname= allCustomerData.get(2).get("lastName").toString();
//        System.out.println("customer Lastname: " + customerLatsname);
//        int id = (int) allCustomerData.get(0).get("id");
//        System.out.println("customer id: "  + id);
//    }
//    @Given("find out how many customers are and verify that there are {int} customers")
//    public void find_out_how_many_customers_are_and_verify_that_there_are_customers(Integer customerCount) {
//        Integer actualCustumerCount =  allCustomerData.size();
//        Assert.assertEquals(customerCount,actualCustumerCount);
//    }
//    @Given("get all the information of the seventh customer")
//    public void get_all_the_information_of_the_seventh_customer() {
//        System.out.println(allCustomerData.get(6));
//        WriteToText2.saveDataInFileWithJsonListMap("us_20_ka.csv",allCustomerData);
//    }
//    @Given("verify seventh customers ssn is {string} and country name is {string}")
//    public void verify_seventh_customers_ssn_is_and_country_name_is(String expectedSsn, String expectedCountryName) {
//        String actualSsn = allCustomerData.get(6).get("ssn").toString();
//        Assert.assertEquals(expectedSsn,actualSsn);
//        String actualCountryName = json.getString("country[6].name");
//        Assert.assertEquals(expectedCountryName,actualCountryName);
//    }
//    @Given("verify first customer's firstName {string}")
//    public void verify_first_customer_s_firstName(String expectedFirstname) {
//        Assert.assertEquals(expectedFirstname,allCustomerData.get(0).get("firstName"));
//    }
//    @Given("verify second customer's lastName {string}")
//    public void verify_second_customer_s_lastName(String expectedLastname) {
//        String actualLastname = allCustomerData.get(1).get("lastName").toString();
//        Assert.assertEquals(expectedLastname,actualLastname);
//    }
//    @Given("verify fifth customer's country {string}")
//    public void verify_fifth_customer_s_country(String expectedCountry) {
//        String actualCountry = json.getString("country[4].name");
//        Assert.assertEquals(expectedCountry,actualCountry);
//    }
//    @Given("verify last customer's user email {string}")
//    public void verify_last_customer_s_user_email(String expectedEmail) {
//        String actualEmail = allCustomerData.get(allCustomerData.size()-1).get("email").toString();
//        Assert.assertEquals(expectedEmail,actualEmail);
//    }
//}
