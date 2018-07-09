package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// We put 3 locators only in first column (MyMoney,FamilyAlbum,ScreenSaver) in
	// List
	@FindBy(xpath = "//table[@class='ProductsTable']/tbody/tr/td[1]")
	public List<WebElement> productNamesColumn;

	// we put all rows with price and discounts in List
	@FindBy(xpath = "//table[@class='ProductsTable']/tbody/tr")
	public List<WebElement> productsRows;
}
