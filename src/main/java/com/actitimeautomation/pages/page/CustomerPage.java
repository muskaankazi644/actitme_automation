package com.actitimeautomation.pages.page;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends BaseClass {
     WebDriver driver;
    public CustomerPage(WebDriver driver){
        this.driver=driver;
        launchBrowser("chrome");
    }
    public By taskmodule= By.id("container_tasks");
    //public By addNewButton=By.id("//div[@class='title ellipsis']");
    public By addNewButton=By.xpath("//div[@class='title ellipsis']");
    public By createNewCustomer=By.xpath("//div[@class='item createNewCustomer']");
    public By customerNameText=By.xpath("//div[@id='customerLightBox']/descendant::input[1]");
    public By createCustomerButton=By.xpath("//div[text()='Create Customer']");
    public By searchText=By.xpath("//div[@class='searchAndExportContainer']/descendant::input");

    public void createcustomer(String customerName) throws InterruptedException {
        driver.findElement(taskmodule).click();
        Thread.sleep(5000);
        driver.findElement(addNewButton).click();
        Thread.sleep(5000);
        driver.findElement(createNewCustomer).click();
        Thread.sleep(5000);
        driver.findElement(customerNameText).sendKeys(customerName);
        Thread.sleep(5000);
        driver.findElement(createCustomerButton).click();

    }
    public void verifyCustomer(String customerName){

        driver.findElement(searchText).sendKeys(customerName);
    }

}
