Feature: Verifying functionality in Customers Registration in Mobile
	
	@Sanity @Regression @TwoWheeler
  Scenario: Customer Registration in Mobile for Two-Wheeler
	Given Amaron app is launching
	When user enter mobileno and otp
	And user clicks on Battery for Mobile
	And user clicks on TwoWheeler
	And user enters serial number for TwoWheeler in Mobile
	And user enters vehicle number for Mobile
	And user enter customer mobile number for TwoWheeler in Mobile
	Then user enters seller code for Mobile
	And user select a Make for TwoWheeler in Mobile
	And user selects Segment for TwoWheeler in Mobile
	And user selects ModelType for TwoWheeler in Mobile
#	And user select FuelType for Mobile
	And user Clicks on Terms and Conditions checkbox
	And user clicks on Register button for Mobile
	And user enters Otp for Mobile
	Then user clicks on Verify for Mobile
	And user redirects to Registration Successfull Page

	
	@Sanity @Regression @Automotive
	Scenario: Customer Registration in Mobile for Automotive
	Given Amaron app is launching
	When user enter mobileno and otp
	And user clicks on Battery for Mobile
	And user clicks on Automotive for Mobile
	And user enters serial number for Mobile
	And user enters vehicle number for Mobile
	And user enters customer mobile number for Mobile
	Then user enters seller code for Mobile
	And user select a make for Mobile
	And user select segment for Mobile
	And user select Model for Mobile
	And user select FuelType for Mobile
	And user Clicks on Terms and Conditions checkbox
	And user clicks on Register button for Mobile
	And user enters Otp for Mobile
	Then user clicks on Verify for Mobile
	And user redirects to Registration Successfull Page
	
	
#	@Sanity @Regression @MorethanTenTransactionsAlertMessage
#	Scenario: Verify alert message when user enters same mobile no for more than 10 Transactions in customer Registration page
#	Given Amaron app is launching
#	When user enter mobileno and otp
#	And user clicks on Battery for Mobile
#	And user clicks on TwoWheeler
#	And user enters serial number for TwoWheeler in Mobile
#	And user enters vehicle number for Mobile
#	And enters customer email or mobileno
#	Then user enters seller code for Mobile
#	And user select a Make for TwoWheeler in Mobile
#	And user selects Segment for TwoWheeler in Mobile
#	And user selects ModelType for TwoWheeler in Mobile
#	And user Clicks on checkbox
#	And user clicks on Register button for Mobile
# Then user verify You cant enter same mobile No in more than 10 Transactions alert Message
	


	
	
	

	
