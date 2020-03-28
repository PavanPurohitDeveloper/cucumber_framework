package com.nit.cucumber;
import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions.*;

import cucumber.api.java.en.*;

public class Shop {
	
	@And("^I search for shirts$")
	public void i_search_for_shirts() {
		System.out.println("I search for shirts");
	}
	
	@When("^I add a shirt in cart$")
	public void i_add() {
		System.out.println("I add a shirt in cart");
	}
	
	@Then("^The chart item count should increase$")
	public void the_chart() {
		System.out.println("The chart item count should increase");
		assertThat("A").isEqualTo("B");
	}

}
