package com.actitimeautomation.Framework;

import com.actitimeautomation.PropertyHandling;
import com.actitimeautomation.pages.common.BaseClass;
import com.actitimeautomation.pages.page.CustomerPage;
import com.actitimeautomation.pages.page.LoginPage;
import com.actitimeautomation.pages.page.ProjectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProjectTest extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;
    ProjectPage projectPage;
    LoginPage loginPage;

    @BeforeClass
    public void setup() throws Exception {
        propertyHandling = new PropertyHandling();
        String browser = propertyHandling.getProperty("Browser");
        launchBrowser(browser);
        driver = super.driver;
        String url = propertyHandling.getProperty("URl");
        driver.get(url);
        LoginPage LoginP = new LoginPage(driver);
        String username = propertyHandling.getProperty("Username");
        String password = propertyHandling.getProperty("password");
        LoginPage.login(username, password);
        Thread.sleep(5000);
        customerPage = new CustomerPage(driver);
        projectPage = new ProjectPage(driver);
    }

    @DataProvider
    public Object[][] getTestData()
    {Object[][]obj=new Object[][]
            {
        {"muskan nasik", "muskan123"}
    };
    return obj;
}
    @Test(priority = 1,dataProvider = "getTestData")
    public void verifycreateproject(Object projectName,Object projectDesc) throws InterruptedException {
        driver.findElement(customerPage.taskmodule).click();
        driver.findElement(customerPage.addNewButton).click();
        Thread.sleep(5000);
        projectPage.createProject(projectName.toString());
        //
    }
    @Test(priority = 2,dataProvider ="getTestData" )
    public void description(Object projectName,Object projectDesc) throws InterruptedException {
        projectPage.createDescription(projectDesc.toString());
    }
    //@AfterClass
   // public void tearDown(){
      //  driver.quit();
    //}

}
