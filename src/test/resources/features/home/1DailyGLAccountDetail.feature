Feature: login to application and download csv file and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yashika1"
  @TC1
  Scenario: Validate all left nav bars
    Then Click on DailyGLAccountDetail
    And click on excel button
    And click on csv button


