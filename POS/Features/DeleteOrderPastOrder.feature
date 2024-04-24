Feature: Launch URL and Login with Credentials with PIN

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
	
	@smoke	
	Scenario: Delete Order From Past OrderDashboard

	 #Given user is on Dashboard	    
	 When User clicks on AutomateSMS if available
	 When user click on Create New Order button
   Then select DineIn
   Then select Items
   And Click on Create Order button
   Then select table
   Then Click on Settle Bill button
   Then User will select payment option Master Card
   And Click on Paid button
   Then User will click on Complete button
   Then user will select past order
   Then Click on Delete order button
   And Click on yes Delete button