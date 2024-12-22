package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.InstallationrequestFun;
import caraccessories.Product;
import caraccessories.ProductFun;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class makepurchasesTest {
	
	
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();
    private static List<Product> result;

//	private static List<Product> productList = mydata.listproducts();
	private int productid;
	private String productname;
	private String productdescription; 
	private String productcategorie;
	private String productprice;
	private String productimage; 
	private String productavailability ;	
	 private boolean l;

	 @Given("the customer is already logged in with email {string} and password {string}")
	 public void the_customer_is_already_logged_in_with_email_and_password(String string, String string2) {
		 UserFun.gotopage(string, string2);
	 }

	@When("purchase a product with product id {int}")
	public void purchase_a_product_with_product_id(Integer int1) {
	     result = productfun.makepurchases(int1);
	}
	@Then("I will found the product with product id as {int}")
	public void i_will_found_the_product_with_product_id_as(Integer int1) {
	    assertEquals(true,ProductFun.getflag4());

	//	assertTrue(ProductFun.getflag4()==true);

	//	 assertTrue(productfun.getproductid1(int1)!=null);
		// productfun.printOrderList();

	}
	@When("I try to purchase a product with product id {int}")
	public void i_try_to_purchase_a_product_with_product_id(Integer int1) {
	    result = productfun.makepurchases(int1);
	}
	@Then("I can't found the product with  a product id {int}")
	public void i_can_t_found_the_product_with_a_product_id(Integer int1) {
	    assertEquals(false,ProductFun.getflag4());

		//assertTrue(ProductFun.getflag4()==false);

		//assertFalse(productfun.getproductid1(int1)!=null);
		// productfun.printProductList();
	}


}
