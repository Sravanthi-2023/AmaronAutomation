Feature: Verifying functionality in Customers Registration Page 
	
	@CustomerRegistration1
  Scenario: Registration with Customers login
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "9591056797"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	Then Verify user is on Login Page or not
	And user verify Registration Page Title
	When user click on Product Registration link
	And user enters battery serial number
	And user enters vehicle number
	And user enters customer emailorMobile
	And user expands add option
	And user clicks on Select Make
	And user select Segment
	And user select Model
	And user select FuelType
	Then verify Terms And conditions message
	When click on I Agree checkbox
	And user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not
	
	
	
	@RegistrationButtonDisabled
  Scenario: Registration button should be disabled if all mandatory fields are not given with Customers login
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "8367513696"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	#Then Scroll down to bottom
	And user enters battery serial number
	#Then user enters vehicle number
	And user enters customer emailorMobile as "8367513696"
	And user expands add option
	And user clicks on Select Make
	And user select Segment
	And user select Model
	And user select FuelType
	Then verify Terms And conditions message
	When click on I Agree checkbox
	Then Register button should be disabled
	
	@Popupmessage
  Scenario: Verifying Alert popup messages
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "8367513696"
	#And User enters Mobile Number "8367513696"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	And user enters battery serial number
	And user enters vehicle number
	And user enters customer emailorMobile as "8367513696"
	And user expands add option
	And user clicks on Select Make
	And user select Segment
	And user select Model
	Then user select FuelType
	And verify Terms And conditions message
	When click on I Agree checkbox
	And user clicks on Register button
	Then pop-up should be displayed
	
#@RegistrationwithSameNoMultipleTimesAlertMessageCheck
#Scenario: Registration NonMandatory Fields check
#	Given User Launch Chrome browser 
#	When User opens URL 
#	Then Clicks on the Customers Radio button 
#	And Clicks on LoginButton
#	And User enters Mobile Number as "8367513696"
#	And Click on SignIn button
#	Then User enters OTP
#	Then Click on Submit button 
#	Then Verify user is on Login Page or not 
#	When user verify Registration Page Title
#	Then user click on Product Registration link
#	Then user enters battery serial number
#	Then user enters vehicle number
#	Then user enters customer emailorMobile
#	And verify Terms And conditions message
#	And click on I Agree checkbox
#	When user clicks on Register button
#	Then user get an Alert message for using same no multiple times
	

@RegistrationwithNonMandatoryFields
Scenario: Registration NonMandatory Fields check
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "9591456791"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	Then Verify user is on Login Page or not
	And user verify Registration Page Title
	When user click on Product Registration link
	And user enters battery serial number
	And user enters vehicle number
	And user enters customer emailorMobile 
	And user enters seller code
	And user expands add option
	And user clicks on Select Make
	And user select Segment
	And user select Model
	And user select FuelType
	Then verify Terms And conditions message
	When click on I Agree checkbox
	And user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not
#	Then user get an Alert message to enter Manadatory Fields
	


	
	
	

	
