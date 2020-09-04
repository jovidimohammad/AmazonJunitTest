//package com.cybertek.step_definitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class MouseHover2 {
//
//    public static WebDriver driver;
//
//    public static void main(String[] args) {
//
//        //Set system properties for geckodriver This is required since Selenium 3.0
//        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");
//
//        // Launch the URL
//        driver.get("https://demoqa.com/slider/");
//        System.out.println("demoqa webpage Displayed");
//
//        //Maximise browser window
//        driver.manage().window().maximize();
//
//        //Adding wait
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//
//        //Instantiate Action Class
//        Actions actions = new Actions(driver);
//        //Retrieve WebElemnt 'slider' to perform mouse hover
//        WebElement slider = driver.findElement(By.id("slider"));
//        //Move mouse to x offset 50 i.e. in horizontal direction
//        actions.moveToElement(slider,50,0).perform();
//        slider.click();
//        System.out.println("Moved slider in horizontal directions");
//
//        // Close the main window
//        driver.close();
//    }
//
//}