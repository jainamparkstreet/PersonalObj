package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.LoginActions;
import utils.SeleniumDriver;

public class LoginStep {
	
	LoginActions LoginActions= new LoginActions();

	@Given("User is on the login page {string}")
	public void user_is_on_the_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.print("Hey");
		SeleniumDriver.openPage(string);
		LoginActions.VerifyOnLoginPage(string);
		
	}

	@When("user enters userid and password")
	public void user_enters_userid_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
		
		
		List<List<String>> credentials = dataTable.asLists();
		String username = credentials.get(0).get(0);
		String password = credentials.get(0).get(1);
		LoginActions.enterCredentailsandclicklogin(username, password);
	}

	@Then("user should be on the dashboard page")
	public void user_should_be_on_the_dashboard_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		LoginActions.VerifyUserLoggedIn();
	}
}
