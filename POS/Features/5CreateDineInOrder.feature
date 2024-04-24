	Feature: Create Dine In Order
	
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
    
    
    
    Scenario: Create Order and Settle Dine In Bill and Change Payment option cash to others
   
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
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
    
   
   
     Scenario: Create order and Void it
   
 	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table 
   Then user will click on Void Icon
   Then user will click on Void Dish Button
	
	
	   
 
	Scenario: Create Order and complete Dine In Order
	
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table  
   Then user completes the Order button
   Then user will select the payment option as cash
   Then bill swipe for full amount
   #Then user will get the invoicenumber
   #And Send it to textbox

	
	
		  
   
   
   Scenario: Create Order and Add Item
  
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table
   
   When User clicks on add items
   Then select Items A
   And Click on Create Order button
   
   
   
  
  Scenario: Change DineIn Table 
   When User clicks on table icon
   Then User will select Another Table number from Pop up
   Then clicks on Trasnfer Table button
   
   
   Scenario: Create Order and Settle Bill Dine In
   
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table
   When User clicks on Settle Bill
   Then User will Cash payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
   
   
    
    
    Scenario: Create Order and Delete Unpaid DineIn Order
    
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table
   When User clicks on Delete link
   Then User will click on Order Delete button on Delete Pop up
 
 
   
   
   # Then I close browser
    
  
 