package com.nit.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyHoliday {
	
	@Given("I live in Moscow")
	public void i_live()  {
		System.out.println("I live in Moscow");
	}
	
	@And("I want to go on a holiday")
	public void i_want()  {
		System.out.println("I want to go on a holiday");
	}
	
	@And("we are 10 adults")
	public void we_are_10_adults()  {
		System.out.println("we are 10 adults");
	}
	
	@And("we want to book from 10th Jan 2019 to 20th jan 2019")
	public void we_want_to_book()  {
		System.out.println("we want to book from 10th Jan 2019 to 20th jan 2019");
	}
	
	@When("I go to travel agent")
	public void I_go_to_travel_agent()  {
		System.out.println("I go to travel agent");
	}
	
	@Then("He should be able to help me in budget of 1000 USD")
	public void He_should()  {
		System.out.println("He should be able to help me in budget of 1000 USD");
	}
	
	@And("He should provide me option to cancel")
	public void He_should_provide()  {
		System.out.println("He should provide me option to cancel");
	}
	
	@But("He should not ask for advance more than 300 USD")
	public void He_should_not_ask()  {
		System.out.println("He should not ask for advance more than 300 USD");
	}	
}
