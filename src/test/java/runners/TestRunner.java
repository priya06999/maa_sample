package runners;

import com.citizens.utils.BaseRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-report/cucumber.html",
        "json:target/cucumber-report/cucumber.json",
        "html:io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"

},
        features = "src/test/resources/features",
        glue = {"com.citizens.stepdefinitions"},
        tags = "@Regression",
        monochrome = true

)
public class TestRunner extends BaseRunner {
}
