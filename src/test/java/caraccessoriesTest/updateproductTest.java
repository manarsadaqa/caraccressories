package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.ProductFun;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateproductTest {
	
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
	
	
	
	@Given("admin is already logged in")
	public void the_admin_is_already_logged_in() {
		System.out.println("..");

	}

	@When("update a product with a productid {int} and a productname {string} and a productdescription {string} and productcategorie {string} and productprice {int} and productimage {string} and productavailability {string} and oldproductid {int}")
		public void update_a_product_with_a_productid_and_a_productname_and_a_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability_and_oldproductid(Integer int1, String string, String string2, String string3, Integer int2, String string4, String string5, Integer int3) {
			result = productfun.updateProduct(int1, string, string2, string3, int2, string4, string5 , int3);

		}
	@Then("I will found the product with a  productid {int}")
	public void i_will_found_the_product_with_productid(Integer int1) {
	    assertEquals(true,ProductFun.getflag6());

		//assertTrue(ProductFun.getflag6()==true);
		 productfun.printProductList();

//		 for (Product product : result) {
//             System.out.println(product.toString());
//         }
	}
	
	@Given("admin not logged in")
	public void the_admin_not_logged_in() {
		System.out.println("..");

	}


	@When("I try to update a product witha  productid {int} and productname {string} and productdescription {string} and productcategorie {string} and productprice {int} and productimage {string} and productavailability {string} and oldproductid {int}")
	public void i_try_to_update_a_product_witha_productid_and_productname_and_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability_and_oldproductid(Integer int1, String string, String string2, String string3, Integer int2, String string4, String string5, Integer int3) {
		result = productfun.updateProduct(int1, string, string2, string3, int2, string4, string5 , int3);

	}
	@Then("I can't found the product with a productid {int}")
	public void i_can_t_found_the_product_with_a_productid(Integer int1) {
	    assertEquals(false,ProductFun.getflag4());

		//assertTrue(ProductFun.getflag4()==false);

		//assertFalse(productfun.getproductid1(int1)!=null);		
		System.out.println("this product is not exist");


		
	}


}
