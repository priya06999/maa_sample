Feature: login to application and download csv file and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yashika1"
  @Regression
  Scenario: Validate end to end test scenarios
    Then Click on DailyGLAccountDetail
    And click on excel button
    And click on csv button
    Then Click on DailyGLAccountSummary
    And click on excel button
    And click on csv button
    Then Click on lip trail Balance
    And click on excel button
    And click on csv button
    Then Click on Admin page
    And Click on plangroup id click here button
    And validate record size
    Then Click on Admin page
    And Click on Entire Transaction Map button
    And click on csv button
    And click on excel button
    Then Click on Admin page
    And Click on Recent events click button
    And validate record size
    And click on EventFiredTimestamp filter
    Then Click on Admin page
    And Click on Recent Transactions click button
    And validate record size
    Then Click on Admin page
    And Click on Admin Accounts click button
    And Enter loan number and verify the same is displayed
    Then Click on Admin page
    And Click on AP Extract click button
    Then Click on Admin page
    And Click on check disbursement click button
    Then Click on Admin page
    And Click on wire extract click button
    Then Click on Admin page
    And Click on empower AB click button
    Then Click on Admin page
    And Click on Test all application events click button
    Then Click on Admin page
    And Click on EMPower GL click button
    Then Click on Admin page
    And Click on Admin events click button
    Then Click on Admin page
    And Click on Run Event Manually click button


