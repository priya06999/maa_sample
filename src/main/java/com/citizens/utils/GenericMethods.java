package com.citizens.utils;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GenericMethods extends BaseRunner{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    protected WebElement getWebelement(final By by){
        WebElement element = null;
        if(by != null)
        {
            element = driver.findElement(by);
        }else{
            System.out.println("by value is null");
        }
        return element;
    }

    protected List<WebElement> getWebelemntList(By by){
        List<WebElement> elements=new ArrayList<>();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        elements = driver.findElements(by);

        return  elements;
    }

    public String getText(By by, String locatorName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
       return getWebelement(by).getText();
    }
    public void click(By by, String locatorName){

        wait.until(ExpectedConditions.elementToBeClickable(getWebelement(by)));
        getWebelement(by).click();

    }

    public void enterData(By by, String inputData) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(getWebelement(by)));
        getWebelement(by).clear();
        Thread.sleep(3000);
        getWebelement(by).sendKeys(inputData);
        Thread.sleep(3000);
    }

    public void waitForVisibiltyOfWebElement(By by){

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));


    }
}
