package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\Local_API_Test\\src\\test\\java\\functionalTests\\POST_ApiTest.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:reports/test-output-POST/htmlReport.html",
                "json:reports/test-output-POST/jsonReport.json"},
        dryRun = false,
        monochrome = true

                )

public class TestRunner_POST {
}
