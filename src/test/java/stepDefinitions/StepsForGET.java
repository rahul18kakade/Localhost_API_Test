package stepDefinitions;

import apiConfigs.APIPath;
import baseTest.BaseTest;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class StepsForGET extends BaseTest {

    @Given("User is on baseURI")
    public void user_is_on_base_uri() {
        baseTest.BaseTest.base_Test();
    }
    @When("User calls for users list")
    public void user_calls_for_users_list() {
        given().when().get(APIPath.apiPath.GET_LIST_OF_USERS).then().statusCode(200).log().all();

    }
    @Then("User must get list of users")
    public void user_must_get_list_of_users() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_LIST_OF_USERS).statusCode(),200);
    }
    @When("User calls for specific Id number")
    public void user_calls_for_specific_id_number() {
        given().when().get(APIPath.apiPath.GET_SINGLE_USER).then().statusCode(200).log().all();
    }
    @Then("User should be getting same users information")
    public void user_should_be_getting_same_users_information() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_SINGLE_USER).statusCode(),200);
    }

    @When("User calls for subjects list")
    public void user_calls_for_subjects_list() {
        given().when().get(APIPath.apiPath.GET_LIST_OF_SUBJECTS).then().statusCode(200).log().all();
    }

    @Then("User must get list of subjects")
    public void user_must_get_list_of_subjects() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_LIST_OF_SUBJECTS).statusCode(),200);
    }

    @When("User calls for specific Subject")
    public void user_calls_for_specific_subject() {
        given().when().get(APIPath.apiPath.GET_SINGLE_SUBJECT).then().statusCode(200).log().all();
    }

    @Then("User should be getting same subjects information")
    public void user_should_be_getting_same_subjects_information() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_SINGLE_SUBJECT).statusCode(),200);
    }

    @When("User calls for location list")
    public void user_calls_for_location_list() {
        given().when().get(APIPath.apiPath.GET_LIST_OF_LOCATIONS).then().statusCode(200).log().all();
    }

    @Then("User must get list of location")
    public void user_must_get_list_of_location() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_LIST_OF_LOCATIONS).statusCode(),200);
    }

    @When("User calls for specific location")
    public void user_calls_for_specific_location() {
        given().when().get(APIPath.apiPath.GET_SINGLE_LOCATION).then().statusCode(200).log().all();
    }

    @Then("User should be getting same location information")
    public void user_should_be_getting_same_location_information() {
        Assert.assertEquals(get(baseURI+APIPath.apiPath.GET_SINGLE_LOCATION).statusCode(),200);
    }

}
