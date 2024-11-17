package ConstructWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category2 {
	 WebDriver driver;
	public Category2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		// Initializ driver using this keyword as reference
		this.driver = driver;
		
		// Use pageFactory and initiElemen and store driver and this parameter .
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	@FindBy(xpath = "//*[@id=\'category-name\']/span[2]/i")
	private WebElement category;
	@FindBy(xpath  = "//*[@id=\"category-filter\"]/div[2]/label")
	private WebElement cargo;
	@FindBy(xpath = "//*[@id=\"data-list-wrapper\"]/div[1]/div[2]/div/span[1]")
	private WebElement select;
	/**
	 * @return the category
	 */
	public WebElement getCategory() {
		return category;
	}
	
	public WebElement getCargo() {
		return cargo;
	}
	public WebElement getselect() {
		return select;
		
	}
	public void categories() throws InterruptedException {
		Thread.sleep(5000);
		category.click();
	}
	public void Cargo() throws InterruptedException {
		Thread.sleep(2000);
		cargo.click();
	}
	public void selected() throws InterruptedException {
		Thread.sleep(2000);
		select.click();
		
	}

}
