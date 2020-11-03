package com.Library_Tests.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/Library_Tests/step_definitions",
        dryRun = false,
        tags = "@search_book",
        //tags = "@login_librarian",
        publish = true
)


public class CucumberRunner {
}
