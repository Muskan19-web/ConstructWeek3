package ConstructWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class MenPage {
	protected WebDriver driver;
	public MenPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		// Initializ driver using this keyword as reference
		this.driver = driver;
		
		// Use pageFactory and initiElemen and store driver and this parameter .
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	@FindBy(xpath = "//span[.='MEN']")
	private WebElement clickmen;
	

	public WebElement getLoginbtn() {
		return clickmen;
	}
	
	/**
	 * @return the cargo
	 */
	
	public void MenPage() throws InterruptedException {
		Thread.sleep(2000);
		clickmen.click();
		
		
	}
	
	
}



