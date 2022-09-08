Feature: login to application and download csv file and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yashika1"
  @TC3
  Scenario: Validate all left nav bars
    Then Click on lip trail Balance
    And click on excel button
    And click on csv button


