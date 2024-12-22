package caraccessories;

import java.util.logging.Logger;

public class Installer {

	static Logger logger = Logger.getLogger(Installer.class.getName());
	
	private String installername;	 
	private String installeremail;
	private String day ;
	private String month;
	private int hour;
	public String getInstallername() {
		return installername;
	}
	public void setInstallername(String installername) {
		this.installername = installername;
	}
	public String getInstalleremail() {
		return installeremail;
	}
	public void setInstalleremail(String installeremail) {
		this.installeremail = installeremail;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Installer() {
		
	}
	
	public Installer(String installername ,String installeremail ,String day , String month , int hour) {
		this.installername=installername;
		this.installeremail = installeremail;
		this.day=day;
		this.month=month;
		this.hour=hour;
		
		
	}
	
	@Override
    public String toString() {
        return 
                "installername='" + installername + '\'' +
                ", installeremail='" + installeremail + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", hour=" + hour +
                '}';
    }

}
