package com.actitimeautomation;

import com.actitimeautomation.pages.common.BaseClass;
import com.actitimeautomation.pages.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCustomer extends BaseClass {
    WebDriver driver;

    @BeforeClass
    public void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.navigate().to("https://online.actitime.com/tcs5/login.do");
        LoginPage loginP = new LoginPage(driver);
        loginP.login("muskank@yopmail.com", "1234567890");
        Thread.sleep(5000);
        //create user
        // driver.findElement(By.xpath("//div[text()='Users']")).click();
        //Thread.sleep(5000);
    }


    // Add customer
    @DataProvider
    public Object[][] getTestData() {
        Object[][] obj=new  Object[][]{
                {"Anika101"}, {"Joy101"}, {"Greta101"}, {"Marry101"}, {"john101"}
        };
        return obj;
    }

    @Test( priority = 1,dataProvider ="getTestData")
    public void createNumberOfCustomer(Object custName) throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
        //  Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
        //  Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(5000);
        //enter customer name
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(custName.toString());
        //create customer icon
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        Thread.sleep(5000);}

    @Test(priority = 2,dataProvider = "getTestData")
            public void verifyCustomer(Object custName) throws InterruptedException {
       // search the customer
       driver.findElement(By.xpath("//div[@class='searchAndExportContainer']/descendant::input")).sendKeys(custName.toString());
        Thread.sleep(5000);

    }
    // Delet the created customer
    @Test(priority = 3,dataProvider = "getTestData")
        public void deletcustomer(Object custName) throws InterruptedException{

    }
}

