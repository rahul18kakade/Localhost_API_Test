package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\User\\Local_API_Test\\src\\test\\java\\functionalTests\\GET_ApiTest.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:reports/test-output/htmlReport.html","json:reports/test-output/jsonReport.json"},
//        dryRun = true,
        monochrome = true
)


public class TestRunnerForGET {
}
