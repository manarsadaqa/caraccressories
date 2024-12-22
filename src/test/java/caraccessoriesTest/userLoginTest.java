package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import caraccessories.firstclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class userLoginTest {
     private User user = new User();
     private static UserFun userfun = new UserFun();
//	 private static List<User> userList = mydata.listUsers(); 
	 private String email;
	 private String password;
	 private boolean b;
	 
		static Logger logger = Logger.getLogger(firstclass.class.getName());
	@Given("there is already email {string} and password {string}")
	public void there_is_already_email_and_password(String string, String string2) {
		email = string;
		password = string2;
		
	}
	@When("the user try to login with email {string} and password {string}")
	public void the_user_try_to_login_with_email_and_password(String string, String string2) {
	     b = userfun.login(string ,string2);
	}
	
	@Then("the user will login")
	public void the_user_will_login() {
	    assertEquals(true, UserFun.getflag4());

	//	assertTrue(UserFun.getflag4()==true);

//		assertTrue(b);
		Assert.assertTrue(b);
	}
	@Then("the user will not login")
	public void the_user_will_not_login() {
//		assertFalse(b);
	    assertEquals(false, UserFun.getflag4());

		//assertTrue(UserFun.getflag4()==false);

		Assert.assertFalse(b);
        logger.log(Level.INFO, "try again please\\n");


	}

}
