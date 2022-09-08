package com.citizens.stepdefinitions;


import com.citizens.pagerepository.AdminlandingPage;
import com.citizens.pagerepository.HomePage;
import com.citizens.pagerepository.LipTrailBalancePage;
import com.citizens.pagerepository.LoginPage;
import com.citizens.utils.GenericMethods;
import com.citizens.utils.PropReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserSteps  {

    LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();
    LipTrailBalancePage lipTrailBalancePage= new LipTrailBalancePage();
    AdminlandingPage adminLandingPage= new AdminlandingPage();

    @Given("^login to application \"([^\"]*)\",\"([^\"]*)\"$")
    public void login_to_application(String userName, String password) throws InterruptedException {
       loginPage.loginTOApplication(userName,password);
    }

    @Then("^Click on lip trail Balance$")
    public void navigate_to_lipTrailBalancePage_and_click_on_excelbutton() {
        homePage.clickOnLipTrailBalanace();
    }
    @Then("^click on excel button$")
    public void click_on_excelbutton() throws InterruptedException{
        Thread.sleep(4000);
        lipTrailBalancePage.clickOnExcelButton();
        Thread.sleep(4000);
    }
    @Then("^click on csv button$")
    public void click_on_csvbutton() throws InterruptedException{
        Thread.sleep(4000);
        lipTrailBalancePage.clickOncsvButton();
        Thread.sleep(4000);
    }

    @Then("^Click on Admin page$")
    public void click_on_admin_page() {
        homePage.clickOnAdminlink();

    }
    @Then("^Click on plangroup id click here button$")
    public void click_on_plangroupid_click_here_button() {
        adminLandingPage.clickOnPlanGroupClickHereButton();

    }
    @Then("^validate record size$")
    public void validate_record_Size() {
        int rowCount=adminLandingPage.getPlanGroupIdSize();
        Assert.assertTrue(rowCount>1,"row count size is :"+rowCount);
    }
    @Then("^Click on Entire Transaction Map button$")
    public void click_on_entire_Transaction_map_button() {
        adminLandingPage.clickEntireTransactionMapClickHereButton();
    }
    @Then("^Click on Recent events click button$")
    public void click_on_Recent_events_button() {
        adminLandingPage.clickRecentEventsClickHereButton();
    }

    @Then("^Click on Recent Transactions click button$")
    public void click_on_Recent_Transactions_button() {
        adminLandingPage.clickRecentTransactionsClickHereButton();
    }
//getDateAndValidateWIthCurrentDate

    @Then("^click on EventFiredTimestamp filter$")
    public void click_And_validate_date() throws InterruptedException{
        adminLandingPage.clickEventFiredTimeStampClickHereButton();
        Thread.sleep(3000);
        adminLandingPage.clickEventFiredTimeStampClickHereButton();
        adminLandingPage.getDateAndValidateWIthCurrentDate();
    }

    @Then("^Click on Admin Accounts click button$")
    public void click_on_Admin_Accounts_button() {
        adminLandingPage.clickAdminAccountsClickHereButton();
    }

    @Then("^Enter loan number and verify the same is displayed$")
    public void enter_loannumber_and_verify_the_Same() throws InterruptedException {
        adminLandingPage.enterLoanNumber("0022200554");
        adminLandingPage.clickOnSearchButton();
        //adminLandingPage.getLoanNumberAndVerify("0022200554");
        adminLandingPage.verifyNameISpresent();

    }

    @Then("^Click on AP Extract click button$")
    public void click_on_AP_Extract_button() {
        adminLandingPage.clickAPExtractClickHereButton();

    }

    @Then("^Click on DailyGLAccountDetail$")
    public void click_on_DailyGLAccountDetail() {
        homePage.clickDailyGLAccountDetail();

    }

    @Then("^Click on DailyGLAccountSummary$")
    public void click_on_DailyGLSummary() {
        homePage.clickDailyGLSummary();

    }

    @Then("^Click on check disbursement click button$")
    public void click_on_check_disbursement_button() {
        adminLandingPage.clickCheckDisbursementsClickHereButton();

    }
    @Then("^Click on wire extract click button$")
    public void click_on_wire_extract_button() {
        adminLandingPage.clickWireExtractClickHereButton();

    }
    @Then("^Click on empower AB click button$")
    public void click_on_empowerAB_extract_button() {
        adminLandingPage.clickEmpowerABClickHereButton();

    }
    @Then("^Click on Test all application events click button$")
    public void click_on_Test_all_application_Events_button() {
        adminLandingPage.clickTestAllApplicableEventsClickHereButton();

    }
    @Then("^Click on EMPower GL click button$")
    public void click_on_EMPower_GL_button() {
        adminLandingPage.clickEmpowerGLClickHereButton();

    }
    @Then("^Click on Admin events click button$")
    public void click_on_Admin_events_button() {
        adminLandingPage.clickAdminEventsClickHereButton();

    }
    @Then("^Click on Run Event Manually click button$")
    public void click_on_Run_Event_Manually_button() {
        adminLandingPage.clickRunEventManuallyClickHereButton();

    }


}

