package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.ProductFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class searchproductTest {
	
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();

    private static List<Product> result;
	private int productid;
	private boolean s;
	//public Product result = new Product();

	@Given("there is a product with name {string}")
	public void there_is_a_product_with_name(String string) {
		System.out.println("..");
		
	}
	@When("I search with {string}")
	public void i_search_with(String string) {
	     result = productfun.searchProduct(string);

	}
	@Then("{int} product should have been found with name {string}")
	public void product_should_have_been_found_with_name(Integer int1, String string) {
	    assertEquals(true,ProductFun.getflag5());

		//assertTrue(ProductFun.getflag5()==true);

	   //  assertTrue(productfun.getproductname1(string)!=null);		
		
	}

	}


