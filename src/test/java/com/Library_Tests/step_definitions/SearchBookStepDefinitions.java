package com.Library_Tests.step_definitions;

import com.Library_Tests.pages.BookPage;
import com.Library_Tests.pages.LoginPage;
import com.Library_Tests.utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBookStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage = new BookPage();

    @When("user clicks the Books module")
    public void userClicksTheBooksModule() {
        bookPage.clickBook();
        BrowserUtils.wait(2);
    }



    @Then("user searches the book by giving the author name")
    public void userSearchesTheBookByGivingTheAuthorName() {
        bookPage.sendTextSearchBox("George Orwell");
        BrowserUtils.wait(2);
    }


    @Then("user searches the book by giving the {string}")
    public void userSearchesTheBookByGivingThe(String arg0) {
        bookPage.sendTextSearchBox(arg0);
    }
}
