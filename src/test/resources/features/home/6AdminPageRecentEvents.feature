Feature: login to application and click on csv and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yashika1"
  @TC6
  Scenario:
    Then Click on Admin page
    And Click on Recent events click button
    And validate record size
    And click on EventFiredTimestamp filter





