package com.actitimeautomation;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class VerifyLogin extends BaseClass {
    WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
        PropertyHandling propertyHandling=new PropertyHandling();
        String Browser=propertyHandling.getProperty("Browser");
        launchBrowser(Browser);


    }

}
