package com.actitimeautomation.pages;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass extends BaseClass
{
    static WebDriver driver;
    public Actionclass()
    {
        launchBrowser("chrome");
        driver=super.driver;
    }
    public static void main(String[]args)throws InterruptedException
    {
        new Actionclass();
        driver.get("https://online.actitime.com/automation1/timetrack/enter.do");
        Actions actions=new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("username")),"karve").build().perform();
        actions.sendKeys(driver.findElement(By.name("pwd")),"1234567890").build().perform();
        actions.click(driver.findElement(By.xpath("//div[starts-with( text(),'Login ')]"))).build().perform();
        Thread.sleep(5000);
        actions.click(driver.findElement(By.xpath("//div[@id='container_tasks']"))).build().perform();
        Thread.sleep(5000);
        actions.scrollToElement(driver.findElement(By.xpath("//div[@title='Muskan']"))).build().perform();
    }


}
