package com.test.nopcommerce.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Utilies {

    WebDriver driver;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);


    public Utilies (WebDriver driver){
        this.driver =driver;
    }

    public WebElement getElement(By locator){
        WebElement element =driver.findElement(locator);
        return element;
    }

    public void emailrandom(By locator, String value){
        //getElement(locator).sendKeys(value);
        getElement(locator).sendKeys(value+ randomInt +"@gmail.com");
    }
    public void doSendkey(By locator, String value){
        //getElement(locator).sendKeys(value);
        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator){
        getElement(locator).click();
    }

    public void genderselect(By locator){
        getElement(locator).click();
    }

    public void dobClick(By locator){
        getElement(locator).click();
    }

    public void dob(By locator , String value){
        getElement(locator).sendKeys(value);
    }
}
