package com.citizens.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setUpBrowser() {

        driver = getWebDriver(PropReader.readPropertyValue("browser"));
        driver.get(PropReader.readPropertyValue("url"));
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUpBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


    public WebDriver getWebDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            default:
                throw new InvalidArgumentException("Invalid Browser : " + browserName);
        }
        return driver;
    }
}
