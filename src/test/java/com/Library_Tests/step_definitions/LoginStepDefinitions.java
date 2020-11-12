package com.Library_Tests.step_definitions;

import com.Library_Tests.pages.BookPage;
import com.Library_Tests.pages.LoginPage;
import com.Library_Tests.pages.PageBase;
import com.Library_Tests.utils.BrowserUtils;
import com.Library_Tests.utils.ConfigurationReader;
import com.Library_Tests.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage = new BookPage();



    @When("user logs in as librarian")
    public void userLogsInAs() {
        loginPage.login();
    }




    @Then("user should see the Dashboard page")
    public void userShouldSeeTheDashboardPage() {

    }


    @When("user logs in as a {string}")
    public void userLogsInAsA(String arg0) {
        loginPage.login(arg0);
    }
}
