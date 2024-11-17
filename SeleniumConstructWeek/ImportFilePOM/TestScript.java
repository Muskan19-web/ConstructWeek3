package ImportFilePOM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Category;

import Action.Click;
import ConstructWeek.AddAddressPage;
import ConstructWeek.Added;
import ConstructWeek.Category2;
import ConstructWeek.LoginPage;
import ConstructWeek.MenPage;
import ImportFilePOM.BaseURL;

public class TestScript extends BaseURL {
	LoginPage page;
	MenPage mens;
	Category2 cate;
	Added ad;
	AddAddressPage addpage;
	//The base class should be the parent class for all the test classes.
	@Test(priority = 0)
	public void loginpage() throws InterruptedException {
		page = new LoginPage(driver);
		page.loginpage(real1, real2, real4, real5,real6);
		Thread.sleep(2000);
		// Handle the alert
		
		page.alertsHandle();
		Thread.sleep(4000);
		page.userfield(real7,real8);
		page.alertsHandle();
				
	}
	@Test(priority = 1)
	public void MenPage() throws InterruptedException {
		//Thread.sleep(6000);
		mens = new MenPage(driver);
		mens.MenPage();
		
		
	}
	@Test(priority = 2)
	public void categories() throws InterruptedException {
		cate = new Category2(driver);
		cate.categories();
		cate.Cargo();
		cate.selected();
	}
	@Test(priority = 3)
	public void Adding() throws InterruptedException {
		ad = new Added(driver);
		ad.baglist();
		ad.wish();
		
	}
	@Test(priority = 4)
	public void Address() throws InterruptedException {
		addpage = new AddAddressPage(driver);
		addpage.bagclicked();
		addpage.addressclicked();
		addpage.details(firstname, phoneNumber, pin, city, state,flat,area,marks);
		
	}
	
	
	
	
	

}
