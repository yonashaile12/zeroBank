package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Step_Definitions",
        dryRun = false,
        tags = "@login",
        publish = true
)


public class CukesRunner {
}
