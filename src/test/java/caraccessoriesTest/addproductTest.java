package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.Product;
import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;
import java.util.logging.Level;
public class addproductTest {
	
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();

    private static List<Product> result;
	private int productid;
	private String productname;
	private String productdescription; 
	private String productcategorie;
	private String productprice;
	private String productimage; 
	private String productavailability ;	
	 private boolean l;
	
	 @Given("the admin is already logged in with email {string} and password {string}")
	 public void the_admin_is_already_logged_in_with_email_and_password(String string, String string2) {
		 UserFun.gotopage(string, string2);
			System.out.println("..");

	 }
	
	@When("add a product with productid {int} and  productname {string} and productdescription {string} and productcategorie {string} and productprice {int} and productimage {string} and productavailability {string}")
	public void add_a_product_with_productid_and_productname_and_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability(Integer int1, String string, String string2, String string3, Integer int2, String string4, String string5) {
	     result = productfun.addproduct(int1, string, string2, string3, int2, string4, string5);

	}

	@Then("I will found the product with product id {int}")
	public void i_will_found_the_product_with_product_id(Integer int1) {
	    assertEquals(false, ProductFun.getflag1());

	}
	@Given("the admin not logged in")
	public void the_admin_not_logged_in() {
		System.out.println("..");

	}

@When("I try to add a product with productid {int} and productname {string} and productdescription {string} and productcategorie {string} and productprice {int} and productimage {string} and productavailability {string}")
public void i_try_to_add_a_product_with_productid_and_productname_and_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability(Integer int1, String string, String string2, String string3, Integer int2, String string4, String string5) {
    result = productfun.addproduct(int1, string, string2, string3, int2, string4, string5);

}
@Then("I can't found the product with product id {int}")
public void i_can_t_found_the_product_with_product_id(Integer int1) {
    assertEquals(true, ProductFun.getflag1());
    productfun.printProductList();
}





}
