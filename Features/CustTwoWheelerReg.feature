Feature: Verifying functionality in Customers Registration Page
	
	@custRegTwoWheeler
  Scenario: Registration with Customers login for TwoWheeler
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "8367713695"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	Then Verify user is on Login Page or not
	When user verify Registration Page Title
	And user click on Product Registration link
	And user click on Two Wheeler image
	And user enters battery serial number for TwoWheeler
  And user enters vehicle number for TwoWheeler
  And user enters customer emailorMobile for TwoWheeler
	And user expands add option
  And user clicks on Select Make for TwoWheeler
  And user select Segment for TwoWheeler
  And user select Model for TwoWheeler
  And user select FuelType for TwoWheeler
	Then verify Terms And conditions message
	When click on I Agree checkbox
	And user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not


	
	@custRegTwoWheelerNonMandatory1
  Scenario: Registration with Customers login for TwoWheeler
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "8367714695"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	And Verify user is on Login Page or not
	When user verify Registration Page Title
	And user click on Product Registration link
	And user click on Two Wheeler image
	And user enters battery serial number for TwoWheeler
  And user enters vehicle number for TwoWheeler
  And user enters customer emailorMobile for TwoWheeler
	And user enters seller code
  And user expands add option
  And user clicks on Select Make for TwoWheeler
  And user select Segment for TwoWheeler
  And user select Model for TwoWheeler
  And user select FuelType for TwoWheeler
	Then verify Terms And conditions message
	When click on I Agree checkbox
	And user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not


	
	
	

	
