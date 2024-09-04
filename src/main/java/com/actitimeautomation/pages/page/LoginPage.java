package com.actitimeautomation.pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    static WebDriver driver;
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
    }
    public static void login(String username, String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.xpath("//div[starts-with(text(),'Login')]")).click();
    }
}
