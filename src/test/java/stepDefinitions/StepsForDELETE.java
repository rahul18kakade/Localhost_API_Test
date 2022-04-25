package stepDefinitions;

import apiConfigs.APIPath;
import baseTest.BaseTest;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class StepsForDELETE extends BaseTest {

    @Given("User is on baseURI")
    public void user_is_on_base_uri(){
        base_Test();
    }

    @When("User try to delete specific USERS block")
    public void user_try_to_delete_specific_users_block() {
        given().when().delete(APIPath.apiPath.DELETE_USER).then().statusCode(200).log().all();
    }

    @Then("that USERS details must be deleted")
    public void that_users_details_must_be_deleted() {
        System.out.println("Actual status code:" + get(baseURI+APIPath.apiPath.DELETE_USER).getStatusCode());
        Assert.assertEquals(200,get(baseURI+APIPath.apiPath.DELETE_USER).getStatusCode());
    }

    @When("User try to delete specific SUBJECTS block")
    public void user_try_to_delete_specific_subjects_block() {
        given().when().delete(APIPath.apiPath.DELETE_SUBJECT).then().statusCode(200);
    }

    @Then("that SUBJECTS details must be deleted")
    public void that_subjects_details_must_be_deleted() {
        System.out.println("Actual status code:" + get(baseURI+APIPath.apiPath.DELETE_SUBJECT).getStatusCode());
        Assert.assertEquals(200,get(baseURI+APIPath.apiPath.DELETE_SUBJECT).statusCode());
    }

    @When("User try to delete specific LOCATION block")
    public void user_try_to_delete_specific_location_block() {
        given().when().delete(APIPath.apiPath.DELETE_LOCATION).then().statusCode(200);
    }

    @Then("that LOCATION details must be deleted")
    public void that_location_details_must_be_deleted() {
        System.out.println("Actual status code:" + get(baseURI+APIPath.apiPath.DELETE_LOCATION).getStatusCode());
        Assert.assertEquals(200,get(baseURI+APIPath.apiPath.DELETE_LOCATION).getStatusCode());

    }

}
