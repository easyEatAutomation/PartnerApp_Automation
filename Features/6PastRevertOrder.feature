Feature: Past Revert Order

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
	Scenario: past revert order 

	 #Given user is on Dashboard	    
	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   And User will select items from menu
   And Click on Create Order button
   Then select table  
   Then Click on Settle Bill from dashboard button
   Then User will select payment option Master Card
   And Click on Paid button
    #Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
    When user click on Past Orders tab
		  Then click on Revert Order button
		  Then click on Yes, Revert order
   
   