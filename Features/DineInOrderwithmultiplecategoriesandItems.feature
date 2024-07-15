Feature: DineInOrder with multiple categories and Items
	
	 @smoke @sanity
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
@smoke @sanity 
  Scenario: Login with valid Credentials
  
    When User is on Login Page
    Then User enters "ajai@easyeat.ai" and "ajai1234"
    And Click on Login button
    Then User should get logged in
    And Message displayed Login Successfully
    Then user click  "1" 
    Then user click  "2" 
    Then user click  "4" 
    Then user click  "1" 
    Then click on SignIn button
    Then it will redirect to the dashboard
    When User clicks on AutomateSMS if available
 
  Scenario: Dine In Order with muplitple categories items 
   When user click on Create New Order button
   Then select DineIn
   Then Click on Item Categories
  Then select Items A
  And Click on Create Order button
  Then select table
   When User clicks on Settle Bill
   Then User will Cash payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then click on Change Link
    Then User clicks on Delete link on payment screen
    Then he will click on delete button on confirmation pop up screen
    And Select the Master card as Payment option
    And User will click on PayRm button
    Then User will click on Done button and Orders will be created
    
    