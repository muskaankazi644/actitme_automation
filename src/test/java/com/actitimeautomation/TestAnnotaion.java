package com.actitimeautomation;

import org.testng.annotations.*;

public class TestAnnotaion {
    public void TestAnnotation() {
        System.out.println("Testannotaion");

    }

    public void TestAnnotion() {
        System.out.println("constructor");
    }
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("This is Bclass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("afterclass");
    }
    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("beforemethod");
    }
    @AfterMethod
    public void afterclass()
    {
        System.out.println("aftermethod");
    }
    @Test
    public void test1()
    {
        System.out.println("test1");
    }
    @Test
    public void test2()
    {
        System.out.println("test2");
    }
    @Test
    public void test3()
    {
        System.out.println("Tesst3");
    }



}

