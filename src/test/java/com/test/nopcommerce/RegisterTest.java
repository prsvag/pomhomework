package com.test.nopcommerce;

import com.test.nopcommerce.Base.BasePage;
import com.test.nopcommerce.Page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTest {

    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;
    @BeforeMethod
    public void openBrowser()  {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);

    }
    @Test
    public void RegisterTest() throws InterruptedException {
        registerPage.clickOnRegisterLink();
        registerPage.selectgender();
        registerPage.doRegister(prop.getProperty("Firstname"),prop.getProperty("lastname"));
        Thread.sleep(2000);
        registerPage.emailgen(prop.getProperty("email"));
        Thread.sleep(1000);
        registerPage.credential(prop.getProperty("Password"),prop.getProperty("ConfirmPassword"));
        registerPage.companyname(prop.getProperty("Company"));
        Thread.sleep(2000);
        registerPage.dateOfbirthclick();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
       driver.quit();
    }


}
