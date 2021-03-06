package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
	WebElement thirdDressRight;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/h1/span[1]")
	WebElement result;
	
	public void getDress() {
		thirdDressRight.click();
	}
	
	public String correctSearch() {
		return result.getText();
	}
	

}
