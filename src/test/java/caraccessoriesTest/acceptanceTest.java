package caraccessoriesTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html: target/cucumber.html"},features="use_cases",glue="caraccessoriesTest")
//@CucumberOptions(plugin= {"html: target/cucumber.html"},features="use_cases/request.feature",glue="caraccessoriesTest")
public class acceptanceTest {

}