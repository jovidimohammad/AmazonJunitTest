package com.cybertek.step_definitions;

import com.cybertek.pages.Amazon_Login_Page;
import com.cybertek.utilities.Driver;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Step_Defs {

    Amazon_Login_Page login_page = new Amazon_Login_Page();


    @When("User on amazon home page")
    public void user_on_amazon_home_page() { Driver.driver.get("https://www.amazon.com");
    }
    @When("User clicks login")
    public void loginButton() throws InterruptedException {
        login_page.signButton.click();
        Thread.sleep(1000);
    }

    @When("User types email")
    public void user_login() throws InterruptedException {
        login_page.email.sendKeys("jmohammadismoil@gmail.com" + Keys.ENTER);
        Thread.sleep(1000);
    }
//    @When("User presses continue")
//    public void user_clicks_continue() throws InterruptedException {
//        login_page.continueButton.click();
//        Thread.sleep(000);
//    }
    @When("User types password")
    public void user_password_click() throws InterruptedException {
        login_page.password.sendKeys("Jovidamazon2025" + Keys.ENTER);
        Thread.sleep(1000);
    }

    @When("User hover mouse")
    public void hoverMouse() throws InterruptedException {;
    Actions actions =new Actions(Driver.getDriver());
    WebElement hoverMouseTo = Driver.driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
    actions.moveToElement(hoverMouseTo).perform();
        Thread.sleep(1000);
    }
    @When("User clicks your orders")
    public void user_clicks_yourOrders() throws InterruptedException {
        login_page.yourOrders.click();
        Thread.sleep(1000);

        Driver.driver.navigate().back();
    }
    @When("User clicks menu")
    public void menu() throws InterruptedException {
        login_page.menu.click();
        Thread.sleep(1000);


    }
    @When("User scrolls down")
    public void scroll_Down() throws InterruptedException {
    WebElement link = Driver.driver.findElement(By.linkText("Sign Out"));
    JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
    Thread.sleep(1000);
    js.executeScript("arguments[0].scrollIntoView(true)", link);
    Thread.sleep(1000);

    }
    @When("User sign out")
    public void click_log_out() {
        login_page.signOut.click();
        Driver.driver.close();
    }
}
