package caraccessories;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.*;

public class UserFun {
	static Logger logger = Logger.getLogger(UserFun.class.getName());
	private static List<User> userList = new ArrayList<>();
	private static boolean flag1 = false;
	private static boolean flag2 = false;
	private static boolean flag3 = false;
	private static boolean flag4 = false;
	private static boolean flag5 = false;
	private static final String ADMIN = "ADMIN";
	private static final String CUSTOMER = "CUSTOMER";
	private static final String INSTALLER = "INSTALLER";

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

	
	static {
		User user1 = new User("manar","manar@gmail.com", "manar",ADMIN,12345,"jenin");
		User user2 = new User("sama","sama@gmail.com", "sama",CUSTOMER, 12345,"jenin");
		User user3 = new User("ali","ali@gmail.com", "ali",INSTALLER, 12345,"nablus");
		User user4 = new User("user4","user4@gmail.com", "user4",INSTALLER, 12345,"Ramallah");
		User user5 = new User("user5","user5@gmail.com", "user5",ADMIN, 12345,"Tubas");
		User user6 = new User("user6","user6@gmail.com", "user6",CUSTOMER, 12345,"nablus");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		
	}
	
	
	public static boolean login(String email, String password) {
		for (User user : userList) {
	        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
		        logger.log(Level.INFO, "login success ! ");
		        flag4=true;
	            return true ;
	        }
	    }
		flag4=false;
		return false;
	}
	
	public static int gotopage(String email, String password) {
		for (User user : userList) {
		    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
		        if (ADMIN.equals(user.getUserlevel())) {
		            return 1;
		        } else if (CUSTOMER.equals(user.getUserlevel())) {
		            return 2;
		        } else {
		            return 3;
		        }
		    }
		}
		return 0;
	}
	public static String getusername1(String email) {
	    for (User user : userList) {
	        if (email.equals(user.getEmail())) {
	            return user.getUsername();
	        }
	    }
	    return null;
	}
	
	public static List<User> signup(String username, String email, String password, String userlevel, int userphone, String useraddress) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
            	logger.log(Level.INFO, "This user already exists. ");
                flag5=false;
                return Collections.emptyList();
            }
        }

        String userlevelupper = userlevel.toUpperCase();
        userList.add(new User(username, email, password, userlevelupper , userphone, useraddress));
        flag5=true;
        return userList;
    }
	
	public void printUserList() {
        logger.info("User List:");
        for (User user : userList) {
            logger.info(user.toString());
        }
    }
	
	public static boolean deleteuser (String useremail){
		for (User user : userList) {
            if ( useremail.equals(user.getEmail()) ) {
            	userList.remove (user);
            	flag1=true;
                return true; 
            }
        }
        logger.info("This User already not exist.");
        flag1=false;
		return false;
		
	}
	
	
	public static List<User> updateUser(String username, String email1, String password, String userlevel, int userphone, String useraddress , String oldemail) {
		for (User user : userList) {
	        String userlevelupper = userlevel.toUpperCase();
			if (oldemail.equals(user.getEmail())) {
		        user.setUsername(username);
				user.setEmail(email1);
				user.setPassword(password);
				user.setUserlevel(userlevelupper);
				user.setUserphone(userphone);
				user.setUseraddress(useraddress);
				flag3=true;
				return userList;
			}
		}
		return Collections.emptyList();
		}
	
	
	
	public static void logout () {
	    logger.log(Level.INFO, "Log out sucess!");
	    flag2=true;

    }
	



}
