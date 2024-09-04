package com.actitimeautomation.Framework;

import com.actitimeautomation.PropertyHandling;
import com.actitimeautomation.pages.common.BaseClass;
import com.actitimeautomation.pages.page.LoginPage;
import com.actitimeautomation.pages.page.CustomerPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTest extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;

    @BeforeClass
    public void setup() throws Exception {
        propertyHandling = new PropertyHandling();
        String browser = propertyHandling.getProperty("Browser");
        launchBrowser(browser);
        driver = super.driver;
        driver.get(propertyHandling.getProperty("URl"));
        LoginPage loginP = new LoginPage(driver);
        Thread.sleep(5000);
        String username = propertyHandling.getProperty("Username");
        String password = propertyHandling.getProperty("password");
        LoginPage.login(username, password);
        Thread.sleep(3000);
        customerPage = new CustomerPage(driver);
    }


    @Test
        public void verifyCustomer() throws InterruptedException {
        customerPage.createcustomer("muskan");
        customerPage.verifyCustomer("muskan");
    }

}
