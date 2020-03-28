package com.nit.cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyHoliday {
	
	@Before
	public void beforeScenario() {
		System.out.println("----------- Before executing ----------- ");
	}
	
	@After
	public void afterScenario() {
		System.out.println("----------- After executing ----------- ");
	}
	
	/*@Before("@BookHotel")
	public void beforeScenario() {
		System.out.println("----------- Before executing ----------- ");
	}
	
	@After("@BookHotel")
	public void afterScenario() {
		System.out.println("----------- After executing ----------- ");
	}*/
	
	@Given("^I live in ([a-zA-Z]{1,})$")
	public void i_live(String cityName)  {
		System.out.println("I live in "+ cityName);
	}
	
	@And("^I want to go on a holiday$")
	public void i_want()  {
		System.out.println("I want to go on a holiday");
	}
	
	@And("^we are (\\d+) adults$")
	public void we_are_10_adults(int adults, List<Map<String, String>> namesList)  {
		System.out.println("we are "+adults+" adults " + namesList.toString());
	}
	
	@And("^we want to book from ([^\"]*) to ([^\"]*)$")
	public void we_want_to_book(String fromDate, String toDate)  {
		System.out.println("we want to book from "+fromDate+ " to "+ toDate);
	}
	
	@When("^I go to travel agent$")
	public void I_go_to_travel_agent()  {
		System.out.println("I go to travel agent");
	}
	
	@Then("^He should be able to help me in budget of (\\d+) USD$")
	public void He_should(int budget)  {
		System.out.println("He should be able to help me in budget of "+budget+" USD");
	}
	
	@And("^He should provide me option to cancel$")
	public void He_should_provide()  {
		System.out.println("He should provide me option to cancel");
	}
	
	@But("^He should not ask for advance more than (\\d+) USD$")
	public void He_should_not_ask(String advanceAmt)  {
		System.out.println("He should not ask for advance more than "+advanceAmt+" USD");
	}	
	
	@And("^We want to book flight to ([^\"]*) on ([^\"]*)$")
	public void WeWantToBookFlightOn(String destination, String fromDate)  {
		System.out.println("We want to book flight to "+destination+" on "+fromDate);
	}
	
	@And("^Return flight on ([^\"]*)$")
	public void ReturnFlightOn(String returnDate)  {
		System.out.println("Return flight on "+returnDate);
	}
	
	@Given("^I go to website www.ebay.com$")
	public void i_go() {
		System.out.println("I go to website www.ebay.com");
	}
	
}
