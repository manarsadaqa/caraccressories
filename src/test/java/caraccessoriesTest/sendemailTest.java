package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import caraccessories.ProductFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sendemailTest {
	@When("order is complete with produtname {string} and price {int}")
	public void order_is_complete_with_produtname_and_price(String string, Integer int1) {
		ProductFun.sendOrderConfirmationEmail(string, int1);
	}
	@Then("Send email")
	public void send_email() {
	    assertEquals(true,ProductFun.getisSented());

	//	assertTrue(ProductFun.getisSented()==true);


	}

}
