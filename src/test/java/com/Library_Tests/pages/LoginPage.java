package com.Library_Tests.pages;

import com.Library_Tests.utils.BrowserUtils;
import com.Library_Tests.utils.ConfigurationReader;
import com.Library_Tests.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {


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
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys(password, Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }


    public void loginStudent(){

            String usernameValueStudent = ConfigurationReader.getProperty("username.student");
            String passwordValueStudent = ConfigurationReader.getProperty("password.student");


            usernameInputBox.sendKeys(usernameValueStudent);
            passwordInputBox.sendKeys(passwordValueStudent,Keys.ENTER);
            BrowserUtils.wait(2);



    }

}
