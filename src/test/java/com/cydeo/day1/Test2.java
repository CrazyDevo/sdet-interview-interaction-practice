package com.cydeo.day1;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa.seamlessly.net/index.php/login");

      String color=  driver.findElement(By.xpath("//body")).getCssValue("background-color");

        System.out.println("color = " + color);

        Assertions.assertEquals("rgba(0, 228, 189, 1)",color);

    }
}
