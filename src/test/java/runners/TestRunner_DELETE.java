package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\Local_API_Test\\src\\test\\java\\functionalTests\\DELETE_ApiTest.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:reports/test-output-DELETE/htmlReport.html",
                "json:reports/test-output-DELETE/jsonReport.json"},
        dryRun = false,
        monochrome = true

                )

public class TestRunner_DELETE {
}
