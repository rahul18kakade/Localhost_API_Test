package stepDefinitions;

import apiBuilders.PostApiBuilder;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfig;
import baseTest.BaseTest;
import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;

public class StepsForPOST extends BaseTest {
    HeaderConfig header= new HeaderConfig();
    PostApiBuilder builder= new PostApiBuilder();
    Response response;

//    @Given("User is on baseURI")
    public void user_is_on_base_uri() {
        base_Test();
    }

    @When("User hits new entry")
    public void user_hits_new_entry() {
             given().headers(header.defaultHeader()).body(builder.postRequestBodyForUsers()).
                     when().post(APIPath.apiPath.CREATE_USER).
                     then().statusCode(201).log().all();
    }

    @Then("New entry should be created")
    public void new_entry_should_be_created() {
        Response response= given().headers(header.defaultHeader()).body(builder.postRequestBodyForUsers()).
                when().post(APIPath.apiPath.CREATE_USER);
        Assert.assertEquals(response.statusCode(),201);
    }

    @When("User hits new subject")
    public void user_hits_new_subject() {
    given().headers(header.defaultHeader()).body(builder.postRequestBodyForSubjects()).
            when().post(APIPath.apiPath.CREATE_SUBJECT).
            then().statusCode(201).log().all();
    }

    @Then("New subject should be created")
    public void new_subject_should_be_created() {
            response =given().headers(header.defaultHeader()).body(builder.postRequestBodyForSubjects()).
                    when().post(APIPath.apiPath.CREATE_SUBJECT);
            Assert.assertEquals(response.statusCode(),201);
    }

    @When("User hits new location")
    public void user_hits_new_location() {
            given().headers(header.defaultHeader()).body(builder.postRequestBodyForLocation()).
                    when().post(APIPath.apiPath.CREATE_LOCATION).
                    then().statusCode(201).log().all();
    }

    @Then("New location should be created")
    public void new_location_should_be_created() {
            response= given().headers(header.defaultHeader()).body(builder.postRequestBodyForLocation()).
                    when().post(APIPath.apiPath.CREATE_LOCATION);
            Assert.assertEquals(response.statusCode(),201);
    }

}
