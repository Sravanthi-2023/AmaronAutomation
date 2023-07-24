Feature: Verifying Customers Login screen 

@CustomersLogin
Scenario: Successful Login with Customers login
	Given User Launch Chrome browser 
	When User opens URL 
	Then Clicks on the Customers Radio button 
	And Clicks on LoginButton
	And User enters Mobile Number as "9591074114"
	And Click on SignIn button
	Then User enters OTP
	Then Click on Submit button 
	Then Verify user is on Login Page or not
	Then Click on Profile dropdown
	When User click on Log out 
	Then User clicks on Confirm button
	Then Login link should be visible 
	And  close browser 	
	
#@CustomerLoginWithDifferentInputs
#Scenario Outline: CustomerLogins with different inputs
#	Given User Launch Chrome browser 
#	When User opens URL 
#	Then Clicks on the Customers Radio button 
#	And Clicks on LoginButton
#	And customer enters Mobile Number as "<mobilenumber>"
#	And Click on SignIn button
#	Then User enters OTP as "<OTP>"
#	Then Click on Submit button 
#	Then Verify user is on Login Page or not
#	Then Click on Profile dropdown
#	When User click on Log out 
#	Then User clicks on Confirm button
#	Then Login link should be visible 
#	And  close browser
#	
#	Examples: 
#| mobilenumber | OTP |
#|9969199561    | 12345|
#|9969199562    | 67890|
#|9969199563    | 20987|
#|9969199564    | 67890|
#|9969199565    | 34567|



	


	
	
	

	
