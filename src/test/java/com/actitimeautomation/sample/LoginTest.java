package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[]args) throws Exception {
        WebDriver driver= new ChromeDriver();
        driver.get("https://online.actitime.com/automation1/login.do");


    /* //locate the username section and enter the name
       * driver.findElement(By.id("username")).sendKeys("karve");
        //enter the password
       // *driver.findElement(By.name("pwd")).sendKeys("1234567890");
        //click on login button
        *driver.findElement(By.xpath("//div[starts-with(text(),'Login')]")).click();
        **/
         driver.findElement(By.id("username")).sendKeys("karve$#@");
         driver.findElement(By.name("pwd")).sendKeys("1234567890");
         driver.findElement(By.xpath("//div[starts-with(text(),'login')]")).click();
         Thread.sleep(5000);
         // Error message
        String errormsg=driver.findElement(By.xpath("//span[starts-with(text(),'username and password')]")).getText();
        System.out.println(errormsg);
        if(errormsg.equals("Username or Password is invalid.Please try again. ")){
            System.out.println("Successfully verified error message");
        }else{
                    }
        //2nd secnario invalid username with invalid password
        driver.findElement(By.id("username")).sendKeys("muskan123");
        driver.findElement(By.name("password")).sendKeys("0987654321");
        driver.findElement(By.xpath("\"//div[starts-with(text(),'login')]")).click();
        Thread.sleep(5000);
        // error message
        String errormsg1=driver.findElement(By.xpath("//span[starts-with(text(),'username and password')]")).getText();
        System.out.println(errormsg1);
        if(errormsg1.equals("Username or Password is invalid.Please try again. ")){
            System.out.println("Successfully verified error message");
        }else {
            throw new Exception("Actual and expected message didnt matched");
        }
        // 3rd scenario valid username with blank password
        driver.findElement(By.id("username")).sendKeys("karve");
        driver.findElement(By.xpath("//span[starts-with(text(),'username and password')]")).click();




    }





}


