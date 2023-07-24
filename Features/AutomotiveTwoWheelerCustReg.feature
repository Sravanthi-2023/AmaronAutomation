Feature: Verifying functionality for Customers Registration Page 
	
@CustomerAutomotiveRegistrationMandatory
  Scenario: Automotive Registration with Customers login Mandatory fields
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "9591056097"
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
	
	
	@CustomerAutomotiveRegistrationNonMandatory
  Scenario: Automotive Registration with Customers login NonMandatory fields
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "9591056097"
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



@CustomerTwoWheelerRegistrationMandatory
  Scenario: TwoWheeler Registration with Customers login Mandatory fields
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "7702265012"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	Then Verify user is on Login Page or not
	And user verify Registration Page Title
	When user click on Product Registration link
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
	And click on I Agree checkbox
	When user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not
	
	@CustomerTwoWheelerRegistrationNonMandatory
  Scenario: TwoWheeler Registration with Customers login NonMandatory fields
	Given User Launch Chrome browser 
	When User opens URL 
	And Clicks on LoginButton
	And Clicks on the Customers Radio button 
	And User enters Mobile Number as "7702265012"
	And Click on SignIn button
	And User enters OTP
	And Click on Submit button 
	Then Verify user is on Login Page or not
	And user verify Registration Page Title
	When user click on Product Registration link
	And user click on Two Wheeler image
	And user enters battery serial number for TwoWheeler
  And user enters vehicle number for TwoWheeler
  And user enters customer emailorMobile for TwoWheeler
  And user enters seller code for TwoWheeler
	And user expands add option
  And user clicks on Select Make for TwoWheeler
  And user select Segment for TwoWheeler
  And user select Model for TwoWheeler
  And user select FuelType for TwoWheeler
	Then verify Terms And conditions message
	And click on I Agree checkbox
	When user clicks on Register button
	And user enters into OTP Page
	And user clicks on Skip button
	Then user checks Registration is successful or not
	
	