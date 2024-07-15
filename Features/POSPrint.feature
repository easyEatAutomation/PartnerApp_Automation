Feature: POS All Printing Events

  #@smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
 #@smoke @sanity
  #Scenario: Login with valid Credentials
    #When User is on Login Page
    #Then User enters "ajai@easyeat.ai" and "ajai1234"
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1" 
    #Then user click  "2" 
    #Then user click  "4" 
    #Then user click  "1" 
    #Then click on SignIn button
    #Then it will redirect to the dashboard
	
	@smoke	@sanity
	Scenario: POS Print Running Order

	 #Given user is on Dashboard	    
	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   And User will select items from menu
   And Click on Create Order button
   Then select table 
   Then Click on manual print button
   And User will click on counter print button
   And Click on final bill recipt print button 
   And click on Close Icon of pop up
   
   @sanity
   Scenario: POS Print Past Order
   
  When user click on Past Orders tab 
   And user will on print button 
   Then click on bill print button 
   And click on Close Icon of Past Order pop up
   
   @sanity
   Scenario: Print Create Order and Add Item
  
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
   Then Click on manual print button
   And User will click on counter print button
   And User will click on counter print button1
   And Click on final bill recipt print button1 
   And click on Close Icon of pop up1
   
   
   
   @sanity
   Scenario: Print Merge Bill
   
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   And User will select items from menu
   And Click on Create Order button
   Then select table 
   When user click on Create New Order button
   Then select DineIn
   And User will select items from menu
   And Click on Create Order button
   Then select table
   When I select the one-order checkbox
   Then the two-order checkbox should be selected
   Then Click on merge Bill button
   And Click on Merge Print button
   Then click on close icon of merge pop up
   Then user will select past order
   
   
   
   #Then I close browser
   
   