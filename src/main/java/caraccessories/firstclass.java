package caraccessories;

import java.util.HashMap;
import java.util.Properties;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class firstclass {
	
    private static User user = new User();
    private static UserFun userfun = new UserFun();

    private static Product product = new Product();
    private static ProductFun productfun = new ProductFun();
    
    private static Installer installer = new Installer();
    private static InstallerFun installerfun = new InstallerFun();
    
    private static Installationrequest request = new Installationrequest();
    private static InstallationrequestFun requestfun = new InstallationrequestFun();   

    private static Product result = new Product();
    
    private static boolean e=true ;
	static Logger logger = Logger.getLogger(firstclass.class.getName());
    static Scanner scanner = new Scanner(System.in);
    
	private static int ulevel;
	private static boolean f1= true ;
	private static boolean f2= true ;
	private static boolean f3= true ;
	private static boolean f4= true ;
	private static boolean f5= true ;
	
	public static void function1() throws IOException
	{
		while(true) {
        logger.log(Level.INFO, "Welcome to our Car accessories company. \n");
        logger.log(Level.INFO, "Please choose from the list \n"
        		+ "1. Sign Up \n"
        		+ "2. login \n ");
        int in = scanner.nextInt();
        if (in ==1) {
        	//call fun sign up
           logger.log(Level.INFO, "Enter your data to Sign up \\n");
     	   logger.log(Level.INFO, "Enter your name \\n");
 	       String username = scanner.next();
 	       logger.log(Level.INFO, "Enter your email \\r\\n");
 	       String email1 = scanner.next();
 	       logger.log(Level.INFO, "Enter your password \\n");
 	       String password1= scanner.next();
 	       logger.log(Level.INFO, "Enter user level \\n");
 	       String userlevel = scanner.next();
 	       logger.log(Level.INFO, "Enter user phone \\n");
	       int userphone = scanner.nextInt();
	       logger.log(Level.INFO, "Enter user address \\n");
 	       String useraddress = scanner.next();
 	       List<User> result = userfun.signup(username, email1, password1, userlevel , userphone , useraddress);
 	       
 	       if (result != null) {
 	            System.out.println("User signed up successfully!\n");
 	            userfun.printUserList();
 		        logger.log(Level.INFO, " \n");

 	            function();
 	            
 	        } else {
 	            System.out.println("Try again !");
 	            continue;
 	        }
        }
        else if ( in ==2) {
        	// call fun function to log in 
        	function();
        	
        }
        else {
        	logger.log(Level.INFO, "invaled value .. Please try again \n");
        	continue;     	
        }
		}
	} 

	public static void function() throws IOException 
	{
		int key ;	
		while (true) {
	        logger.log(Level.INFO, "Enter you information toLogin \n");
	        logger.log(Level.INFO, "Enter your email \n");
	        String email = scanner.next();
	        logger.log(Level.INFO, "Enter your password \n");
	        String password = scanner.next();
		    boolean b = userfun.login(email ,password);
		    if (b==false) {
		    	// try again 
		        logger.log(Level.INFO, "try again please \n \n ");
		        continue;	
		    }
		    else if (b==true)
		    {
		    	//call fun to return userlevel
		    	ulevel = userfun.gotopage(email ,password);
		    	if (ulevel == 1) {
		    		//go to admin page 
		    		while (f1) {
			        logger.log(Level.INFO, " you are in admin page \n");
			        logger.log(Level.INFO, " please choose from List: \n"); 
//			        logger.log(Level.INFO, " 1.Create new acount \n"
			        logger.log(Level.INFO, "1. Manage poudect table \n" // first enter the categore 
			        		+ "2. Manage user acconut \n" 
			        		+ "3. log out \n "); /// exit from all  e=false
			        int input = scanner.nextInt();
			           
			           if (input == 1 )
			           {
			        	   while(f2) {
			        		   
			        	   // manage product with categure
			        	   logger.log(Level.INFO, " please choose from List: \n"); 
					        logger.log(Level.INFO, " 1.View product List \n"
					        		+ "2. Add product\n"
					        		+ "3. Delete pruduct \n" // first enter the categore 
					        		+ "4. Search pruduct \n" 
					        		+ "5. Update pruduct \n"
					        		+ "6. Delete Categorie\n "
					        		+ "7. back to admin page \n "); 
					        int input3 = scanner.nextInt();
					        
					        if (input3==1) {
					        	// view product
					        	logger.log(Level.INFO, "Product List");
				                productfun.printProductList();
					        	
					        }
					        if (input3 == 2) {
					        	//call fun add pruduct
					        	logger.log(Level.INFO, "Add product \n"
					        			+ "Please enter product information to add it \n ");
					        	logger.log(Level.INFO, "Enter product id\\n");
					    	    int productid = scanner.nextInt();
					            logger.log(Level.INFO, "Enter product name\\n");
					    	    String productname = scanner.next();
					    	    logger.log(Level.INFO, "Enter product description\\n");
					    	    String productdescription = scanner.next();
					    	    logger.log(Level.INFO, "Enter product categorie \\r\\n");
					    	    String productcategorie = scanner.next();
					    	    logger.log(Level.INFO, "Enter product price\\r\\n");
					    	    int productprice = scanner.nextInt();
					    	    logger.log(Level.INFO, "uplode images \\n");
					    	    String productimage = scanner.next();
					    	    logger.log(Level.INFO, "enter the  availability \\n");
					    	    String productavailability= scanner.next();
					    	    
					    	    List<Product> result = productfun.addproduct(productid, productname, productdescription, productcategorie, productprice, productimage, productavailability);
					    	    if (result != null) {
					                System.out.println("Product added successfully!\n");
					                productfun.printProductList();
					                continue;
					            } else {
					                System.out.println("Try again !\n");
					                continue;
					            }
					        }
					        else if (input3 == 3) {
					        	//call fun delete product	
					        	 logger.log(Level.INFO, "Enter product id to delete it \\n");
						    	 int productiddelete = scanner.nextInt();
						    	 boolean d= productfun.deleteproduct(productiddelete);
						    	 if (d==false) {
						        	 logger.log(Level.INFO, "Try again Please \n");
						        	 continue;
						    	 }
						    	 else if (d==true){
						    		 System.out.println("Product deleted successfully!\n");
						                productfun.printProductList();
						                continue;
						    	 }
					        }
					        else if (input3 == 4) {
					        	//call fun search product
					        	logger.log(Level.INFO, "Enter product name to search \\n");
					    	    String productname = scanner.next();
					    	    
					    	    
					    	    List<Product> result = productfun.searchProduct(productname);

					            if (result != null) {
					                System.out.println("Matching products found:");
					                for (Product product : result) {
					                    System.out.println(product.toString());
					                }
					                continue;
					            } else {
					                System.out.println("No matching products found.");
					                continue;
					            }
					    	    	
					        }
					        else if (input3 == 5) {
					        	//call fun update product	
					        	logger.log(Level.INFO, "update Product\n");
//					        			+ "Please enter the information to update product \n ");
					        	logger.log(Level.INFO, "Enter old product id to update it  \n");
					    	    int oldproductid = scanner.nextInt();
					    	    logger.log(Level.INFO, "Enter new product id \n");
					    	    int productid = scanner.nextInt();
					            logger.log(Level.INFO, "Enter product name \n");
					    	    String productname = scanner.next();
					    	    logger.log(Level.INFO, "Enter product description \n");
					    	    String productdescription = scanner.next();
					    	    logger.log(Level.INFO, "Enter product categorie \n");
					    	    String productcategorie = scanner.next();
					    	    logger.log(Level.INFO, "Enter product price \n");
					    	    int productprice = scanner.nextInt();
					    	    logger.log(Level.INFO, "uplode images\n");
					    	    String productimage = scanner.next();
					    	    logger.log(Level.INFO, "enter the  availability \n");
					    	    String productavailability= scanner.next();
					    	    List<Product> result = productfun.updateProduct(productid, productname, productdescription, productcategorie, productprice, productimage, productavailability , oldproductid);
					    	    if (result != null) {
					                System.out.println("Product updated successfully! \n ");
					                for (Product product : result) {
					                    System.out.println(product.toString());
					                }
					                continue;
					            } else {
					                System.out.println("Product not found for update.\n");
					                continue;
					            }
					    	    
			        	   }
					        else if (input3 ==6){
					        	//call fun delete categoire	
					        	 logger.log(Level.INFO, "Enter product categoire to delete it \\n");
						    	 String productcategoriedelete = scanner.next();
						    	 boolean d= productfun.deletecategorie(productcategoriedelete);
						    	 if (d==false) {
						        	 logger.log(Level.INFO, "Try again Please \n");
						        	 continue;
						    	 }
						    	 else if (d==true){
						    		 System.out.println("Categorie deleted successfully!\n");
						                productfun.printProductList();
						                continue;
						    	 }
					        	
					        	
					        }
					        else if (input3==7) {
				                f2=false;
					        }
					        else {
				                System.out.println(" invaled value \n"
				                		+ "Plese try again \n \n ");
					        	f2=false;
					        }
					        
			        	   }
			           }
					       			    	       
//////////////////////////////////////////////////////////////////	
//			        	   }
			           else if (input == 2 )
			           {
			        	   // manage user acount
			        	   //delete or update user 
			        	   while(f3) {
			        		   
				        	   logger.log(Level.INFO, " please choose from List: \n"); 
						        logger.log(Level.INFO, " 1.Delete user \n"
						        		+ "2. Update user \n" 
						        		+ "3. back to admin page \n "); 
						        int input4 = scanner.nextInt();
						        if (input4==1) {
						        	// call delete user fun
						        	logger.log(Level.INFO, "Enter User email to delete it \\n");
							    	 String useremaildelete = scanner.next();
							    	 boolean d= userfun.deleteuser(useremaildelete);
							    	 if (d==false) {
							        	 logger.log(Level.INFO, "Try again Please \n");
							        	 continue;
							    	 }
							    	 else if (d==true){
							    		 System.out.println("User deleted successfully!\n");
							                userfun.printUserList();
							                continue;
							    	 }
						        }
						        else if ( input4 ==2) {
						        	// call update user
						        	logger.log(Level.INFO, "Please enter the information to update user \n ");
						        	logger.log(Level.INFO, "Enter old email \\r\\n");
							  	       String oldemail = scanner.next();
						        	logger.log(Level.INFO, "Enter your name \\n");
							  	       String username = scanner.next();
							  	       logger.log(Level.INFO, "Enter your email \\r\\n");
							  	       String email1 = scanner.next();
							  	       logger.log(Level.INFO, "Enter your password \\n");
							  	       String password1= scanner.next();
							  	       logger.log(Level.INFO, "Enter user level \\n");
							  	       String userlevel = scanner.next();
							  	       logger.log(Level.INFO, "Enter user phone \\n");
							 	       int userphone = scanner.nextInt();
							 	       logger.log(Level.INFO, "Enter user address \\n");
							  	       String useraddress = scanner.next();
							  	       List<User> result = userfun.updateUser(username, email1, password1, userlevel , userphone , useraddress ,oldemail);
							  	       if (result != null) {
							                System.out.println("User updated successfully! \n ");
							                for (User user : result) {
							                    System.out.println(user.toString());
							                }
							                continue;
							            } 
							  	       else if(result ==null) {
							                System.out.println("User not found for update.\n");
							                continue;
							            }
						        	
						        }
						        else if (input4==3) {
					                f3=false;
						        }
						        else {
					                System.out.println(" invaled value \n"
					                		+ "Plese try again \n \n ");
						        	f3=false;
						        }
			        	   
			           }
			           }
			           
			           
/////////////////////////////////////////////////////////////
			           else if (input == 3)
			           {
			        	   // call fun to log out
			        	   userfun.logout();
			        	   f1=false;
			        	   
			           }
			           else { 
			        	   //////
				        	logger.log(Level.INFO, "invalid value \n "
				        			+ "Please try again \n \n ");
				        	continue;

			           }
		    		}
		    	} 
		    	
		    	
//////////////////////////////////////////////////////////////////////
//custumer 
		    	else if (ulevel == 2) {
		    		while(f4)
		    		{
		    		// go to customer page 
		    		 logger.log(Level.INFO, " you are in Custumer page \n");
				        logger.log(Level.INFO, " please choose from List: \n"); 
				        logger.log(Level.INFO, " 1. View product and make purcheses \n" //view and buy 
				        		+ "2. view order List \n"
				        		+ "3. edit profile \n"
				        		+ "4. request installation aervice's \n "
				        		+ "5. log out \n "); 
			        int input2 = scanner.nextInt();
			        if (input2 == 1) {
			            // Call function to view products and buy
			            logger.log(Level.INFO, "This is Product List \n");
			            productfun.printProductList();

			            // Use a flag to control the loop
			            boolean continueBuying = true;

			            while (continueBuying) {
			                logger.log(Level.INFO, "\n Please enter the product id to buy it \n"
			                        + "or enter 'done' if you are finished \n ");

			                if (scanner.hasNextInt()) {
			                    int input5 = scanner.nextInt();
			                    List<Product> result = productfun.makepurchases(input5);
			                    
			                } else {
			                    String doneInput = scanner.next();
			                    if ("done".equalsIgnoreCase(doneInput)) {
			                        // User is finished buying
			                        logger.log(Level.INFO, "Your order List is: \n");
			                        productfun.printOrderList();
			                        continueBuying = false;
			                        continue;
			                    } else {
			                        logger.log(Level.INFO, "Invalid input. Please enter a product ID or 'done'.");
			                        continue;
			                    }
			                }
			            }
			        }
			        else if (input2 == 2 )
			        {
			        	// view order
				    	boolean d= productfun.isOrderListEmpty();
                        
                        if (d) {
                            System.out.println("The order list is empty.\n"
                            		+ "Please first purchase product !");
                            continue;
                        } else {
                          //  System.out.println("The order list is not empty.");
                            logger.log(Level.INFO, "Your order List is: \n");
                        	productfun.printOrderList();
    			        	continue;               
                        }
			        }
			        else if (input2 == 3 )
			        {
			        	// edit profile
			        	//update function
			        	logger.log(Level.INFO, "Please enter the information to update you acount \n ");
			        	logger.log(Level.INFO, "Enter your new name \\n");
				  	       String username = scanner.next();
				  	       logger.log(Level.INFO, "Enter your new email \\r\\n");
				  	       String email1 = scanner.next();
				  	       logger.log(Level.INFO, "Enter your new password \\n");
				  	       String password1= scanner.next();
				  	       logger.log(Level.INFO, "Enter your new phone \\n");
				 	       int userphone = scanner.nextInt();
				 	       logger.log(Level.INFO, "Enter your new address \\n");
				  	       String useraddress = scanner.next();
				  	       List<User> result = userfun.updateUser(username, email1, password1, "CUSTOMER" , userphone , useraddress , email);
				  	       if (result != null) {
				                System.out.println("User updated successfully! \n ");
				                for (User user : result) {
				                    System.out.println(user.toString());
				                }
				                continue;
				            } 
				  	       else if(result ==null) {
				                System.out.println("User not found for update.\n");
				                continue;
				            }
			        } 
			        else if (input2 == 4 )
			        {
			        	// request installation aervice's
			        	productfun.printProductList();
			        	logger.log(Level.INFO, "\n Please choose product id \n ");
			        	int id=scanner.nextInt();
			        	//return product name
			    	    String reqproductname = productfun.getproductname1(id);
			        	installerfun.printInstallerList();
			        	logger.log(Level.INFO, "\n Please choose installation requset number \n ");
			        	int requestnumber=scanner.nextInt();   	
			        	/// return appointment
			        	String installername = installerfun.getinstallername1(requestnumber);
			        	String installerday = installerfun.getinstallerday1(requestnumber);
			        	String installermonth = installerfun.getinstallermonth1(requestnumber);
			        	int installerhour = installerfun.getinstallerhour1(requestnumber);			        	
			        	//return costumer name 
			    	    String costumername = userfun.getusername1(email);
			        	List<Installationrequest> result =requestfun.request(requestnumber, installername,id, reqproductname, installername, installerday, installermonth, installerhour);
			    	    if (result != null) {
			                System.out.println("your request successfully!\n");
			                requestfun.printRequestList();
			                continue;
			            } else {
			                System.out.println("Try again !\n");
			                continue;
			            }   
			        }
			        else if (input2 == 5 )
			        {
			        	// call fun to log out
			        	userfun.logout();
			        	   f4=false;
			        }
			        else { 
			        	   //////
				        	logger.log(Level.INFO, "invalid value \n "
				        			+ "Please try again \n \n ");
				        	continue;

			           }
		    	}
		    	}
			        
//////////////////////////////////////
//instullar 
		    	else if (ulevel == 3) {
		    		// go to instulaar page 
		    		while(f5) {
		    		logger.log(Level.INFO, " you are in Inataller page \n");
			        logger.log(Level.INFO, " please choose from List: \n"); 
			        logger.log(Level.INFO, " 1.schedule appointments. \n"
			        		+ "2. View installation requests \n" 
			        		+ "3. log out "); 
			        int input3 = scanner.nextInt();
			           if (input3 == 1 )
			           {
			        	   // schedule appointments.
				    		logger.log(Level.INFO, "Please Enter your Available day \n");
				    	    String installerday = scanner.next();
				    	    logger.log(Level.INFO, "Enter the month \n");
				    	    String installermonth = scanner.next();
				    	    logger.log(Level.INFO, "Enter hour\n");
				    	    int installerhour = scanner.nextInt();
				    	    String installeremail =email;
				    	    String installername = userfun.getusername1(email);
				    	    List<Installer> result = installerfun.scheduleappointments(installername, installeremail, installerday, installermonth, installerhour);
				    	    if (result != null) {
				                System.out.println("your schedule appointment successfully!\n");
				                installerfun.printInstallerList();
				                continue;
				            } else {
				                System.out.println("Try again !\n");
				                continue;
				            }
			           }
			           else if (input3 == 2 )
			           {
			        	   // View installation requests
			        	   requestfun.printRequestList();
			        	   continue;
			           }
			           else if (input3 == 3 )
			           {
			        	   // call fun to log out
			        	 	userfun.logout();
				        	   f5=false;
				        }
				        else { 
					        	logger.log(Level.INFO, "invalid value \n "
					        			+ "Please try again \n \n ");
					        	continue;
			           } 
		    		}
		    	}
		    }   
		}
	}
	

public static void main(String[] args) throws IOException  
{
	
	function1();

}
}
