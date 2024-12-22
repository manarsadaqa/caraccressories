package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import caraccessories.firstclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutTest {
	static Logger logger = Logger.getLogger(firstclass.class.getName());

    private User user = new User();
    private static UserFun userfun = new UserFun();
    private static List<User> result;
	 private String email;
	 private String password;

@When("the user try to logout")
public void the_user_try_to_logout() {
	userfun.logout();
}
@Then("the user will logout")
public void the_user_will_logout() {
    logger.log(Level.INFO, "logout success! ");
    assertEquals(true, UserFun.getflag2());




}


}
