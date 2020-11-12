package com.Library_Tests.pages;

import com.Library_Tests.utils.BrowserUtils;
import com.Library_Tests.utils.ConfigurationReader;
import com.Library_Tests.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {

    BookPage bookPage = new BookPage();


    @FindBy(id = "inputEmail")
    private WebElement usernameInputBox;

    @FindBy(id = "inputPassword")
    private WebElement passwordInputBox;


    public void login() {

        String username = ConfigurationReader.getProperty("username.librarian");
        String password = ConfigurationReader.getProperty("password.librarian");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(usernameInputBox));

        usernameInputBox.sendKeys(username);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys(password, Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

/*
    public void loginStudent(){

            String usernameValueStudent = ConfigurationReader.getProperty("username.student");
            String passwordValueStudent = ConfigurationReader.getProperty("password.student");


            usernameInputBox.sendKeys(usernameValueStudent);
            passwordInputBox.sendKeys(passwordValueStudent,Keys.ENTER);
            BrowserUtils.wait(2);

    }

 */

    public void login(String role){

        if(role.equalsIgnoreCase("librarian")){
            usernameInputBox.sendKeys(ConfigurationReader.getProperty("username.librarian"));
            passwordInputBox.sendKeys(ConfigurationReader.getProperty("password.librarian"),Keys.ENTER);
            Assert.assertEquals("Not equal",ConfigurationReader.getProperty("librarianPageTitle"),bookPage.getPageTitleText());

        }else if(role.equalsIgnoreCase("student")){
            usernameInputBox.sendKeys(ConfigurationReader.getProperty("username.student"));
            passwordInputBox.sendKeys(ConfigurationReader.getProperty("password.student"),Keys.ENTER);
            Assert.assertEquals("Not equal",ConfigurationReader.getProperty("studentPageTitle"),bookPage.getPageTitleText());


        }

    }

}
