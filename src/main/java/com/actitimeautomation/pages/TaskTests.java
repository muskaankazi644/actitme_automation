package com.actitimeautomation.pages;

import com.actitimeautomation.pages.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTests {
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/automation1/timetrack/enter.do");
        LoginPage loginP=new LoginPage(driver);
        loginP.login("karve","1234567890");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(3000);
        //enter customer name
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Muskan7");
        Thread.sleep(5000);
        //add description
      driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Student7");
      Thread.sleep(5000);
      //driver.quit();
        //create customer icon
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        Thread.sleep(5000);
        //add to new
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
        //create project

        driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
        Thread.sleep(5000);
        //create new project
        driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("EY");
        Thread.sleep(5000);
        //add to project description
        driver.findElement(By.xpath("//textarea[@placeholder='Add Project Description']")).sendKeys("Software");

        Thread.sleep(5000);
        //create project
        driver.findElement(By.xpath("//div[text()='Create Project']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='titleContainer']/descendant::div[text()='Add Task']")).click();



    }

}
