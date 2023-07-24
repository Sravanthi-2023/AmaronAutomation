Feature: Verifying functionality in Customers Registration in Mobile
		
	@MobileCustomerReg
	Scenario: user logins to mobile with multiple login details
	Given Amaron app is launching
	When user enter mobileno and otp
	And user clicks on Battery for Mobile
	And user clicks on Automotive for Mobile
	And user enters serial number for Mobile
	And user enters vehicle number for Mobile
	And user enters customer mobile number for Mobile
#	Then user enters seller code for Mobile
	And user select a make for Mobile
	And user select segment for Mobile
	And user select Model for Mobile
	And user select FuelType for Mobile
	And user Clicks on checkbox
	And user clicks on Register button for Mobile
	And user enters Otp for Mobile
	Then user clicks on Verify for Mobile
	And user redirects to Registration Successfull Page
	

	
	
	


	
	
	

	
