package com.Library_Tests.pages;

import com.Library_Tests.utils.BrowserUtils;
import com.Library_Tests.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BookPage extends PageBase {

    @FindBy(css = "i[class='fa fa-book']")
    private WebElement book;

    @FindBy(css = "input[type='search']")
    private WebElement searchBox;





    public void clickBook(){
        book.click();
    }

    public void sendTextSearchBox(String authorName1,String authorName2) {
        searchBox.sendKeys(authorName1);
        BrowserUtils.wait(1);
        searchBox.clear();
        BrowserUtils.wait(1);
        searchBox.sendKeys(authorName2);
        BrowserUtils.wait(1);

    }
}

