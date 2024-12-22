package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.Product;
import caraccessories.ProductFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

public class deleteproductTest {
	
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();

    private static List<Product> result;
	private int productid;
	 private boolean d;
	
	@When("delete a product with productid {int}")
	public void delete_a_product_with_productid(Integer int1) {
    d= productfun.deleteproduct(int1);

	}
	@Then("I will found the product with productid as {int}")
	public void i_will_found_the_product_with_productid_as(Integer int1) {
		//true.. delete 
	    assertEquals(true, ProductFun.getflag3());

		//assertTrue(ProductFun.getflag3()==true);

	   //  assertFalse(productfun.getproductid1(int1)!=null);		
		 assertTrue(d);
		 productfun.printProductList();


	}
	
	@When("I try to delte a product with productid {int}")
	public void i_try_to_delte_a_product_with_productid(Integer int1) {
	    d= productfun.deleteproduct(int1);

	}
	@Then("I can't found the product with  a productid {int}")
	public void i_can_t_found_the_product_with_a_productid(Integer int1) {
	    assertEquals(false, ProductFun.getflag2());

		//assertTrue(ProductFun.getflag2()==false);

		//assertFalse(productfun.getproductid1(int1)!=null);		
		assertFalse(d);

	}


}