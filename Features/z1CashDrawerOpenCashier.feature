Feature: Cash Drawer Open Cashier

  @smoke @sanity
  Scenario: Open Chrome Browser
    Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
@smoke @sanity
  Scenario: Login with valid Credentials
    When User is on Login Page
    Then User enters "qa.automation@easyeat.ai" and "ajai1234"
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
	



  #@smoke @sanity
  #Scenario: Launch EasyEat Partner
  #Given I open application
#
  #@smoke @sanity
  #Scenario: Login with valid Credentials 
    #When User is on Login Page
    #Then User enters mobile credentials "ajai@easyeat.ai" and "ajai1234"
    #And Click on app Login button
    #Then User should get logged in
    #And Message displayed Login Successfully on app
    #Then user click mobilePIN "1"
    #Then user click mobilePIN "2"
    #Then user click mobilePIN "4"
    #Then user click mobilePIN "1"
    #Then click on SignIn button on App
    #Then it will redirect to the dashboard
    
	Scenario: Cash Drawer Open Cashier
		
	
	 #Given user is on Dashboard
	    
	 
   When user click on Cash Drawer
   Then select open cashier 
   And Click on Countinu button
   Then  user enter "Dilip" and "100" 
   And click on Done button
   
     
  
   
   
  
      
   
    
