 package ConstructWeek;

import javax.management.loading.PrivateClassLoader;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		// Initializ driver using this keyword as reference
		this.driver = driver;
		
		// Use pageFactory and initiElemen and store driver and this parameter .
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	

	// Now use @findby and initialize using the webElement and then private webelement keywords.
	@FindBy(xpath = "//*[@id=\"navMid\"]/div[1]/button[1]")
	private WebElement clickmen;
	
	@FindBy(className = "loginbtn")
	private WebElement loginbtn;
	
	@FindBy(className = "signup-name")
	private WebElement signName;
	
	@FindBy(className = "signup-username")
	private WebElement username;
	
	@FindBy (className = "signup-password")
	private WebElement password;
	
	@FindBy(className = "signup-email")
	private WebElement email;
	
	@FindBy(className = "signup-number")
	private WebElement number;
	
	@FindBy(className = "signup-btn")
	private WebElement singupbtn;
	
	@FindBy(className = "login-username")
	private WebElement usernamelogin;
	
	@FindBy(className = "login-password")
	private WebElement passwordfill;
	
	@FindBy(className = "login-btn")
	private WebElement loginbuttons;
	/**
	 * @return the clickmen
	 */
	public WebElement getClickmen() {
		return clickmen;
	}
	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	/**
	 * @return the signName
	 */
	public WebElement getSignName() {
		return signName;
	}
	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}
	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}
	/**
	 * @return the number
	 */
	public WebElement getNumber() {
		return number;
	}
	/**
	 * @return the singupbtn
	 */
	public WebElement getSingupbtn() {
		return singupbtn;
	}
	/**
	 * @return the usernamelogin
	 */
	public WebElement getUsernamelogin() {
		return usernamelogin;
	}
	/**
	 * @return the passwordfill
	 */
	public WebElement getPasswordfill() {
		return passwordfill;
	}
	public WebElement logedin() {
		return loginbuttons;
	}
	
	
	

	public void loginpage(String name, String username2,String password2, String email2, String number2) throws InterruptedException {
		//clickmen.click();
		loginbtn.click();
		signName.sendKeys(name);
		username.sendKeys(username2);
		password.sendKeys(password2);
		email.sendKeys(email2);
		number.sendKeys(number2);
		singupbtn.click();
	
		
		
	}
	public void alertsHandle() throws InterruptedException {
		
		Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 alert.accept(); // Accept the alert
		// singupbtn.click();
//		 Thread.sleep(2000);
//		Alert alt1 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt1.accept();
		}
	
	public void userfield(String usernamelogin1,String password1) throws InterruptedException {
		Thread.sleep(20000);
		usernamelogin.sendKeys(usernamelogin1);
		passwordfill.sendKeys(password1);
		loginbuttons.click();
		
		
		
	}

}
