//package com.actitimeautomation.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class TaskTest1 extends BaseClass{
//    static WebDriver driver;
//    public TaskTest1 (){
//        launchBrowser("chrome");
//        driver=super.driver;
//
//    }
//    public static void main(String[]args)
//    {
//        TaskTest1 taskobject =new TaskTest1();
//        //navigate to website
//        driver.get("https://www.actitime.com/login-to-product/redirecting");
//        LoginPage loginP=new LoginPage(driver);
//        LoginPage.login("karve","1234567890");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//div[@id='container_tasks")).click();
//        Thread.sleep(5000);
//        //loacte select all check box and verify its displayed
//        boolean selectedAllCheckbox =driver.findElement(By.xpath(""));
//    }
//}
