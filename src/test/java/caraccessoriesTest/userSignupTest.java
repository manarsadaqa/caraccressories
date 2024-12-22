package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

public class userSignupTest {
	
    private User user = new User();
    private static UserFun userfun = new UserFun();
    private static List<User> result;

//	 private static List<User> userList = mydata.listUsers(); 
	 private String email;
	 private String password;
	 private String username;
	 private String userlevel;
	 private boolean l;	 
	 @Given("the usear is already logged in")
	 public void the_usear_is_already_logged_in() {
		   System.out.println("..");
	}

@When("I try to add a user with username {string} and email {string} and password {string} and userlevel {string} and userphone {int} and useraddress {string}")
public void i_try_to_add_a_user_with_username_and_email_and_password_and_userlevel_and_userphone_and_useraddress(String string, String string2, String string3, String string4, Integer int1, String string5) {
	 result = userfun.signup(string, string2, string3, string4 , int1 , string5);

}
@Then("I will add it with email {string}")
public void i_will_add_it_with_email(String string) {
    assertEquals(false, UserFun.getflag5());

	//assertTrue(UserFun.getflag5()==false);

	// assertTrue(userfun.getemail1(string)!=null);

}

	@Given("the usear not logged in")
	public void the_usear_not_logged_in() {
		System.out.println(".."); 
	}
	

@When("I try to add a user with a username {string} and email {string} and password {string} and userlevel {string} and userphone {int} and useraddress {string}")
public void i_try_to_add_a_user_with_a_username_and_email_and_password_and_userlevel_and_userphone_and_useraddress(String string, String string2, String string3, String string4, Integer int1, String string5) {
	 result = userfun.signup(string, string2, string3, string4 , int1 , string5);

}

	@Then("I can't found the user with email {string}")
	public void i_can_t_found_the_user_with_email(String string) {
		//assertTrue(userfun.getemail1(string)!=null);
	    assertEquals(true, UserFun.getflag5());

		//assertTrue(UserFun.getflag5()==true);

		userfun.printUserList();
		
	}


}
