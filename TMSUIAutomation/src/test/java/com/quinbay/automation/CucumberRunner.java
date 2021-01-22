package com.quinbay.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json","pretty", "html:target/cucumber/report.html"},
        tags="@TmsFeature",
        glue = {"com.quinbay.automation.steps"},
        features = "src/test/resources/features/Tms.feature"

)
public class CucumberRunner {
}