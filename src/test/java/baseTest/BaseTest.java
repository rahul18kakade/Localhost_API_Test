package baseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utits.Configuration;

import java.util.Properties;

public class BaseTest {
static Properties prop;
    public static String base_Test(){
          Configuration.readProperties(prop.getProperty("base_URI"));
        return null;
    }

}
