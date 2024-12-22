package caraccessories;

public class Installationrequest {
	
	private int requestid;	
	private int productid;
	private String reqproductname;
	private String reqinstallername ;
	private String reqcostumername;
	private String day ;
	private String month;
	private int hour;
	
	public Installationrequest(int requestid, String reqinstallername, int productid, String reqproductname, String reqcostumername, String day, String month, int hour) {
	    this.requestid = requestid;
	    this.reqinstallername = reqinstallername;
	    this.productid = productid;
	    this.reqproductname = reqproductname;
	    this.reqcostumername = reqcostumername;  // Corrected this line
	    this.day = day;
	    this.month = month;
	    this.hour = hour;
	}

	public Installationrequest() {
		
	}
    @Override
    public String toString() {
        return "InstallationRequest{" +
                "request id=" + requestid +
                ",installer name='" + reqinstallername + '\'' +
                ", product id=" + productid +
                ",product name='" + reqproductname + '\'' +
                ",costumer name='" + reqcostumername + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", hour=" + hour +
                '}';
    }
}
