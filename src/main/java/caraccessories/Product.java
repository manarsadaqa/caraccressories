package caraccessories;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.util.*;


public class Product {
	static Logger logger = Logger.getLogger(firstclass.class.getName());
	
	private int productid;
	private String productname ;
	private String productdescription;	 
	private String productcategorie;
	private int productprice;
	private String productimage; 
	private String productavailability ;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}   

	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	
	public String getProductcategorie() {
		return productcategorie;
	}
	public void setProductcategorie(String productcategorie) {
		this.productcategorie = productcategorie;
	}
	
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	
	public String getProductavailability() {
		return productavailability;
	}
	public void setProductavailability(String productavailability) {
		this.productavailability = productavailability;
	}


	public Product( int productid ,String productname, String productdescription, String productcategorie, int productprice,
			String productimage, String productavailability) {
		this.productid = productid;
		this.productname = productname ;
		this.productdescription = productdescription ;
		this.productcategorie = productcategorie ;
		this.productprice= productprice;
		this.productimage = productimage;
		this.productavailability = productavailability ; 
	}
	public Product() {
	}
	
	
	@Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", productdescription='" + productdescription + '\'' +
                ", productcategorie='" + productcategorie + '\'' +
                ", productprice='" + productprice + '\'' +
                ", productimage='" + productimage + '\'' +
                ", productavailability='" + productavailability + '\'' +
                '}';
    }
	}
	


