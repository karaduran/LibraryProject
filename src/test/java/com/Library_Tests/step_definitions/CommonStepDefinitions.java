package com.Library_Tests.step_definitions;

import com.Library_Tests.utils.ConfigurationReader;
import com.Library_Tests.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefinitions {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

}
