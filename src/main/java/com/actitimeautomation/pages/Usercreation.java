package com.actitimeautomation.pages;

import com.actitimeautomation.pages.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usercreation {
    public static void main(String[]args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/automation1/timetrack/enter.do");
        LoginPage loginP=new LoginPage(driver);
        loginP.login("karve","1234567890");
        Thread.sleep(5000);
        //create user
        driver.findElement(By.xpath("//div[text()='Users']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='New User']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Rahul");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("patil");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("rahul@gmail.com");
        Thread.sleep(5000);

    }



}
