Feature: Cash Drawer Close Cashier

  #@smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
#@smoke @sanity
  #Scenario: Login with valid Credentials
    #When User is on Login Page
    #Then User enters "qa.automation@easyeat.ai" and "ajai1234"   
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1" 
    #Then user click  "2" 
    #Then user click  "4" 
    #Then user click  "1" 
    #Then click on SignIn button
    #Then it will redirect to the dashboard
#	  When User clicks on AutomateSMS if available

	
	Scenario: Cash Drawer Close Cashier
		
	
	 #Given user is on Dashboard
	    
	 
   When user click on Cash Drawer
   Then select close cashier 
   And Click on Countinue button
   #Then user enters "Dilip" and "100" 
   Then user enter name in cash out "Dilip" and amount "100" 
   And User will click on Done button to close the cashier
   Then User will click on cashier Report Done button
 