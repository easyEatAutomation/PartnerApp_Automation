Feature: Create TakeAway Orders

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
 
 @sanity
  Scenario: Create TakeAway Order
  
  
    When User clicks on AutomateSMS if available
    When user click on Create New Order button
    And User will select Take Away from Pop up
    And User will select items from menu
    Then Click on Settle Bill button
    Then User will select payment option
    Then User will select full amount
    And Click on Next button
    Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
		#Then I close browser
		
		
		  Scenario: Revert TakeAway Order from past Orders tab
		 # Given User is on Dashboard
		  When user click on Past Orders tab
		  Then click on Revert Order button
		  Then click on Yes, Revert order
		  
		  
		  
		
		
		 