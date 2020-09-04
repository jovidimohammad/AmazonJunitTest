//package com.cybertek.step_definitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//public class MouseHover {
//
//    WebDriver driver;
//    String baseUrl;
//
//    @Test
//    public void MouseMover(){
//        baseUrl = "https://www.amazon.com";
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(baseUrl);
//
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("<span class=\"nav-line-2 nav-long-width\">Account &amp; Lists<span class=\"nav-icon nav-arrow\" style=\"visibility: visible;\"></span>\n" +
//                "  </span>"));
//        action.moveToElement(element).build().perform();
//    }
//}
