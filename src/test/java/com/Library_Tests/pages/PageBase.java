package com.Library_Tests.pages;

import com.Library_Tests.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
