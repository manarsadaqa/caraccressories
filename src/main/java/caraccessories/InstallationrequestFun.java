package caraccessories;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstallationrequestFun {
	
	static Logger logger = Logger.getLogger(InstallationrequestFun.class.getName());
	private static List<Installationrequest> requestList = new ArrayList<>();
	private static boolean flag1 = false;

	public static boolean getflag1() {
		return flag1;
	}	
	static {
		Installationrequest request1 = new Installationrequest(1,"ali",1,"vehicle engine", "sama","Sunday","14-April",12);
		Installationrequest request2 = new Installationrequest(2,"ali",2,"vehicl door", "sama", "Monday","14-April",2);
		requestList.add(request1);
		requestList.add(request2);
	}
        
	public static List<Installationrequest> request( int requestid  , String reqinstallername,int productid ,String reqproductname, String reqcostumername , String day , String month , int hour ) {
		            requestList.add(new Installationrequest(requestid,reqinstallername,productid ,reqproductname,reqcostumername ,day , month ,hour));
		            logger.log(Level.INFO, "done .. add it to installation Request list");
			        sendEmailConfirmation(reqcostumername,reqproductname);
			        flag1=true;
            return requestList;

	}

	
	public void printRequestList() {
	    if (shouldPrintRequestList()) {
	        logger.log(Level.INFO, "Request List:");
	        for (Installationrequest request : requestList) {
	            logger.info(request.toString());
	        }
	    }
	}

	private boolean shouldPrintRequestList() {

	    return !requestList.isEmpty();
	}
	
	
    public static void sendEmailConfirmation(String customerName, String productName) {
        String from = "s12027821@stu.najah.edu";
        String to = "s12011151@stu.najah.edu";

        String subject = "New Installation Request";
        String messageText = "Dear Installer, \n \n You have a new installation request. \n \n "
                + "Customer:" + customerName + "\n"
                + " Product :" + productName + "$" + "\n \n"
                + "Please check your dashboard for more details.";
        EmailSender.sendEmail(from, to, subject, messageText);
    }
	
	

}
