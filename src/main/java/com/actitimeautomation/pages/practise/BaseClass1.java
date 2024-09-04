package com.actitimeautomation.pages.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {public class BaseClass {
    WebDriver driver;
    public void launchbrowser(String browserName){
        if(browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firebox")){
            driver=new FirefoxDriver();
        }
    }
}

}
