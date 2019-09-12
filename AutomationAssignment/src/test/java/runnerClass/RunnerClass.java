package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features" },
				 glue = { "stepDefinitions", "hooks" },
				 tags = { "@ProductPurchase,@UpdateInformation" },
				 plugin = { "pretty","html:target/cucumberHTMLReports" })
public class RunnerClass {

}

 