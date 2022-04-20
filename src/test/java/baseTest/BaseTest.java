package baseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseTest {

    public void base_Test(){

          RestAssured.baseURI= "http://localhost:3000";

    }

}
