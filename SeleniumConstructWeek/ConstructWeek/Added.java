package ConstructWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Added {
	 WebDriver driver;
		public Added(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			
			// Initializ driver using this keyword as reference
			this.driver = driver;
			
			// Use pageFactory and initiElemen and store driver and this parameter .
			PageFactory.initElements(driver, this);

}
		@FindBy(id = "pd-add-to-bag-btn")
		private WebElement AddBag;
		@FindBy(id = "add-to-wishlist-btn")
		private WebElement Wishlist;
		/**
		 * @return the addBag
		 */
		public WebElement getAddBag() {
			return AddBag;
		}
		/**
		 * @return the wishlist
		 */
		public WebElement getWishlist() {
			return Wishlist;
		}
		
		public void baglist() throws InterruptedException {
			Thread.sleep(2000);
			AddBag.click();
			
		}
		
		public void wish() throws InterruptedException {
			Thread.sleep(2000);
			Wishlist.click();
		}
}
