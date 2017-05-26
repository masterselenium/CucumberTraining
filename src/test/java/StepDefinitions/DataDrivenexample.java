package StepDefinitions;

import java.util.HashMap;
import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;

public class DataDrivenexample {
	public List<HashMap<String,String>> datamap;
    public DataDrivenexample()
    {
      // driver = Hooks.driver;
       datamap = DataHelper.data(System.getProperty("user.dir")+"//src//test//resources//testdata/testdata.xlsx","Sheet1");
    }
    
    @Before
    public void setup(){
    	System.out.println("Webdriver Initialization");
    }
    
    @After
    public void teardown(){
    	System.out.println("Close the Driver");
    }

	@Given("^I open Facebook Url$")
	public void i_open_Facebook_Url() throws Throwable {
	    System.out.println("I opened FB Url");
	}

	@When("^I enter username  and password present in excel \"([^\"]*)\"for Datadriven$")
	public void i_enter_username_and_password_present_in_excel_for_Datadriven(String arg1) throws Throwable {
	  
		int index = Integer.parseInt(arg1)-1;
        System.out.println("Printing current data set...");

        System.out.println("Username is "+datamap.get(index).get("username"));
        System.out.println("Password is "+datamap.get(index).get("password"));
	}

	@Then("^I should be able to login and see login page$")
	public void i_should_be_able_to_login_and_see_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I am logged on");
	}
}
