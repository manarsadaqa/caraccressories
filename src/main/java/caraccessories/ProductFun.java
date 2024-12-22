package caraccessories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductFun {
	static Logger logger = Logger.getLogger(ProductFun.class.getName());
	private static List<Product> productList = new ArrayList<>();
	private static List<Product> orderList = new ArrayList<>();
	private static boolean flag1 = false;
	private static boolean flag2 = false;
	private static boolean flag3 = false;
	private static boolean flag4 = false;
	private static boolean flag5 = false;
	private static boolean flag6 = false;
	private static boolean flag7 = false;
	private static boolean isSented =false ; 

	private static String valied = "valied";
	private static String exterior = "exterior";

	
	public static boolean getflag1() {
		return flag1;
	}
	public static boolean getflag2() {
		return flag2;
	}
	public static boolean getflag3() {
		return flag3;
	}
	public static boolean getflag4() {
		return flag4;
	}
	public static boolean getflag5() {
		return flag5;
	}
	public static boolean getflag6() {
		return flag6;
	}
	public static boolean getflag7() {
		return flag7;
	}
	public static boolean getisSented() {
		return isSented;
	}
	
	
	static {
		Product product1 = new Product(1,"vehicle engine","strong vehicle engine", "interior",1000,"C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg",valied);
		Product product2 = new Product(2,"vehicl door","strong vehice door", exterior,100,"C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\door.jpg",valied);
		Product product3 = new Product(3, "car radio","strong car radio", "Electronics",150, "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\radio.jpg",valied);
		Product product4 = new Product(9, "car maicrophone","strong car maicrophone", "Electronics",150, "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\Micro.jpg",valied);
		Product product5 = new Product(10, "car maicro","strong car maicrophone", exterior,150, "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\Micro1.jpg",valied);
		Product product6 = new Product(11, "car maicro","strong car maicrophone2", exterior,150, "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\Micro2.jpg",valied);
		Product product7 = new Product(12, "maicro","strong car maicrophone3", "Electronic",150, "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\Micro3.jpg",valied);

		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		productList.add(product6);
		productList.add(product7);

		
	}
		
	public static List<Product> addproduct(int productid , String productname, String productdescription, String productcategorie, int productprice,
	String productimage, String productavailability){
		
		for (Product product : productList) {
            if (product.getProductid() == productid) {
      	       logger.log(Level.INFO, "This Product already exists.");
                return Collections.emptyList();
            }
        }
		
		String productnamelower = productname.toLowerCase();
		String productdescriptionlower = productdescription.toLowerCase();
		String productcategorielower = productcategorie.toLowerCase();
		String productimagelower = productimage.toLowerCase();
		String productavailabilitylower = productavailability.toLowerCase();
		productList.add(new Product (productid, productnamelower,productdescriptionlower,productcategorielower,productprice,
				 productimagelower, productavailabilitylower));
		flag1=true; 
		return productList;
	}
	
	
	public String getproductname1(int productid) {
		String productname;
		for (Product product : productList) {
		
			if ( productid == product.getProductid()) {
			productname=product.getProductname();
			return productname;
			}
		}
        logger.info("This Product already does not exists.");
		return null;
	}
	
	
	public static void printProductList() {
        logger.info("Product List:");
        for (Product product : productList) {
            logger.info(product.toString());
        }
        flag7=true;
    }
	
	
	public static boolean deleteproduct (int productid){
		for (Product product : productList) {
            if (product.getProductid() == productid) {
            	productList.remove (product);
            	flag3=true;
                return true; 
            }
         
        }
        logger.info("This Product already not exist.");
		return false;
		
	}
	
	public static boolean deletecategorie (String productcategorie){
		for (Product product : productList) {
            if ( productcategorie.equals(product.getProductcategorie()) ) {
            	productList.remove (product);
            	flag2=true;
                return true; 
            }
         
        }
        logger.info("This Product already not exist.");
        flag2=false;
		return false;
		
	}
	
	public static List<Product> searchProduct(String productname) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : productList) {
            if (productname.equals(product.getProductname())) {
                matchingProducts.add(product);
                flag5=true;
            }
        }

        return matchingProducts.isEmpty() ? null : matchingProducts;
    }
		
	public static List<Product> updateProduct(int productid, String newProductName, String newProductDescription, String newProductCategorie,
            int newProductPrice, String newProductImage, String newProductAvailability ,int oldproductid) {
		for (Product product : productList) {
			if (product.getProductid() == oldproductid) {
				product.setProductid(productid);
			product.setProductname(newProductName);
			product.setProductdescription(newProductDescription);
			product.setProductcategorie(newProductCategorie);
			product.setProductprice(newProductPrice);
			product.setProductimage(newProductImage);
			product.setProductavailability(newProductAvailability);
			flag6=true;
			return productList; 
			}
			}
		return Collections.emptyList();
		}
	
	
	public static List<Product> makepurchases(int productid) {
	    // Check if the product exists in the productList
	    boolean productExists = false;
	    for (Product product : productList) {
	        if (product.getProductid() == productid) {
	            productExists = true;
	            break;
	        }
	    }

	    if (!productExists) {
	        logger.info("This Product does not exist.");
	        flag4=false;
	        return Collections.emptyList();
	    }

	    // If the product exists, add it to the orderList
	    for (Product product : productList) {
	        if (product.getProductid() == productid) {
	            orderList.add(new Product(productid, product.getProductname(), product.getProductdescription(),
	                    product.getProductcategorie(), product.getProductprice(), product.getProductimage(),
	                    product.getProductavailability()));
	            flag4=true;
	            logger.info("done .. add it to order list ");
		        sendOrderConfirmationEmail(product.getProductname(), product.getProductprice());
	            return orderList;
	        }
	    }

	    // This part will only be reached if there's an issue with the loops
	    return Collections.emptyList();
	}
	

	public static boolean isOrderListEmpty() {
        return orderList.isEmpty();
    }

	
	
	public static void printOrderList() {
        logger.info("Order List:");
        for (Product product : orderList) {
            logger.info(product.toString());
        }
    }
	
	public static void sendOrderConfirmationEmail(String productName , int totalPrice) {
		String from = "s12027821@stu.najah.edu";
		String to = "s12011151@stu.najah.edu";
		
		String subject = "Order Confirmation";
		String messageText = " Thank you for your order! \n \n "
				+ "Product Name :"+ productName + "\n"
				+" Price :" + totalPrice +"$" + "\n \n" 
				+ " We appreciate your business.";
		isSented=true; 
		EmailSender.sendEmail(from, to, subject, messageText);
		
				}
	
}
