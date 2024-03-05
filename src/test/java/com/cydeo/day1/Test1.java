package com.cydeo.day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/hovers");

       // System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    String url=    ((JavascriptExecutor)driver).executeScript("return document.URL").toString();
        System.out.println("url = " + url);

        String title=    ((JavascriptExecutor)driver).executeScript("return document.title").toString();


        System.out.println("title = " + title);


     String linkText=   ((JavascriptExecutor)driver).executeScript(" return document.links[0].textContent").toString();

        System.out.println("linkText = " + linkText);

    }
}
