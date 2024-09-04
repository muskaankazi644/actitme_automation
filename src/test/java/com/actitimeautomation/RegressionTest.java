package com.actitimeautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegressionTest {
    @BeforeClass(groups={"sanity"})
    public void beforeclass(){
        System.out.println("sanitytest");
    }
    @AfterClass(groups = {"regression"})
    public void afterclass(){
        System.out.println("regression");

    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups={"sanity"})
    public void test2(){
        System.out.println("sanity");
    }

}
