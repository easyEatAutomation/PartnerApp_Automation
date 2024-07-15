 Feature: Apply Discount

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
	  Scenario: Cash Discount - Select 5 RM Discount
	  
	 When User clicks on AutomateSMS if available
	   When user click on Create New Order button
	   Then select DineIn
	   Then select Items A
	   Then Select Items B
		 Then Click on Add Amount Link
		 Then Select 5 RM Flat Discount
		 And Click on Apply Button
	   And Click on Create Order button
	   Then select table
	   When User clicks on Settle Bill
	   Then user completes the Order button
	   Then User will Cash payment option
	    Then User will select full amount
	    And Click on Next button
	    Then User will click on Done button on Pop up
	    Then User will click on Done button and Order will be created
	   
	    @smoke @sanity
	    Scenario: Cash Discount- Send 1 RM Discount and select reason as celebration
	    
		 When User clicks on AutomateSMS if available
	   When user click on Create New Order button
	   Then select DineIn
	   Then select Items A
	   Then Select Items B
		 Then Click on Add Amount Link
		 Then Send "1" RM in Flat Discount
		 Then Click on Overlay
		#Then Verify Text SELECT REASON
		 And Select Celebrations reason
		 And Click on Apply Button
	   And Click on Create Order button
	   Then select table
	   When User clicks on Settle Bill
	   Then User will Cash payment option
	   Then User will select full amount
	   And Click on Next button
	   Then User will click on Done button on Pop up
	   Then User will click on Done button and Order will be created
   
   @sanity
    Scenario: Percentage Discount Send 3%  Discount and select reason as celebration
	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
	 Then Click on Add Amount Link
	 Then click on Percentage Discount Tab
	 Then Send "3" percent in Flat Discount
	 Then Click on Overlay
	#Then Verify Text SELECT REASON
	 And Click on Apply Button
   And Click on Create Order button
   Then select table
   When User clicks on Settle Bill
   Then User will Cash payment option
   Then User will select full amount
   And Click on Next button
   Then User will click on Done button on Pop up
   Then User will click on Done button and Order will be created
   
 @sanity
 Scenario: Percentage Discount- Select 5%  Discount and select reason as celebration
	 When User clicks on AutomateSMS if available
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   Then Select Items B
	 Then Click on Add Amount Link
	 Then click on Percentage Discount Tab
	 Then Select 5 percent in Flat Discount
	 Then Click on Overlay
	#Then Verify Text SELECT REASON
	 And Click on Apply Button
   And Click on Create Order button
   Then select table
   When User clicks on Settle Bill
   Then User will Cash payment option
   Then User will select full amount
   And Click on Next button
   Then User will click on Done button on Pop up
   Then User will click on Done button and Order will be created
   
   
   
   @sanity
     Scenario: Cash Discount - Select 5 RM Discount
	 When User clicks on AutomateSMS if available
	   When user click on Create New Order button
	   Then select DineIn
	   Then select Items A
	   Then Select Items B
		 Then Click on Add Amount Link
		 Then click on TopUp Tab
		  Then Select 10 RM Top Up Discount
		   And Click on Apply Button
	   And Click on Create Order button
	   Then select table
	   When User clicks on Settle Bill
	   Then User will Cash payment option
	    Then User will select full amount
	    And Click on Next button
	    Then User will click on Done button on Pop up
	    Then User will click on Done button and Order will be created
	   
	    @smoke @sanity (@Dilip below cases which are commented are not working ....Mahmood)
	    Scenario: Cash Discount- Send 1 RM Discount and select reason as celebration
		 When User clicks on AutomateSMS if available
	   When user click on Create New Order button
	   Then select DineIn
	   Then select Items A
	   Then Select Items B
		 Then Click on Add Amount Link
		 Then click on TopUp Tab
		 Then Send "2" RM in TopUp Discount
		 Then Click on Overlay
		#Then Verify Text SELECT REASON
		 And Select Celebrations reason
		 And Click on Apply Button
	   And Click on Create Order button
	   Then select table
	   When User clicks on Settle Bill
	   Then User will Cash payment option
	   Then User will select full amount
	   And Click on Next button
	   Then User will click on Done button on Pop up
	   Then User will click on Done button and Order will be created
   #
   #
  #
   #Then I close browser
 #
