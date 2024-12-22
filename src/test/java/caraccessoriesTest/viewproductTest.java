package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import caraccessories.ProductFun;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewproductTest {
	
    private static ProductFun productfun = new ProductFun();
    @Given("the customer is already logged in")
    public void the_customer_is_already_logged_in() {
		System.out.println("..");

    }

	@When("the customer choose view product")
	public void the_customer_choose_view_product() {
        productfun.printProductList();
	}
	@Then("the product list is print in the screen")
	public void the_product_list_is_print_in_the_screen() {
	    assertEquals(true, ProductFun.getflag7());

	//	assertTrue(ProductFun.getflag7()==true);


	}
}
