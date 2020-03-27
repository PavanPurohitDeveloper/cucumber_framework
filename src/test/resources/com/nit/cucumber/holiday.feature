@BookHotelAndFlights 
Feature: Going on holiday 
	I want to book flight tickets and a hotel

@BookHotel 
Scenario: I want to book hotel 
	Given I live in Moscow 
	And I want to go on a holiday 
	And we are 10 adults 
	And we want to book from 10th Jan 2019 to 20th jan 2019 
	When I go to travel agent 
	Then He should be able to help me in budget of 1000 USD 
	And He should provide me option to cancel 
	But He should not ask for advance more than 300 USD