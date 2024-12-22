package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateuser {
	
	 private User user = new User();
	    private static UserFun userfun = new UserFun();
	    private static List<User> result;

//		 private static List<User> userList = mydata.listUsers(); 
		 private String email;
		 private String password;
		 private String username;
		 private String userlevel;
		 private boolean l;
		 		 
//			@Given("admin is already logged in")
//			public void the_admin_is_already_logged_in() {
//				System.out.println("..");
//
//			}
			@When("update a user with a  with username {string} and email {string} and password {string} and userlevel {string} and userphone {int} and useraddress {string} and oldemail {string}")
			public void update_a_user_with_a_with_username_and_email_and_password_and_userlevel_and_userphone_and_useraddress_and_oldemail(String string, String string2, String string3, String string4, Integer int1, String string5, String string6) {
				result = userfun.updateUser(string, string2, string3, string4,int1, string5 ,string6);
			}	
			@Then("I will found the user with a  useremail {string}")
			public void i_will_found_the_user_with_a_useremail(String string) {
			    assertEquals(true, UserFun.getflag3());

				//assertTrue(UserFun.getflag3()==true);

				//assertTrue(userfun.getemail1(string)!=null);
				userfun.printUserList();
				}

			
//			@Given("admin not logged in")
//			public void the_admin_not_logged_in() {
//				System.out.println("..");
//
//			}

			@When("I try to update a user with a  with username {string} and email {string} and password {string} and userlevel {string} and userphone {int} and useraddress {string} oldemail {string}")
			public void i_try_to_update_a_user_with_a_with_username_and_email_and_password_and_userlevel_and_userphone_and_useraddress_oldemail(String string, String string2, String string3, String string4, Integer int1, String string5, String string6) {
				result = userfun.updateUser(string, string2, string3, string4,int1, string5 ,string6);

			}
			@Then("I cant found the product with a useremail {string}")
			public void i_cant_found_the_product_with_a_useremail(String string) {
			    assertEquals(true, UserFun.getflag3());

				//assertTrue(UserFun.getflag3()==true);

				//assertFalse(userfun.getemail1(string)!=null);
				System.out.println("this user is already not exist ");

			}


		 
		 

}
