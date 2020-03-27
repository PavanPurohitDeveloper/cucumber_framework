@BookHotelAndFlights 
Feature: Going on holiday 
	I want to book flight tickets and a hotel

@BookHotel 
Scenario: I want to book hotel 
	Given I live in London 
	And I want to go on a holiday 
	And we are 3 adults 
		|Adult1  |Adult  |Adult3 |
		|   A    |  B    |   C   |
		|   20   |  30   |   40  |
	And we want to book from 11 Jan 2019 to 20th jan 2019 
	When I go to travel agent 
	Then He should be able to help me in budget of 1000 USD 
	And He should provide me option to cancel 
	But He should not ask for advance more than 500 USD 
	
@BookFlight 
Scenario Outline: I want to book hotel 
	Given I live in London 
	And I want to go on a holiday 
	And we are 3 adults 
		|Adult1  |Adult  |Adult3 |
		|   A    |  B    |   C   |
		|   20   |  30   |   40  |
	And We want to book flight to <Destination> on <FromDate>
	And Return flight on <ToDate> 
	
	Examples: 
		| Destination |FromDate      |ToDate        |
		| Hawai       | 10th Feb 2019| 20th Feb 2019|
		| Bejing      | 21st Apr 2019| 25th Apr 2019|
	