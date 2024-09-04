package com.actitimeautomation;

import com.actitimeautomation.pages.common.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class Windowhandling extends BaseClass {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        launchBrowser("chrome");
        driver = super.driver;
    }
    @Test
            public void windowhandling(){
        driver.navigate().to("https://online.actitime.com/automation1/timetrack/enter.do");
        driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
        String parentsWindowId=driver.getWindowHandle();
        System.out.println( parentsWindowId);
         Set<String> allWindowIds=driver.getWindowHandles();
         System.out.println(allWindowIds);
         for(String Id:allWindowIds)
        {
            if(Id.equals( parentsWindowId))
            {
                System.out.println("second tab id" + Id);
                driver.switchTo().window(Id);
                String childwindowtitle=driver.getTitle();
                System.out.println(childwindowtitle);
                //close tab
                driver.close();
                break;
            }

        }


    }

}
