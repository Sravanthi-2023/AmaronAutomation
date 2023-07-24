Feature: Verifying functionality in Customers Registration in Mobile
	
	@custRegTwoWheelerMobile
  Scenario: Customer Registration in Mobile for Two-Wheeler
	Given Amaron app is launching
	When user enters mobile number for TwoWheeler
	And user enters OTP for TwoWheeler
	And user clicks on Battery for Mobile
	And user clicks on TwoWheeler
	And user enters serial number for TwoWheeler in Mobile
	And user enters vehicle number for Mobile
	And user enter customermobile num for TwoWheeler in Mobile
#	Then user enters seller code for Mobile
	And user select a Make for TwoWheeler in Mobile
	And user selects Segment for TwoWheeler in Mobile
	And user selects ModelType for TwoWheeler in Mobile
#	And user select FuelType for Mobile
	And user Clicks on checkbox
	And user clicks on Register button for Mobile
	And user enters Otp for Mobile
	Then user clicks on Verify for Mobile
	And user redirects to Registration Successfull Page

	
	
	


	
	
	

	
