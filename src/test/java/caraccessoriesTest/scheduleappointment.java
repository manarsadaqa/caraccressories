package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;

import caraccessories.Installer;
import caraccessories.InstallerFun;
import caraccessories.ProductFun;
import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scheduleappointment {
    private Installer installer = new Installer();
    private static InstallerFun installerfun = new InstallerFun();
    private static List<Installer> result;
    
    @Given("Given the installer is already logged in with email {string} and password {string}")
    public void given_the_installer_is_already_logged_in_with_email_and_password(String string, String string2) {
    	UserFun.gotopage(string, string2);
    }

	
	@When("I try to add a appointmant with installername {string} and installeremail {string} and installerday {string} and installermonth {string} and installerhour {int}")
	public void i_try_to_add_a_appointmant_with_installername_and_installeremail_and_installerday_and_installermonth_and_installerhour(String string, String string2, String string3, String string4, Integer int1) {
		result = installerfun.scheduleappointments(string, string2, string3, string4, int1);
	    
	}
	@Then("I will add the installer appointment with email {string}")
	public void i_will_add_the_installer_appointment_with_email(String string) {
	    assertEquals(true, InstallerFun.getflag1());

		 //assertTrue(installerfun.getinstalleremail1(string)!=null);
		 installerfun.printInstallerList();

	}

}
