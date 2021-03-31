package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin  = {"html:target/Destination",
				"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
		features = ("src/test/java/Features"),
		glue = {"Steps"}
)

public class AmazonTestRunner {

}
