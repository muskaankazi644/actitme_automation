package com.actitimeautomation.pages;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


    public class DropandDrag extends BaseClass {
        static WebDriver driver;
        public DropandDrag ()
        {
            launchBrowser("chrome");
            driver=super.driver;
        }
        public static void main (String[]args) throws InterruptedException
        {
            new DropandDrag();
            driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            String windowId=driver.getWindowHandle();
            System.out.println(windowId);
            driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe")));
            Thread.sleep(2000);
            //ul[@id='gallery']//li[4]
            WebElement srcEelement = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
            WebElement dstElement= driver.findElement(By.id("trash"));
            Actions actions=new Actions(driver);
            actions.dragAndDrop(srcEelement,dstElement).build().perform();
            //Thread.sleep(5000);
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());

            driver.quit();
        }




    }

