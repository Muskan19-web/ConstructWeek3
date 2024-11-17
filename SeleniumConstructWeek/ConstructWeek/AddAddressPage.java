package ConstructWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class AddAddressPage {
	 WebDriver driver;
		public AddAddressPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			
			// Initializ driver using this keyword as reference
			this.driver = driver;
			
			// Use pageFactory and initiElemen and store driver and this parameter .
			PageFactory.initElements(driver, this);
}
		@FindBy(xpath = "/html/body/nav/div[2]/div/div[2]/a[3]/img")
		private WebElement bagclick;
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[6]/button")
		private WebElement clickaddress;
		@FindBy(className = "form-name")
		private WebElement firstname;
		@FindBy(className = "form-mobile")
		private WebElement phoneNumber;
		@FindBy(className = "form-zip")
		private WebElement pincode;
		@FindBy(className = "form-city")
		private WebElement City;
		@FindBy (className = "form-state")
		private WebElement State;
		@FindBy(className = "form-flatno")
		private WebElement flat;
		@FindBy(className = "form-locality")
		private WebElement area;
		@FindBy(css = "[placeholder='Landmark(optional)']")
		private WebElement mark;
		@FindBy(className = "place-order")
		private WebElement finalOrder;
		
		
		
		public WebElement getbagElement() {
			return bagclick;
		}
		public WebElement ClickedAddress() {
			return clickaddress;
			
		}
		public WebElement getFirstname() {
			return firstname;
			
		}
		public WebElement getnumber() {
			return phoneNumber;
			
		}
		public WebElement getpin() {
			return pincode;
			
		}
		public WebElement getcity() {
			return City;
			
		}
		public WebElement getState() {
			return State;
		}
		public WebElement getArea() {
			return flat;
		}
		public WebElement getarea() {
			return area;
		}
		public WebElement getmark() {
			return mark;
		}
		public WebElement getplace() {
			return finalOrder;
		}
		
		
		
		
		public void bagclicked() throws InterruptedException {
			Thread.sleep(2000);
			bagclick.click();
			
		}
		public void addressclicked() throws InterruptedException {
			Thread.sleep(1000);
			clickaddress.click();
			
		}
		
		public void details(String Firstname, String Number, String Pin, String city , String state,String Flat ,String Area, String Mark) throws InterruptedException {
			Thread.sleep(2000);
			firstname.sendKeys("khushi");
			phoneNumber.sendKeys("6723461923");
			pincode.sendKeys("481661");
			City.sendKeys("Mandla");
			State.sendKeys("Madhya Pradesh");
			flat.sendKeys("Mandla MP");
			area.sendKeys("Near By Katra");
			mark.sendKeys("Tample");
			finalOrder.click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept(); 
			
			
		}
}