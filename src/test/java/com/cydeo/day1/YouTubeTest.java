package com.cydeo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");

   String offsetTop=     driver.findElement(By.xpath("(//div[@id='container'])[2]")).getDomProperty("offsetTop");


        System.out.println("offsetTop = " + offsetTop);


    }
}
