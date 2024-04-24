Feature: Cash Drawer Close Cashier

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
	
	Scenario: Cash Drawer Close Cashier
		
	
	 #Given user is on Dashboard
	    
	 
   When user click on Cash Drawer
   Then select close cashier 
   And Click on Countinu button
   Then  user enter "Dilip" and "100" 
   And click on Done button
   And click on cashier Done button