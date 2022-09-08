package com.citizens.pagerepository;

import com.citizens.utils.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AdminlandingPage extends GenericMethods {

    private static final By Admin_Landing_text = By.xpath("//h1[contains(text(),'Admin Landing Page')]");

    private static final By PlanGroup_ClickHereLink = By.xpath("//div[contains(text(),'Plan Ids by Plan Group Ids')]/following-sibling::div/a");

    private static final By PlanGroupIDs = By.xpath("//div[@class='rz-datatable-scrollable-table-wrapper']//tr");


    private static final By Entire_TransactionMap_ClickHereLink = By.xpath("//div[contains(text(),'Entire Transaction Map')]/following-sibling::div/a");
    private static final By Recent_Events_ClickHereLink = By.xpath("//div[contains(text(),'Recent Events')]/following-sibling::div/a");
    private static final By Recent_Transactions_ClickHereLink = By.xpath("//div[contains(text(),'Recent Transactions')]/following-sibling::div/a");
    private static final By Recent_EventFiredTimeStamp = By.xpath("(//span[@class='rz-column-title'])[4]");
    private static final By Recent_EventFiredDate = By.xpath("//div[@class='rz-datatable-scrollable-table-wrapper']//tbody/tr[1]/td[4]/span[@class='rz-cell-data']");
    private static final By Admin_Amounts_ClickHereLink = By.xpath("//div[contains(text(),'Admin Amounts')]/following-sibling::div/a");
    private static final By LOAN_NUM_TEXTFIELD = By.xpath("//input[@id='lnNum']");
    private static final By SEARCH_BUTTON = By.xpath("//button[contains(text(),'Search')]");
    private static final By LOAN_NAME = By.xpath("//th[contains(@class,'rz-unselectable-text rz-sortable-column')]//span[@class='rz-column-title'][normalize-space()='LoanAmount']");

    private static final By AP_Extract_ClickHereLink = By.xpath("//div[contains(text(),'AP Extract')]/following-sibling::div/a");
    private static final By AP_Extract_LandingPage= By.xpath("//h1[contains(text(),'Empower AP Extract')]");


    private static final By Check_Disbursements_ClickHereLink = By.xpath("//div[contains(text(),'Check Disbursements')]/following-sibling::div/a");
    private static final By Check_Disbursements_LandingPage = By.xpath("//h1[contains(text(),'Empower Check Disbursements')]");

    private static final By Wire_Extract_ClickHereLink = By.xpath("//div[contains(text(),'Wire Extract')]/following-sibling::div/a");
    private static final By Wire_Extract_LandingPage = By.xpath("//h1[contains(text(),'Empower Wire Extract')]");

    private static final By Empower_AB_ClickHereLink = By.xpath("//div[contains(text(),'Empower AB')]/following-sibling::div/a");
    private static final By Empower_AB_LandingPage = By.xpath("//h1[contains(text(),'Empower AB Daily')]");

    private static final By Test_All_Applicable_Events_ClickHereLink = By.xpath("//div[contains(text(),'Test All Applicable Events')]/following-sibling::div/a");
    private static final By Test_All_Applicable_Events_LandingPage = By.xpath("//h1[contains(text(),'Test All Applicable Events')]");

    private static final By Empower_GL_ClickHereLink = By.xpath("//div[contains(text(),'Empower GL')]/following-sibling::div/a");
    private static final By Empower_GL_LandingPage = By.xpath("//h1[contains(text(),'Empower GL Daily')]");

    private static final By Admin_Events_ClickHereLink = By.xpath("//div[contains(text(),'Admin Events')]/following-sibling::div/a");
    private static final By Admin_Events_LandingPage = By.xpath("//h1[contains(text(),'Admin Events')]");

    private static final By Run_Event_Manually_ClickHereLink = By.xpath("//div[contains(text(),'Run Event Manually')]/following-sibling::div/a");
    private static final By Run_Event_Manually_LandingPage = By.xpath("//h1[contains(text(),'Run Event Manually')]");



    public void verifyLandingPage(){

    }

    public void clickOnPlanGroupClickHereButton(){
        click(PlanGroup_ClickHereLink,"plan group click here button");
    }
    public int getPlanGroupIdSize(){
        List<WebElement> planGroupIdList=getWebelemntList(PlanGroupIDs);
        return planGroupIdList.size();
    }
    public void clickEntireTransactionMapClickHereButton(){
        click(Entire_TransactionMap_ClickHereLink,"Entire transaction map click here button");
    }

    public void clickRecentEventsClickHereButton(){
        click(Recent_Events_ClickHereLink,"Recent Events click here button");

    }
    public void clickRecentTransactionsClickHereButton() {
        click(Recent_Transactions_ClickHereLink, "Recent Transactions click here button");
    }

    public void clickEventFiredTimeStampClickHereButton() {
        click(Recent_EventFiredTimeStamp, "Events Fired Time Stamp click here button");
    }
    public void getDateAndValidateWIthCurrentDate(){
        String date=getText(Recent_EventFiredDate,"");
        String [] datearray = date.split(" ");
        System.out.println(datearray[0]);
        String dateFromUI=datearray[0];

        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,0);
        Date currenTDate=cal.getTime();

        String todayDate=sdf.format(currenTDate);
        System.out.println(todayDate);
        Assert.assertTrue(dateFromUI.equals(todayDate),"Actual date is"+ dateFromUI
                + " not matching with expected date" + todayDate);
    }

    public void clickAdminAccountsClickHereButton(){
        click(Admin_Amounts_ClickHereLink,"Admin accounts click here button");

    }
    public void enterLoanNumber(String loanNumber) throws InterruptedException {

        enterData(LOAN_NUM_TEXTFIELD,loanNumber);

    }
    public void clickOnSearchButton(){
        click(SEARCH_BUTTON,"Click on search button");

    }
    public void getLoanNumberAndVerify(String expectedLoanNumber){
        String actualLoanNumber=getText(LOAN_NAME,"get loan number from UI");
        Assert.assertTrue(expectedLoanNumber.equals(actualLoanNumber),"Actual loan number is"+actualLoanNumber+" not matching with expected loan number"+expectedLoanNumber);

    }

    public void verifyNameISpresent(){
        //String actualLoanNumber=getText(LOAN_NAME,"get loan number from UI");
        Assert.assertTrue(getWebelement(LOAN_NAME).isDisplayed(),"Loan name is not displayed after searching with loan number");

    }

    public void clickAPExtractClickHereButton(){
        click(AP_Extract_ClickHereLink,"AP Extract click here button");
        waitForVisibiltyOfWebElement(AP_Extract_LandingPage);
    }

    public void clickCheckDisbursementsClickHereButton(){
        click(Check_Disbursements_ClickHereLink,"Check Disbursement click here button");
        waitForVisibiltyOfWebElement(Check_Disbursements_LandingPage);
    }

    public void clickWireExtractClickHereButton() {
        click(Wire_Extract_ClickHereLink, "Wire Extract click here button");
        waitForVisibiltyOfWebElement(Wire_Extract_LandingPage);
    }

    public void clickEmpowerABClickHereButton(){
        click(Empower_AB_ClickHereLink,"Empower AB click here button");
        waitForVisibiltyOfWebElement(Empower_AB_LandingPage);
    }

    public void clickTestAllApplicableEventsClickHereButton(){
        click(Test_All_Applicable_Events_ClickHereLink,"Test All Applicable Events click here button");
        waitForVisibiltyOfWebElement(Test_All_Applicable_Events_LandingPage);
    }

    public void clickEmpowerGLClickHereButton(){
        click(Empower_GL_ClickHereLink,"Empower GL click here button");
        waitForVisibiltyOfWebElement(Empower_GL_LandingPage);
    }

    public void clickAdminEventsClickHereButton(){
        click(Admin_Events_ClickHereLink,"Admin Events click here button");
        waitForVisibiltyOfWebElement(Admin_Events_LandingPage);
    }

    public void clickRunEventManuallyClickHereButton(){
        click(Run_Event_Manually_ClickHereLink,"Run Event Manually click here button");
        waitForVisibiltyOfWebElement(Run_Event_Manually_LandingPage);
    }


    }
