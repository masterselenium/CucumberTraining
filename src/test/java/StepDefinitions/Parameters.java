package StepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters {

	@Given("^I open FB Url$")
	public void i_open_FB_Url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(" I opened FB Url");
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("UserName is "+arg1);
		 System.out.println("Password is "+arg2);
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I have logged in");
	}
	
	
	//Example for scenario outline
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("UserName is "+arg1);
		 System.out.println("Password is "+arg2);
	}

	
	//Example for Datatable

	@When("^I enter username  and password for Datatables$")
	public void i_enter_username_and_password_for_Datatables(DataTable table) throws Throwable {
	   
		 List<List<String>> data = table.raw();
		 
		 
		 
		 
		System.out.println("Username is "+data.get(0).get(1).toString());
		System.out.println("Password is "+data.get(1).get(1).toString());
		System.out.println("Country is "+data.get(2).get(1).toString());
		System.out.println("My qualification is "+data.get(3).get(1).toString());
	}
	
	
}
