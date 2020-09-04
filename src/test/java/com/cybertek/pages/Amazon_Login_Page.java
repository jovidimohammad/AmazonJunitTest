package com.cybertek.pages;


import com.cybertek.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page {

    public Amazon_Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='nav-signin-tooltip']")
    public  WebElement signButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='nav_prefetch_yourorders']/span")
    public WebElement yourOrders;


    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement menu;


    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[52]/a")
    public WebElement signOut;



}