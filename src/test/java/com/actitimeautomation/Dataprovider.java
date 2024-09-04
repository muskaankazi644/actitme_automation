package com.actitimeautomation;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Dataprovider extends BaseClass {
    WebDriver driver= new ChromeDriver();
    @BeforeClass
    public void setup(){
        launchBrowser("chrome");
        driver.navigate().to("");
    }

}
