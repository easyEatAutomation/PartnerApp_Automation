Feature: Split Bill

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
	
	@smoke @sanity
	Scenario: Split Bill 

	 #Given user is on Dashboard	    
	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   And User will select items from menu
   Then select second item
   And Click on Create Order button
   Then select table  
   Then Click on Settle Bill from dashboard button
   Then User will click on split bill
   And click to right move
   Then user will click on save button
   Then User will click on settele bill1 
    Then user will select the payment option as Visa Card1
   Then bill swipe for full amount1
    Then User will click on settele bill2
   Then user will select the payment option as Visa Card2
   Then bill swipe for full amount2
   And Click on spilt bill pop up close icon 
   Then user will click on Done button for returning to Dashboard
    
   
   