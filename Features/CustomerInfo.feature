Feature: Add/Edit Customer Information

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
	
	

Scenario: Enter Mobile Number then Save after creating DineIn order

	When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   And Click on Create Order button
   Then select table  
   Then User will click on Add Customer Details link
   Then User will enter "+91"
   And User will enter "9891773891"
   And click on Save button

   
   Scenario: Enter Mobile Number then Save while creating DineIn order
   
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   Then User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   And Click on Create Order button
   Then select table    
   
   
   @sanity
   Scenario: Save Customer Info when creating Take Away order
   
    When User clicks on AutomateSMS if available
   When user click on Create New Order button
    And User will select Take Away from Pop up
    And User will select items from menu
    Then User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
    Then Click on Settle Bill button
    Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   
   @sanity
   Scenario: Save Info when creating GrabDelivery Order
   
   When User clicks on AutomateSMS if available
   And user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabDeliveryType Order from pop up
   And User will select items from menu
   Then Grab User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   Then Click on Settle Bill button
   Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   
   @sanity
	Scenario: Save Customer Info when creating GrabPickUp Order
   
    When User clicks on AutomateSMS if available
   And user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabPickType Order from pop up
   And User will select items from menu
   Then Grab User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   Then Click on Settle Bill button
   Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   
	


   
   Scenario: Enter Mobile Number then Save while creating DineIn order
   
   When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
   Then User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   And Click on Create Order button
   Then select table    
   
   @sanity
   Scenario: Save Customer Info when creating Take Away order
    When User clicks on AutomateSMS if available
    And user click on Create New Order button
    And User will select Take Away from Pop up
    And User will select items from menu
    Then User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
    Then Click on Settle Bill button
    Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   
   @sanity
   Scenario: Save Info when creating GrabDelivery Order
   
   When User clicks on AutomateSMS if available
   And user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabDeliveryType Order from pop up
   And User will select items from menu
   Then Grab User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   Then Click on Settle Bill button
   Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   
	Scenario: Save Customer Info when creating GrabDelivery Order
   
    When User clicks on AutomateSMS if available
   And user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabPickType Order from pop up
   And User will select items from menu
   Then Grab User will click on Add Customer Details Button
   And User will enter "9891773891"
   And click on Save button
   Then Click on Settle Bill button
   Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
   