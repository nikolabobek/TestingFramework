package runner_classes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                 "json:target/cucumber.json"
        },
        glue = "step_definitions",
        features = "src/test/resources/features/"

)

public class CukesRunner {



}
