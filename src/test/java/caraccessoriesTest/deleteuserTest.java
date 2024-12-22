package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteuserTest {
	
	private User user = new User();
    private static UserFun userfun = new UserFun();

    private static List<Product> result;
	private int productid;
	 private boolean d;
	 
	 @When("delete a user with useremail {string}")
	 public void delete_a_user_with_useremail(String string) {
		 d= userfun.deleteuser(string);

	 }
	 @Then("I will found the user with useremail as {string}")
	 public void i_will_found_the_user_with_useremail_as(String string) {
			//true.. delete 
		    assertEquals(true,UserFun.getflag1());

			//assertTrue(UserFun.getflag1()==true);
			//assertTrue(ProductFun.getflag3()==true);

	    // assertFalse(userfun.getemail1(string)!=null);		
		// assertTrue(d);
		 userfun.printUserList();

	 }
	@When("I try to delte a user with useremail {string}")
	public void i_try_to_delte_a_user_with_useremail(String string) {
		 d= userfun.deleteuser(string);


	}
	@Then("I can't found the user with  a useremail {string}")
	public void i_can_t_found_the_user_with_a_useremail(String string) {
	    assertEquals(false,UserFun.getflag1());

		//assertTrue(UserFun.getflag1()==false);

		//assertFalse(userfun.getemail1(string)!=null);		
		 assertFalse(d);

	}

	
	
}
