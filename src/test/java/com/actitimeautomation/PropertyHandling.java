package com.actitimeautomation;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
    WebDriver driver;
    Properties properties;
    public PropertyHandling() throws IOException {

 String filepath= System.getProperty("user.dir")+"/config.properties";
 FileInputStream fileInputStream=new FileInputStream(filepath);


         properties=new Properties();
        properties.load(fileInputStream);
    }
    public String getProperty(String key){
         return properties.getProperty(key);
    }

}
