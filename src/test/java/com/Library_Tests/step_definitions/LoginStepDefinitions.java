package com.Library_Tests.step_definitions;

import com.Library_Tests.pages.LoginPage;
import com.Library_Tests.pages.PageBase;
import com.Library_Tests.utils.BrowserUtils;
import com.Library_Tests.utils.ConfigurationReader;
import com.Library_Tests.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();


    @When("user logs in as librarian")
    public void userLogsInAsLibrarian(){

        loginPage.login();
    }


    @When("user logs in as a {string}")
    public void userLogsInAsA(String student) {
        loginPage.loginStudent();

    }
}
