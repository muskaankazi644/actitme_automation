package com.actitimeautomation.pages;

import com.actitimeautomation.pages.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
    public static void main(String[]args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/automation1/tasks/tasklist.do");
        LoginPage loginP=new LoginPage(driver);
        loginP.login("karve","1234567890");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
        driver.findElement(By.xpath("//div[text()='task']")).click();
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();


    }
}
