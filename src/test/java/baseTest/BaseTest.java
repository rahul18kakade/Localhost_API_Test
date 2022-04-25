package baseTest;

import io.restassured.RestAssured;
import utits.Configuration;

public class BaseTest {

    public void base_Test(){
  //   Configuration.readProperties(prop.getProperty("base_URI"));
       RestAssured.baseURI="http://localhost:3000";
    }
}
