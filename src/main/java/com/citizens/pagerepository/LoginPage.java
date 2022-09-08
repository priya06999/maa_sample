package com.citizens.pagerepository;

import com.citizens.utils.GenericMethods;
import org.openqa.selenium.By;

public class LoginPage extends GenericMethods {

    private By loginButton=By.xpath("//a[contains(text(),'Log in')]");

    private By userNameField=By.xpath("//input[@id='okta-signin-username']");
    private By passwordField=By.xpath("//input[@id='okta-signin-password']");
    private By signInButton=By.xpath("//input[@id='okta-signin-submit']");

    private By oktaPush=By.xpath("//input[@class='button button-primary']");

    public void clicOnLoginButton(){

        click(loginButton,"Click  on login button");
    }

    public void enterUserName(String userName) throws InterruptedException {

        enterData(userNameField,userName);
    }

    public void loginTOApplication(String userName, String password) throws InterruptedException {
        click(loginButton,"Click on login button");

        if(driver.findElement(userNameField).isDisplayed()){
            enterData(userNameField,userName);
            enterData(passwordField,password);
            click(signInButton,"Clic on submit button");
        }
            click(oktaPush,"Okta push button");
        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }

    }





}
