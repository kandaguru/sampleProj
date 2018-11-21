package com.stepDefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankStepDefenition {
	

    @Given("^Login to the Credit page$")
    public void login_to_the_credit_page() throws Throwable {
    	System.out.println("Enter the Credit login creds");
    	//System.out.println("Enter the Credit page");
        
    }

    @Given("^Login to the Debit page$")
    public void login_to_the_debit_page() throws Throwable {
    	System.out.println("Enter the Debit login creds");
    	//System.out.println("Enter the Debit page");
    }

    @Given("^Login to the Loan page$")
    public void login_to_the_loan_page() throws Throwable {
    	System.out.println("Enter the Loan login creds");
    	//System.out.println("Enter the Loan page");
    }

    @When("^clicked on Credit menu$")
    public void clicked_on_credit_menu() throws Throwable {
    	System.out.println("click credit menu");
    }
    
    @When("^clicked on Debit menu$")
    public void clicked_on_debit_menu() throws Throwable {
    	System.out.println("click Debit menu");    
    }

    @When("^clicked on Loan menu$")
    public void clicked_on_loan_menu() throws Throwable {
    	System.out.println("click Loan menu");
      
    }

    @Then("^Credit Option Displays$")
    public void credit_option_displays() throws Throwable {
    	System.out.println("credit menu displays");
    }

    @Then("^Debit Option Displays$")
    public void debit_option_displays() throws Throwable {
    	System.out.println("Debit menu displays");
    }

    @Then("^Loan Option Displays$")
    public void loan_option_displays() throws Throwable {
    	System.out.println("Loan menu displays");
    }


}
