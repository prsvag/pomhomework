package com.test.nopcommerce.Page;

import com.test.nopcommerce.Utilities.Utilies;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utilies utils;

    By registerlink = By.className("ico-register");
    By firstName = By.id("FirstName");
    By Lastname = By.id("LastName");
    By Emailid = By.id("Email");
    By Companyname = By.id("Company");
    By passwordtest = By.id("Password");
    By ConfirmPasswordtest = By.id("ConfirmPassword");
    By genderse = By.xpath("//*[text()='Male']");
    By days = By.xpath("//*[text()='3']");
    By dayclick = By.xpath("//*[text()='3']");
    By monthClick = By.xpath("//*[text()='May']");
    By yearClick = By.xpath("//*[text()='1995']");
    By registerbtn = By.id("register-button");


    public RegisterPage (WebDriver driver){
        this.driver =driver;
        utils = new Utilies(driver);
    }

    public void clickOnRegisterLink(){
        utils.doClick(registerlink);
    }
    public void doRegister(String Firstname, String lastname){
        utils.doSendkey(firstName,Firstname);
        utils.doSendkey(Lastname,lastname);

    }
    public void emailgen(String email){
        utils.emailrandom(Emailid, email);
    }

    public void selectgender(){
        utils.genderselect(genderse);
    }
    public void companyname(String company){
        utils.doSendkey(Companyname, company);
    }
    public void credential(String password, String confirmpassword){
        utils.doSendkey(passwordtest, password);
        utils.doSendkey(ConfirmPasswordtest, confirmpassword);
    }

    public void dateOfbirth(String dayselect){
        utils.dob(days, dayselect);
    }
    public void dateOfbirthclick() throws InterruptedException {
            utils.dobClick(dayclick);
            utils.dobClick(monthClick);
            utils.dobClick(yearClick);
            Thread.sleep(2000);
            utils.dobClick(registerbtn);
            Thread.sleep(4000);
        }

}
