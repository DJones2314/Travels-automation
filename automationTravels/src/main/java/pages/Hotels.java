package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotels {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement selectPage;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[2]/div/a")
	private WebElement london;
	
	public void chooseHotel(WebDriver driver){
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(selectPage));
		selectPage.click();
//		WebElement myDynamicElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(london));
//		london.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
}
