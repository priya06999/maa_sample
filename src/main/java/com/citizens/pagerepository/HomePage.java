package com.citizens.pagerepository;

import com.citizens.utils.GenericMethods;
import com.sun.jna.WString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage extends GenericMethods {

    private static final String LEFT_NAV = "//ul[contains(@class,'nav')]";
    String letNavTabsList="//li[contains(@class,'nav-item')]//a";


    private static final By leftNanTabList= By.xpath("//li[contains(@class,'nav-item')]//a");
    private static final By LIP_TRAIL_BALANCE= By.xpath("//a[contains(.,'Lip Trial Balance')]");
    private static final By Admin_Link = By.xpath("//a[contains(text(),'Admin')]");
    private static final By DailyGLDetail_Link = By.xpath("//a[contains(text(),'Daily GL Detail')]");
    private static final By DailyGLAcoountDetail_text =By.xpath("//h1[contains(text(),'Daily GL Account Detail')]");

    private static final By DailyGLSummary_Link = By.xpath("//a[contains(text(),'Daily GL Summary')]");
    private static final By DailyGLAcoountSummary_text =By.xpath("//h1[contains(text(),'Daily GL Account Summary')]");


    public List<WebElement> getLeftNavLinks(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return driver.findElements(By.xpath(LEFT_NAV));
    }

    public void verifyLeftNavLink(String linkName) {
        List<WebElement> tabList=getWebelemntList(leftNanTabList);

        boolean actualStatus = driver.findElements(By.xpath("//li[contains(@class,'nav-item')]//a[normalize-space(.)='" + linkName +"']")).size()>0;

        //Assert.assertTrue(expStatus == actualStatus, linkName + " is " + (expStatus? "not ": "") + " found.");
    }

    public void clickOnLipTrailBalanace(){

        click(LIP_TRAIL_BALANCE,"Lip Trail Balance");

    }

    public void clickOnAdminlink(){

        click(Admin_Link,"Click on Admin Link");
    }
    public void clickDailyGLAccountDetail(){
        click(DailyGLDetail_Link,"Click on Daily GL Details tab");
        waitForVisibiltyOfWebElement(DailyGLAcoountDetail_text);
    }

    public void clickDailyGLSummary(){

        click(DailyGLSummary_Link,"Click on Daily GL Summary tab");
        waitForVisibiltyOfWebElement(DailyGLAcoountSummary_text);
    }
}
