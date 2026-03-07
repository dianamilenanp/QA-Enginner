import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features",
        //glue={"src/test/java/StepDefinition"},
        glue = {"StepDefinition","Hooks"},
        plugin={"pretty","html:target/cucumber-report",
        "json:target/cucumber.json"}
)

public class TestRunner {

}
