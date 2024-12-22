package caraccessories;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class User {

	static Logger logger = Logger.getLogger(firstclass.class.getName());
	
	private String username;	 
	private String email;
	private String password;
	private String userlevel;
	private int userphone;
	private String useraddress;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}
	public int getUserphone() {
		return userphone;
	}
	public void setUserphone(int userphone) {
		this.userphone = userphone;
	}
	
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	public User () {
		 
	}
	
   public User(String username, String email,String password,String userlevel, int userphone , String useraddress) {
   	   this.username = username;
          this.email = email;
          this.password = password;
          this.userlevel = userlevel ; 
          this.userphone = userphone;
          this.useraddress = useraddress;
       
   }
   @Override
   public String toString() {
       return "User{" +
               "username='" + username + '\'' +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", userlevel='" + userlevel + '\'' +
               ", userphone='" + userphone + '\'' +
               ", useraddress='" + useraddress + '\'' +
               '}';
   }
   
}
