package com.qualims.maintenance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@Category(AcceptanceTest.class)
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:FeaturesReport"},
        features = {"src/acceptance-test/resources/features"})
public class FizzBuzzAcceptanceTest {

}


